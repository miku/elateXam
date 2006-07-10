/*

Copyright (C) 2006 Steffen Dienst

This program is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 2 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
*/
package de.thorstenberger.taskmodel.view;

import java.util.Iterator;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import de.thorstenberger.taskmodel.MethodNotSupportedException;
import de.thorstenberger.taskmodel.complex.ParsingException;
import de.thorstenberger.taskmodel.complex.complextaskhandling.CorrectionSubmitData;
import de.thorstenberger.taskmodel.complex.complextaskhandling.SubmitData;
import de.thorstenberger.taskmodel.complex.complextaskhandling.submitdata.PaintSubmitData;
import de.thorstenberger.taskmodel.complex.complextaskhandling.subtasklets.SubTasklet_Paint;

public class SubTaskView_Paint extends SubTaskView {

	private SubTasklet_Paint paintSubTasklet;

	public SubTaskView_Paint(SubTasklet_Paint paintSubTasklet) {
		this.paintSubTasklet=paintSubTasklet;
	}

	/**
	 * @see de.thorstenberger.uebman.services.student.task.complex.SubTaskView#getRenderedHTML(int)
	 */
	public String getRenderedHTML( HttpServletRequest request, int relativeTaskNumber) {
		return getRenderedHTML( request, relativeTaskNumber, false );
	}
	
	public String getRenderedHTML( HttpServletRequest request, int relativeTaskNumber, boolean corrected) {
		StringBuffer ret = new StringBuffer();
		
		// workaround: textarea nicht disabled
		corrected = false;
		
		ret.append("<div align=\"center\">\n");
		ret.append("<applet name=\"drawTask_" + relativeTaskNumber + "\" codebase=\"");
		ret.append(request.getContextPath()).append("/drawTask\" code=\"drawing/DrawingApplet.class\" archive=\"drawtask-1.0.jar\" width=600 height=400 mayscript>\n");
		ret.append("<param name=\"foregroundString\" value=\"").append( paintSubTasklet.getMutablePictureString()).append("\">\n");
		ret.append("<param name=\"backgroundString\" value=\"").append( paintSubTasklet.getBackgroundPictureString()).append("\">\n");
		ret.append("</applet>\n");
		ret.append("<textarea name=\"task[" + relativeTaskNumber + "].text\" cols=\"" +
						paintSubTasklet.getTextFieldWidth() + "\" rows=\"" + paintSubTasklet.getTextFieldHeight() + "\" onChange=\"setModified()\"" +
						( corrected ? "disabled=\"disabled\"" : "" ) + ">\n");
		ret.append( paintSubTasklet.getTextualAnswer() );
		ret.append("</textarea>\n");
		ret.append("</div>\n");
		
		ret.append( "<input type=\"hidden\" id=\"task_" + relativeTaskNumber + ".image\" name=\"task[" + relativeTaskNumber + "].image\">\n" );
		ret.append( "<script type=\"text/javascript\">\n" );
		ret.append( " var preSave_task_" + relativeTaskNumber + " = function(){\n" );
		ret.append( "alert( document.applets[\"drawTask_" + relativeTaskNumber + "\"].getForegroundPicture() );" );
		ret.append( " document.getElementById(\"task_" + relativeTaskNumber + ".image\").value = document.applets[\"drawTask_" + relativeTaskNumber + "\"].getForegroundPicture();\n" );
		ret.append( "};\n" );
		ret.append( "preSaveManager.registerCallback( preSave_task_" + relativeTaskNumber + " );\n" );
		ret.append( "</script>\n" );
		
		return ret.toString();
		
	}

	@Override
	public String getCorrectedHTML(HttpServletRequest request) {
		return getRenderedHTML( request, -1, true );
	}

	@Override
	public String getCorrectionHTML(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SubmitData getSubmitData(Map postedVarsForTask)
			throws ParsingException {

		Iterator keyIt = postedVarsForTask.keySet().iterator();
		String pictureString = null;
		String textString = null;
		
		while( keyIt.hasNext() ){
			String key = (String)keyIt.next();
			if( getMyPart( key ).equals( "image" ) ){
				pictureString = (String)postedVarsForTask.get( key );
			}else if( getMyPart( key ).equals( "text" ) ){
				textString = (String)postedVarsForTask.get( key );
			}
		}
		
		return new PaintSubmitData(pictureString,textString);
	}

	@Override
	public CorrectionSubmitData getCorrectionSubmitData(Map postedVars)
			throws ParsingException, MethodNotSupportedException {
		// TODO Auto-generated method stub
		return null;
	}

}
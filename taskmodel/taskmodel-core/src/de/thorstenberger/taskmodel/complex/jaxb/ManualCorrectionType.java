//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-01/24/2006 06:08 PM(kohsuke)-fcs 
// 	See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 	Any modifications to this file will be lost upon recompilation of the source schema. 
// 	Generated on: 2009.01.15 um 08:53:44 GMT+01:00 
//


package de.thorstenberger.taskmodel.complex.jaxb;


/**
 * Java content class for manualCorrectionType complex type.
 * 	<p>The following schema fragment specifies the expected 	content contained within this java content object. 	(defined at file:/home/raporu/software/java/workspace/elatePortal/taskmodel-core/jaxb/complexTaskHandling.xsd line 191)
 * <p>
 * <pre>
 * &lt;complexType name="manualCorrectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="corrector" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="points" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface ManualCorrectionType {


    /**
     * Gets the value of the corrector property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getCorrector();

    /**
     * Sets the value of the corrector property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setCorrector(java.lang.String value);

    boolean isSetCorrector();

    void unsetCorrector();

    /**
     * Gets the value of the points property.
     * 
     */
    float getPoints();

    /**
     * Sets the value of the points property.
     * 
     */
    void setPoints(float value);

    boolean isSetPoints();

    void unsetPoints();

}

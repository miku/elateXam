//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-01/24/2006 06:08 PM(kohsuke)-fcs 
// 	See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 	Any modifications to this file will be lost upon recompilation of the source schema. 
// 	Generated on: 2009.01.15 um 08:53:44 GMT+01:00 
//


package de.thorstenberger.taskmodel.complex.jaxb.impl;

public class ComplexTaskDefImpl
    extends de.thorstenberger.taskmodel.complex.jaxb.impl.ComplexTaskDefTypeImpl
    implements de.thorstenberger.taskmodel.complex.jaxb.ComplexTaskDef, java.io.Serializable, com.sun.xml.bind.RIElement, com.sun.xml.bind.JAXBObject, de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.UnmarshallableObject, de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.XMLSerializable, de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.ValidatableObject
{

    private final static long serialVersionUID = 1L;
    public final static java.lang.Class version = (de.thorstenberger.taskmodel.complex.jaxb.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (de.thorstenberger.taskmodel.complex.jaxb.ComplexTaskDef.class);
    }

    public java.lang.String ____jaxb_ri____getNamespaceURI() {
        return "http://complex.taskmodel.thorstenberger.de/complexTaskDef";
    }

    public java.lang.String ____jaxb_ri____getLocalName() {
        return "complexTaskDef";
    }

    public de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.UnmarshallingEventHandler createUnmarshaller(de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.UnmarshallingContext context) {
        return new de.thorstenberger.taskmodel.complex.jaxb.impl.ComplexTaskDefImpl.Unmarshaller(context);
    }

    public void serializeBody(de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("http://complex.taskmodel.thorstenberger.de/complexTaskDef", "complexTaskDef");
        super.serializeURIs(context);
        context.endNamespaceDecls();
        super.serializeAttributes(context);
        context.endAttributes();
        super.serializeBody(context);
        context.endElement();
    }

    public void serializeAttributes(de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public void serializeURIs(de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public java.lang.Class getPrimaryInterface() {
        return (de.thorstenberger.taskmodel.complex.jaxb.ComplexTaskDef.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000"
+"\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv."
+"grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000"
+"\fcontentModelt\u0000 Lcom/sun/msv/grammar/Expression;xr\u0000\u001ecom.sun."
+"msv.grammar.Expression\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Lj"
+"ava/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0003xppp\u0000sr\u0000\u001fcom.sun.msv.gra"
+"mmar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.BinaryExp"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1q\u0000~\u0000\u0003L\u0000\u0004exp2q\u0000~\u0000\u0003xq\u0000~\u0000\u0004ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007pps"
+"q\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0007ppsq\u0000~"
+"\u0000\u0000pp\u0000sr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\bppsr\u0000"
+" com.sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv."
+"grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0003xq\u0000~\u0000\u0004sr\u0000\u0011java.lang.Bo"
+"olean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psr\u0000 com.sun.msv.grammar.Attribut"
+"eExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0003L\u0000\tnameClassq\u0000~\u0000\u0001xq\u0000~\u0000\u0004q\u0000~\u0000\u001apsr\u00002c"
+"om.sun.msv.grammar.Expression$AnyStringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000"
+"xq\u0000~\u0000\u0004sq\u0000~\u0000\u0019\u0001q\u0000~\u0000\u001esr\u0000 com.sun.msv.grammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.s"
+"un.msv.grammar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004"
+"q\u0000~\u0000\u001fq\u0000~\u0000$sr\u0000#com.sun.msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002"
+"L\u0000\tlocalNamet\u0000\u0012Ljava/lang/String;L\u0000\fnamespaceURIq\u0000~\u0000&xq\u0000~\u0000!t"
+"\u0000Fde.thorstenberger.taskmodel.complex.jaxb.ComplexTaskDefTyp"
+"e.ConfigTypet\u0000+http://java.sun.com/jaxb/xjc/dummy-elementssq"
+"\u0000~\u0000\u0014ppsq\u0000~\u0000\u001bq\u0000~\u0000\u001apsr\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003"
+"L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0003L\u0000\u0004name"
+"t\u0000\u001dLcom/sun/msv/util/StringPair;xq\u0000~\u0000\u0004ppsr\u0000\"com.sun.msv.data"
+"type.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.Bu"
+"iltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd.Concr"
+"eteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.xsd.XSDatatypeImp"
+"l\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000~\u0000&L\u0000\btypeNameq\u0000~\u0000&L\u0000\nwhiteSpac"
+"et\u0000.Lcom/sun/msv/datatype/xsd/WhiteSpaceProcessor;xpt\u0000 http:"
+"//www.w3.org/2001/XMLSchemat\u0000\u0005QNamesr\u00005com.sun.msv.datatype."
+"xsd.WhiteSpaceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.d"
+"atatype.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv."
+"grammar.Expression$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004q\u0000~\u0000\u001aps"
+"r\u0000\u001bcom.sun.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000&L\u0000"
+"\fnamespaceURIq\u0000~\u0000&xpq\u0000~\u00007q\u0000~\u00006sq\u0000~\u0000%t\u0000\u0004typet\u0000)http://www.w3."
+"org/2001/XMLSchema-instanceq\u0000~\u0000$sq\u0000~\u0000%t\u0000\u0006configt\u00009http://com"
+"plex.taskmodel.thorstenberger.de/complexTaskDefsq\u0000~\u0000\u0014ppsq\u0000~\u0000"
+"\u0000q\u0000~\u0000\u001ap\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000,q\u0000~\u0000\u001apsr\u0000#com.sun.msv.datatype.xsd.Str"
+"ingType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\risAlwaysValidxq\u0000~\u00001q\u0000~\u00006t\u0000\u0006stringsr\u00005co"
+"m.sun.msv.datatype.xsd.WhiteSpaceProcessor$Preserve\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002"
+"\u0000\u0000xq\u0000~\u00009\u0001q\u0000~\u0000<sq\u0000~\u0000=q\u0000~\u0000Kq\u0000~\u00006sq\u0000~\u0000\u0014ppsq\u0000~\u0000\u001bq\u0000~\u0000\u001apq\u0000~\u0000/q\u0000~\u0000?"
+"q\u0000~\u0000$sq\u0000~\u0000%t\u0000\u0002IDq\u0000~\u0000Dq\u0000~\u0000$sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0007ppq\u0000~\u0000Hsq\u0000~\u0000\u0014ppsq\u0000~"
+"\u0000\u001bq\u0000~\u0000\u001apq\u0000~\u0000/q\u0000~\u0000?q\u0000~\u0000$sq\u0000~\u0000%t\u0000\u0005titleq\u0000~\u0000Dsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0007ppq"
+"\u0000~\u0000Hsq\u0000~\u0000\u0014ppsq\u0000~\u0000\u001bq\u0000~\u0000\u001apq\u0000~\u0000/q\u0000~\u0000?q\u0000~\u0000$sq\u0000~\u0000%t\u0000\u000bdescriptionq"
+"\u0000~\u0000Dsq\u0000~\u0000\u0014ppsq\u0000~\u0000\u0000q\u0000~\u0000\u001ap\u0000sq\u0000~\u0000\u0007ppq\u0000~\u0000Hsq\u0000~\u0000\u0014ppsq\u0000~\u0000\u001bq\u0000~\u0000\u001apq\u0000"
+"~\u0000/q\u0000~\u0000?q\u0000~\u0000$sq\u0000~\u0000%t\u0000\tstartTextq\u0000~\u0000Dq\u0000~\u0000$sq\u0000~\u0000\u0014ppsq\u0000~\u0000\u0000q\u0000~\u0000\u001a"
+"p\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000,ppsr\u0000$com.sun.msv.datatype.xsd.BooleanType\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u00001q\u0000~\u00006t\u0000\u0007booleanq\u0000~\u0000:q\u0000~\u0000<sq\u0000~\u0000=q\u0000~\u0000lq\u0000~\u00006sq\u0000~"
+"\u0000\u0014ppsq\u0000~\u0000\u001bq\u0000~\u0000\u001apq\u0000~\u0000/q\u0000~\u0000?q\u0000~\u0000$sq\u0000~\u0000%t\u0000\u001cshowHandlingHintsBef"
+"oreStartq\u0000~\u0000Dq\u0000~\u0000$sq\u0000~\u0000\u0016ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0014pp"
+"sq\u0000~\u0000\u0016q\u0000~\u0000\u001apsq\u0000~\u0000\u001bq\u0000~\u0000\u001apq\u0000~\u0000\u001eq\u0000~\u0000\"q\u0000~\u0000$sq\u0000~\u0000%t\u0000Hde.thorstenb"
+"erger.taskmodel.complex.jaxb.ComplexTaskDefType.CategoryType"
+"q\u0000~\u0000)sq\u0000~\u0000\u0014ppsq\u0000~\u0000\u001bq\u0000~\u0000\u001apq\u0000~\u0000/q\u0000~\u0000?q\u0000~\u0000$sq\u0000~\u0000%t\u0000\bcategoryq\u0000~"
+"\u0000Dsq\u0000~\u0000\u0014ppsq\u0000~\u0000\u0000q\u0000~\u0000\u001ap\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0014ppsq\u0000~\u0000\u0016q\u0000~\u0000\u001ap"
+"sq\u0000~\u0000\u001bq\u0000~\u0000\u001apq\u0000~\u0000\u001eq\u0000~\u0000\"q\u0000~\u0000$sq\u0000~\u0000%t\u0000Ide.thorstenberger.taskmo"
+"del.complex.jaxb.ComplexTaskDefType.RevisionsTypeq\u0000~\u0000)sq\u0000~\u0000\u0014"
+"ppsq\u0000~\u0000\u001bq\u0000~\u0000\u001apq\u0000~\u0000/q\u0000~\u0000?q\u0000~\u0000$sq\u0000~\u0000%t\u0000\trevisionsq\u0000~\u0000Dq\u0000~\u0000$sq\u0000"
+"~\u0000\u0014ppsq\u0000~\u0000\u001bq\u0000~\u0000\u001apq\u0000~\u0000/q\u0000~\u0000?q\u0000~\u0000$sq\u0000~\u0000%t\u0000\u000ecomplexTaskDefq\u0000~\u0000D"
+"sr\u0000\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTable"
+"t\u0000/Lcom/sun/msv/grammar/ExpressionPool$ClosedHash;xpsr\u0000-com."
+"sun.msv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005count"
+"B\u0000\rstreamVersionL\u0000\u0006parentt\u0000$Lcom/sun/msv/grammar/ExpressionP"
+"ool;xp\u0000\u0000\u0000$\u0001pq\u0000~\u0000Gq\u0000~\u0000Tq\u0000~\u0000Zq\u0000~\u0000aq\u0000~\u0000Eq\u0000~\u0000_q\u0000~\u0000\u0015q\u0000~\u0000vq\u0000~\u0000\u0083q\u0000~"
+"\u0000\u0012q\u0000~\u0000tq\u0000~\u0000\u0081q\u0000~\u0000\rq\u0000~\u0000\u000eq\u0000~\u0000\tq\u0000~\u0000\u0010q\u0000~\u0000*q\u0000~\u0000Oq\u0000~\u0000Uq\u0000~\u0000[q\u0000~\u0000bq\u0000~"
+"\u0000nq\u0000~\u0000{q\u0000~\u0000\u0088q\u0000~\u0000\u008cq\u0000~\u0000hq\u0000~\u0000rq\u0000~\u0000\u000bq\u0000~\u0000\nq\u0000~\u0000\u0018q\u0000~\u0000wq\u0000~\u0000\u0084q\u0000~\u0000\fq\u0000~"
+"\u0000\u007fq\u0000~\u0000fq\u0000~\u0000\u000fx"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.UnmarshallingContext context) {
            super(context, "----");
        }

        protected Unmarshaller(de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return de.thorstenberger.taskmodel.complex.jaxb.impl.ComplexTaskDefImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  1 :
                        if (("config" == ___local)&&("http://complex.taskmodel.thorstenberger.de/complexTaskDef" == ___uri)) {
                            spawnHandlerFromEnterElement((((de.thorstenberger.taskmodel.complex.jaxb.impl.ComplexTaskDefTypeImpl)de.thorstenberger.taskmodel.complex.jaxb.impl.ComplexTaskDefImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        break;
                    case  0 :
                        if (("complexTaskDef" == ___local)&&("http://complex.taskmodel.thorstenberger.de/complexTaskDef" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 1;
                            return ;
                        }
                        break;
                }
                super.enterElement(___uri, ___local, ___qname, __atts);
                break;
            }
        }

        public void leaveElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  2 :
                        if (("complexTaskDef" == ___local)&&("http://complex.taskmodel.thorstenberger.de/complexTaskDef" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                    case  3 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                }
                super.leaveElement(___uri, ___local, ___qname);
                break;
            }
        }

        public void enterAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                }
                super.enterAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void leaveAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                }
                super.leaveAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void handleText(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                try {
                    switch (state) {
                        case  3 :
                            revertToParentFromText(value);
                            return ;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

    }

}

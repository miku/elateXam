//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-01/24/2006 06:08 PM(kohsuke)-fcs 
// 	See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 	Any modifications to this file will be lost upon recompilation of the source schema. 
// 	Generated on: 2009.01.15 um 08:53:44 GMT+01:00 
//


package de.thorstenberger.taskmodel.complex.jaxb;


/**
 * Java content class for anonymous complex type.
 * 	<p>The following schema fragment specifies the expected 	content contained within this java content object. 	(defined at file:/home/raporu/software/java/workspace/elatePortal/taskmodel-core/jaxb/complexTaskDef.xsd line 436)
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://complex.taskmodel.thorstenberger.de/complexTaskDef}SubTaskDefType">
 *       &lt;choice>
 *         &lt;element name="cloze">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="gap">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="correct" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="ignoreCase" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="inputLength">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                                 &lt;minInclusive value="1"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="graphicalCloze">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="backgroundImageBase64" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="gap" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="correct" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="ignoreCase" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="inputLength">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                                 &lt;minInclusive value="1"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="posX" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="posY" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface ClozeSubTaskDefType
    extends de.thorstenberger.taskmodel.complex.jaxb.SubTaskDefType
{


    /**
     * Gets the value of the graphicalCloze property.
     * 
     * @return
     *     possible object is
     *     {@link de.thorstenberger.taskmodel.complex.jaxb.ClozeSubTaskDefType.GraphicalClozeType}
     */
    de.thorstenberger.taskmodel.complex.jaxb.ClozeSubTaskDefType.GraphicalClozeType getGraphicalCloze();

    /**
     * Sets the value of the graphicalCloze property.
     * 
     * @param value
     *     allowed object is
     *     {@link de.thorstenberger.taskmodel.complex.jaxb.ClozeSubTaskDefType.GraphicalClozeType}
     */
    void setGraphicalCloze(de.thorstenberger.taskmodel.complex.jaxb.ClozeSubTaskDefType.GraphicalClozeType value);

    boolean isSetGraphicalCloze();

    void unsetGraphicalCloze();

    /**
     * Gets the value of the cloze property.
     * 
     * @return
     *     possible object is
     *     {@link de.thorstenberger.taskmodel.complex.jaxb.ClozeSubTaskDefType.ClozeType}
     */
    de.thorstenberger.taskmodel.complex.jaxb.ClozeSubTaskDefType.ClozeType getCloze();

    /**
     * Sets the value of the cloze property.
     * 
     * @param value
     *     allowed object is
     *     {@link de.thorstenberger.taskmodel.complex.jaxb.ClozeSubTaskDefType.ClozeType}
     */
    void setCloze(de.thorstenberger.taskmodel.complex.jaxb.ClozeSubTaskDefType.ClozeType value);

    boolean isSetCloze();

    void unsetCloze();


    /**
     * Java content class for anonymous complex type.
     * 	<p>The following schema fragment specifies the expected 	content contained within this java content object. 	(defined at file:/home/raporu/software/java/workspace/elatePortal/taskmodel-core/jaxb/complexTaskDef.xsd line 441)
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="gap">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="correct" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="ignoreCase" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="inputLength">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *                       &lt;minInclusive value="1"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     */
    public interface ClozeType {


        /**
         * Gets the value of the TextOrGap property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the TextOrGap property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTextOrGap().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link de.thorstenberger.taskmodel.complex.jaxb.ClozeSubTaskDefType.ClozeType.Gap}
         * {@link de.thorstenberger.taskmodel.complex.jaxb.ClozeSubTaskDefType.ClozeType.Text}
         * 
         */
        java.util.List getTextOrGap();

        boolean isSetTextOrGap();

        void unsetTextOrGap();


        /**
         * Java content class for gap element declaration.
         * 	<p>The following schema fragment specifies the expected 	content contained within this java content object. 	(defined at file:/home/raporu/software/java/workspace/elatePortal/taskmodel-core/jaxb/complexTaskDef.xsd line 444)
         * <p>
         * <pre>
         * &lt;element name="gap">
         *   &lt;complexType>
         *     &lt;complexContent>
         *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *         &lt;sequence>
         *           &lt;element name="correct" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
         *         &lt;/sequence>
         *         &lt;attribute name="ignoreCase" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *         &lt;attribute name="inputLength">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
         *               &lt;minInclusive value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/attribute>
         *       &lt;/restriction>
         *     &lt;/complexContent>
         *   &lt;/complexType>
         * &lt;/element>
         * </pre>
         * 
         */
        public interface Gap
            extends javax.xml.bind.Element, de.thorstenberger.taskmodel.complex.jaxb.ClozeSubTaskDefType.ClozeType.GapType
        {


        }


        /**
         * Java content class for anonymous complex type.
         * 	<p>The following schema fragment specifies the expected 	content contained within this java content object. 	(defined at file:/home/raporu/software/java/workspace/elatePortal/taskmodel-core/jaxb/complexTaskDef.xsd line 445)
         * <p>
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="correct" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
         *       &lt;/sequence>
         *       &lt;attribute name="ignoreCase" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="inputLength">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
         *             &lt;minInclusive value="1"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         */
        public interface GapType {


            /**
             * Gets the value of the ignoreCase property.
             * 
             */
            boolean isIgnoreCase();

            /**
             * Sets the value of the ignoreCase property.
             * 
             */
            void setIgnoreCase(boolean value);

            boolean isSetIgnoreCase();

            void unsetIgnoreCase();

            /**
             * Gets the value of the inputLength property.
             * 
             */
            int getInputLength();

            /**
             * Sets the value of the inputLength property.
             * 
             */
            void setInputLength(int value);

            boolean isSetInputLength();

            void unsetInputLength();

            /**
             * Gets the value of the Correct property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the Correct property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCorrect().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link java.lang.String}
             * 
             */
            java.util.List getCorrect();

            boolean isSetCorrect();

            void unsetCorrect();

        }


        /**
         * Java content class for text element declaration.
         * 	<p>The following schema fragment specifies the expected 	content contained within this java content object. 	(defined at file:/home/raporu/software/java/workspace/elatePortal/taskmodel-core/jaxb/complexTaskDef.xsd line 443)
         * <p>
         * <pre>
         * &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string"/>
         * </pre>
         * 
         */
        public interface Text
            extends javax.xml.bind.Element
        {


            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link java.lang.String}
             */
            java.lang.String getValue();

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link java.lang.String}
             */
            void setValue(java.lang.String value);

            boolean isSetValue();

            void unsetValue();

        }

    }


    /**
     * Java content class for anonymous complex type.
     * 	<p>The following schema fragment specifies the expected 	content contained within this java content object. 	(defined at file:/home/raporu/software/java/workspace/elatePortal/taskmodel-core/jaxb/complexTaskDef.xsd line 463)
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="backgroundImageBase64" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="gap" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="correct" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="ignoreCase" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="inputLength">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *                       &lt;minInclusive value="1"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="posX" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="posY" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     */
    public interface GraphicalClozeType {


        /**
         * Gets the value of the backgroundImageBase64 property.
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String}
         */
        java.lang.String getBackgroundImageBase64();

        /**
         * Sets the value of the backgroundImageBase64 property.
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String}
         */
        void setBackgroundImageBase64(java.lang.String value);

        boolean isSetBackgroundImageBase64();

        void unsetBackgroundImageBase64();

        /**
         * Gets the value of the Gap property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the Gap property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGap().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link de.thorstenberger.taskmodel.complex.jaxb.ClozeSubTaskDefType.GraphicalClozeType.GapType}
         * 
         */
        java.util.List getGap();

        boolean isSetGap();

        void unsetGap();


        /**
         * Java content class for anonymous complex type.
         * 	<p>The following schema fragment specifies the expected 	content contained within this java content object. 	(defined at file:/home/raporu/software/java/workspace/elatePortal/taskmodel-core/jaxb/complexTaskDef.xsd line 467)
         * <p>
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="correct" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
         *       &lt;/sequence>
         *       &lt;attribute name="ignoreCase" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="inputLength">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
         *             &lt;minInclusive value="1"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="posX" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="posY" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         */
        public interface GapType {


            /**
             * Gets the value of the ignoreCase property.
             * 
             */
            boolean isIgnoreCase();

            /**
             * Sets the value of the ignoreCase property.
             * 
             */
            void setIgnoreCase(boolean value);

            boolean isSetIgnoreCase();

            void unsetIgnoreCase();

            /**
             * Gets the value of the posY property.
             * 
             */
            int getPosY();

            /**
             * Sets the value of the posY property.
             * 
             */
            void setPosY(int value);

            boolean isSetPosY();

            void unsetPosY();

            /**
             * Gets the value of the posX property.
             * 
             */
            int getPosX();

            /**
             * Sets the value of the posX property.
             * 
             */
            void setPosX(int value);

            boolean isSetPosX();

            void unsetPosX();

            /**
             * Gets the value of the inputLength property.
             * 
             */
            int getInputLength();

            /**
             * Sets the value of the inputLength property.
             * 
             */
            void setInputLength(int value);

            boolean isSetInputLength();

            void unsetInputLength();

            /**
             * Gets the value of the Correct property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the Correct property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCorrect().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link java.lang.String}
             * 
             */
            java.util.List getCorrect();

            boolean isSetCorrect();

            void unsetCorrect();

        }

    }

}

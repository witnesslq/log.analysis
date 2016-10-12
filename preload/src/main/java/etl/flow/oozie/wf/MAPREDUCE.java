//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.03 at 12:23:46 PM PDT 
//


package etl.flow.oozie.wf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MAP-REDUCE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MAP-REDUCE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="job-tracker" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name-node" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prepare" type="{uri:oozie:workflow:0.5}PREPARE" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="streaming" type="{uri:oozie:workflow:0.5}STREAMING" minOccurs="0"/>
 *           &lt;element name="pipes" type="{uri:oozie:workflow:0.5}PIPES" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="job-xml" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="configuration" type="{uri:oozie:workflow:0.5}CONFIGURATION" minOccurs="0"/>
 *         &lt;element name="config-class" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="file" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="archive" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MAP-REDUCE", propOrder = {
    "jobTracker",
    "nameNode",
    "prepare",
    "streaming",
    "pipes",
    "jobXml",
    "configuration",
    "configClass",
    "file",
    "archive"
})
public class MAPREDUCE {

    @XmlElement(name = "job-tracker")
    protected String jobTracker;
    @XmlElement(name = "name-node")
    protected String nameNode;
    protected PREPARE prepare;
    protected STREAMING streaming;
    protected PIPES pipes;
    @XmlElement(name = "job-xml")
    protected List<String> jobXml;
    protected CONFIGURATION configuration;
    @XmlElement(name = "config-class")
    protected String configClass;
    protected List<String> file;
    protected List<String> archive;

    /**
     * Gets the value of the jobTracker property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobTracker() {
        return jobTracker;
    }

    /**
     * Sets the value of the jobTracker property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobTracker(String value) {
        this.jobTracker = value;
    }

    /**
     * Gets the value of the nameNode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameNode() {
        return nameNode;
    }

    /**
     * Sets the value of the nameNode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameNode(String value) {
        this.nameNode = value;
    }

    /**
     * Gets the value of the prepare property.
     * 
     * @return
     *     possible object is
     *     {@link PREPARE }
     *     
     */
    public PREPARE getPrepare() {
        return prepare;
    }

    /**
     * Sets the value of the prepare property.
     * 
     * @param value
     *     allowed object is
     *     {@link PREPARE }
     *     
     */
    public void setPrepare(PREPARE value) {
        this.prepare = value;
    }

    /**
     * Gets the value of the streaming property.
     * 
     * @return
     *     possible object is
     *     {@link STREAMING }
     *     
     */
    public STREAMING getStreaming() {
        return streaming;
    }

    /**
     * Sets the value of the streaming property.
     * 
     * @param value
     *     allowed object is
     *     {@link STREAMING }
     *     
     */
    public void setStreaming(STREAMING value) {
        this.streaming = value;
    }

    /**
     * Gets the value of the pipes property.
     * 
     * @return
     *     possible object is
     *     {@link PIPES }
     *     
     */
    public PIPES getPipes() {
        return pipes;
    }

    /**
     * Sets the value of the pipes property.
     * 
     * @param value
     *     allowed object is
     *     {@link PIPES }
     *     
     */
    public void setPipes(PIPES value) {
        this.pipes = value;
    }

    /**
     * Gets the value of the jobXml property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobXml property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobXml().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getJobXml() {
        if (jobXml == null) {
            jobXml = new ArrayList<String>();
        }
        return this.jobXml;
    }

    /**
     * Gets the value of the configuration property.
     * 
     * @return
     *     possible object is
     *     {@link CONFIGURATION }
     *     
     */
    public CONFIGURATION getConfiguration() {
        return configuration;
    }

    /**
     * Sets the value of the configuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link CONFIGURATION }
     *     
     */
    public void setConfiguration(CONFIGURATION value) {
        this.configuration = value;
    }

    /**
     * Gets the value of the configClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigClass() {
        return configClass;
    }

    /**
     * Sets the value of the configClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfigClass(String value) {
        this.configClass = value;
    }

    /**
     * Gets the value of the file property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the file property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFile() {
        if (file == null) {
            file = new ArrayList<String>();
        }
        return this.file;
    }

    /**
     * Gets the value of the archive property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the archive property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArchive().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getArchive() {
        if (archive == null) {
            archive = new ArrayList<String>();
        }
        return this.archive;
    }

}
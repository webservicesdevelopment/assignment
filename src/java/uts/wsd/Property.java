/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.wsd;

import java.io.Serializable;
import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

/**
 *
 * @author Carmelo
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Property implements Serializable {
    @XmlAttribute(name = "id")
    private int id;
    @XmlElement(name = "lister")
    private String lister;
    @XmlElement(name = "location")
    private String location;
    @XmlElement(name = "type")
    private String type;
    @XmlElement(name = "availability")
    private String availability;
    @XmlElement(name = "numGuests")
    private int numGuests;
    @XmlElement(name = "address")
    private String address;
    @XmlElement(name = "description")
    private String description;
    @XmlElementWrapper(name = "enquiries")
    @XmlElement(name = "enquiry")
    private ArrayList<Enquiry> enquiries;
    
}

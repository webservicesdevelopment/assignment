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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Carmelo
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "properties")
public class Properties implements Serializable {
    
    @XmlElement(name = "property")
    private ArrayList<Property> list = new ArrayList<>();
    
    public ArrayList<Property> getList() {
        return list;
    }
}

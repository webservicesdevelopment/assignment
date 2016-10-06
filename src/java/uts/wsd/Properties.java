/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.wsd;

import java.util.*;
import java.io.Serializable;
/**
 *
 * @author 11238639
 */
public class Properties {
    
    private ArrayList<Property> properties = new ArrayList<Property>();
    
    public Properties() {
        super();
    }
    
    public ArrayList<Property> getProperties() {
        return properties;
    }
    
    public void addEnquiry(Property property) {
        properties.add(property);
    }
    
    public void removeEnquiry(Property property) {
        properties.remove(property);
    }
    
}

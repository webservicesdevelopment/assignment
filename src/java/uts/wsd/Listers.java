/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.wsd;

import java.io.*;
import java.util.*;
import java.io.Serializable;
import javax.xml.bind.*;

/**
 *
 * @author 11238639
 */
public class Listers {
    
    private ArrayList<Lister> listers = new ArrayList<Lister>();
    
    public Listers() {
        super();
    }
    
    public ArrayList<Lister> getListers() {
        return listers;
    }
    
    public void addEnquiry(Lister lister) {
        listers.add(lister);
    }
    
    public void removeEnquiry(Lister lister) {
        listers.remove(lister);
    }
}

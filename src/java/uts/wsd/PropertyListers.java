/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.wsd;

import java.util.*;
import java.io.*;
import javax.xml.bind.*;

/**
 *
 * @author timjones27
 */
public class PropertyListers {
    private String filePath;
    private Listers listers;

    public PropertyListers() {
        super();
    }
    
    public String getFilePath() {
        return filePath;
    }
    
    public void setFilePath(String filePath) throws JAXBException, FileNotFoundException, IOException {
        this.filePath = filePath;
        
        // Create the unmarshaller
        JAXBContext jc = JAXBContext.newInstance(Listers.class);
        Unmarshaller u = jc.createUnmarshaller();
        
        // Now unmarshal the object from the file
        FileInputStream fin = new FileInputStream(filePath);
        listers = (Listers)u.unmarshal(fin);
        fin.close();
    }
    
    public Listers getListers() {
        return listers;
    }
    
    public void setListers(Listers listers)  {
        this.listers = listers;
        //add code to marshal xml
    }
}
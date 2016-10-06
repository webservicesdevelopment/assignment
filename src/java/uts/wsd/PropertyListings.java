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
public class PropertyListings {
    private String filePath;
    private Properties properties;

    public PropertyListings() {
        super();
    }
    
    public String getFilePath() {
        return filePath;
    }
    
    public void setFilePath(String filePath) throws JAXBException, FileNotFoundException, IOException {
        this.filePath = filePath;
        
        // Create the unmarshaller
        JAXBContext jc = JAXBContext.newInstance(Properties.class);
        Unmarshaller u = jc.createUnmarshaller();
        
        // Now unmarshal the object from the file
        FileInputStream fin = new FileInputStream(filePath);
        properties = (Properties)u.unmarshal(fin);
        fin.close();
    }
    
    public Properties getProperties() {
        return properties;
    }
    
    public void setProperties(Properties properties)  {
        this.properties = properties;
        //add code to marshal new xml
    }
}
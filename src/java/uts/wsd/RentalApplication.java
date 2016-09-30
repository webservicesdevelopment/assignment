/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.wsd;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author Carmelo
 */
public class RentalApplication {
    private String usersFilePath;
    private String propertiesFilePath;
    private Users users;
    private Properties properties;

    /**
     * @return the users
     */
    public Users getUsers() {
        return users;
    }

    /**
     * @return the filePath
     */
    public String getUsersFilePath() {
        return usersFilePath;
    }

    /**
     * @param usersFilePath the usersFilePath to set
     */
    public void setUsersFilePath(String usersFilePath) throws JAXBException, FileNotFoundException {
        JAXBContext jc = JAXBContext.newInstance(Users.class);
        Unmarshaller u = jc.createUnmarshaller();
        
        FileInputStream fin = new FileInputStream(usersFilePath);
        users = (Users)u.unmarshal(fin);
        
        this.usersFilePath = usersFilePath;
    }
    
     /**
     * @return the properties
     */
    public Properties getProperties() {
        return properties;
    }
    
    /**
     * @return the propertiesFilePath
     */
    public String getPropertiesFilePath() {
        return propertiesFilePath;
    }

    /**
     * @param propertiesFilePath the propertiesFilePath to set
     */
    public void setPropertiesFilePath(String propertiesFilePath) throws JAXBException, FileNotFoundException {
        JAXBContext jc = JAXBContext.newInstance(Properties.class);
        Unmarshaller u = jc.createUnmarshaller();
        
        FileInputStream fin = new FileInputStream(propertiesFilePath);
        properties = (Properties)u.unmarshal(fin);
        
        this.propertiesFilePath = propertiesFilePath;
    }

   
    public void loadUsersXML() throws FileNotFoundException, JAXBException {
        JAXBContext jc = JAXBContext.newInstance(Users.class);
        Unmarshaller u = jc.createUnmarshaller();

        FileInputStream fin = new FileInputStream(usersFilePath);
        users = (Users) u.unmarshal(fin);
    }
    
    public void loadPropertiesXML() throws FileNotFoundException, JAXBException {
        JAXBContext jc = JAXBContext.newInstance(Properties.class);
        Unmarshaller u = jc.createUnmarshaller();

        FileInputStream fin = new FileInputStream(propertiesFilePath);
        properties = (Properties) u.unmarshal(fin);
    }

    
}

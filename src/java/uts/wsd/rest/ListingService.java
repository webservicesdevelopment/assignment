/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.wsd.rest;

import java.io.IOException;
import javax.servlet.ServletContext;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import javax.xml.bind.JAXBException;
import uts.wsd.Properties;
import uts.wsd.RentalApplication;

/**
 *
 * @author Carmelo
 */
@Path("/listing")
public class ListingService {
    @Context
    private ServletContext application;
    
    private RentalApplication getRentalApp() throws JAXBException, IOException {
        synchronized (application) {
            RentalApplication rentalApp = (RentalApplication) application.getAttribute("rentalApp");
            if (rentalApp == null) {
                rentalApp = new RentalApplication();
                rentalApp.setPropertiesFilePath(application.getRealPath("WEB-INF/properties.xml"));
                application.setAttribute("rentalApp", rentalApp);
            }
            return rentalApp;
        }
    }
    
    @Path("properties")
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public Properties getProperties() throws JAXBException, IOException {
        return getRentalApp().getProperties();
    }
    
    @Path("hello")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello World";
    }

}

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
public class Enquiry {
    
    private String user;
    private String email;
    private String date;
    private String message;
    
    public Enquiry() {
        super();
    }
    
    public Enquiry(String user, String email, String date, String message) {
        super();
        this.user = user;
        this.email = email;
        this.date = date;
        this.message = message;
    }
    
    //only really need getters as enquiries cant be modified once made
    
}

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
public class Property {
    
    private String address;
    private String type;
    private String guestNumber;
    private String lister;
    private String description;
    private String status;
    private Enquiries enquiries;
    
    public Property() {
        super();
    }
    
    public Property(String address, String type, String guestNumber, String lister, String description, String status) {
        super();
        this.address = address;
        this.type = type;
        this.guestNumber = guestNumber;
        this.lister = lister;
        this.description = description;
        this.status = status;
    }
    
    
}

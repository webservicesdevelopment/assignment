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
public class Lister {
    
    private String name;
    private String password;
    
    public Lister() {
        super();
    }
    
    public Lister(String name, String password) {
        super();
        this.name = name;
        this.password = password;
    }
    
    public String getName() {
        return name;
    }
    
    public String getPassword() {
        return password;
    }
}

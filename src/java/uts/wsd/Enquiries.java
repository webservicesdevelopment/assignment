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
public class Enquiries {
    
    private ArrayList<Enquiry> enquiries = new ArrayList<Enquiry>();
    
    public Enquiries() {
        super();
    }
 
    public ArrayList<Enquiry> getEnquiries() {
        return enquiries;
    }
    
    public void addEnquiry(Enquiry enquiry) {
        enquiries.add(enquiry);
    }
    
    public void removeEnquiry(Enquiry enquiry) {
        enquiries.remove(enquiry);
    }
    
}

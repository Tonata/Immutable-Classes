/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tonata.photostudio.model;

import com.tonata.photostudio.model.workTypePackage.Work;
import java.util.List;

/**
 *
 * @author student
 */
public final class Customer implements User {
    private final String firstName;
    private final String lastName;
    private final String idNum;
    private final List <Work> w;
    
    private Customer(Builder b){
        firstName = b.firstName;
        lastName = b.lastName;
        idNum = b.idNum;
        w = b.w;
    }
    public static class Builder{
        private String firstName;
        private String lastName;
        private String idNum;
        private List <Work> w;
        
        public Builder(String idNum) {
            this.idNum = idNum;
        }
        
        public Builder firstName(String name){
            firstName = name;
            return this;
        }
        
        public Builder lastName(String surname){
            lastName = surname;
            return this;
        }
        public Builder artWork(List<Work> work){
            w = work;
            return this;
        }
        public Customer build(){
            return new Customer(this);
        }
               
        
    }
    public String getName() {
        return firstName;
    }

    public String getLastName() {
       return lastName; 
    }

    public String getIdNum() {
       return idNum; 
    }

    public List<Work> getW() {
        return w;
    }
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + (this.idNum != null ? this.idNum.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Customer other = (Customer) obj;
        if ((this.idNum == null) ? (other.idNum != null) : !this.idNum.equals(other.idNum)) {
            return false;
        }
        return true;
    }
    
}

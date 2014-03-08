/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tonata.photostudio.model;

import com.tonata.photostudio.model.workTypePackage.Work;

/**
 *
 * @author student
 */
public final class Manager implements User {
    private final String firstName;
    private final String lastName;
    private final String workerID;
    private final Work validWork;
    
    private Manager(Builder b){
        firstName = b.firstName;
        lastName = b.lastName;
        workerID  = b.workerID;
        validWork = b.validWork;
    }
    public static class Builder{
        private String firstName;
        private String lastName;
        private String workerID;
        private Work validWork;
        
        public Builder(String workerID) {
            this.workerID = workerID;
        }
        
        public Builder firstName(String name){
            firstName = name;
            return this;
        }
        public Builder lastName(String surname){
            lastName = surname;
            return this;
        }
        
        public Builder validWork(Work valid){
            validWork = valid;
            return this;
        }
        public Manager build(){
            return new Manager(this);
        }
    }
    public String getName() {
        return firstName;
    }

    public String getLastName() {
       return lastName; 
    }

    public String getIdNum() {
        return workerID;
    }

    public Work getValidWork() {
        return validWork;
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + (this.workerID != null ? this.workerID.hashCode() : 0);
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
        final Manager other = (Manager) obj;
        if ((this.workerID == null) ? (other.workerID != null) : !this.workerID.equals(other.workerID)) {
            return false;
        }
        return true;
    }
    
    
}

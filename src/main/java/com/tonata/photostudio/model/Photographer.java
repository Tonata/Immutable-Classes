/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tonata.photostudio.model;

/**
 *
 * @author student
 */
public final class Photographer implements User {
    private final String firstName;
    private final String lastName;
    private final String workerID;
    
    private Photographer(Builder b){
        firstName = b.firstName;
        lastName = b.lastName;
        workerID = b.workerID;
    }
    public static class Builder{
        private String firstName;
        private String lastName;
        private String workerID;

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
        public Photographer build(){
            
            return new Photographer(this);
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + (this.workerID != null ? this.workerID.hashCode() : 0);
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
        final Photographer other = (Photographer) obj;
        if ((this.workerID == null) ? (other.workerID != null) : !this.workerID.equals(other.workerID)) {
            return false;
        }
        return true;
    }
    
}

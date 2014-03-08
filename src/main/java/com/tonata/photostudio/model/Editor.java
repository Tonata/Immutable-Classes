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
public final class Editor implements User{
    private final String firstName;
    private final String lastName;
    private final String workerID;
    
    private Editor(Builder b){
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
            this.firstName = name;
            return this;
        }
        public Builder lastName(String surname){
            this.lastName = surname;
            return this;
        }
        
        public Editor build(){
            return new Editor(this);
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
    
}

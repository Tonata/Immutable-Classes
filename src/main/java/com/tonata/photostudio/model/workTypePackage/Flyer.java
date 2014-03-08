/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tonata.photostudio.model.workTypePackage;

import com.tonata.photostudio.model.Editor;

/**
 *
 * @author student
 */
public final class Flyer implements Work {
    private final Editor editor;
    private final String description;
    
    private Flyer(Builder b){
        description = b.description;
        editor = b.editor;
    }
    
    public static class Builder{
       private Editor editor;
       private String description; 

        public Builder() {
            
        }
       
        public Builder editor(Editor e){
            editor = e;
            return this;
        }
        public Builder description(String d){
            description = d;
            return this;
        }
        public Flyer build(){
            return new Flyer(this);
        }
    }

    public Editor getEditor() {
        return editor;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + (this.description != null ? this.description.hashCode() : 0);
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
        final Flyer other = (Flyer) obj;
        if ((this.description == null) ? (other.description != null) : !this.description.equals(other.description)) {
            return false;
        }
        return true;
    }
    
    public double cost(int unitPrice, double labour) {
        return unitPrice * labour;
    }
    
}

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
public final class Branding implements Work {
    private final Editor editor;
    private final String description;
    
    private Branding(Builder b){
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
        public Branding build(){
            return new Branding(this);
        }
    }

    public Editor getEditor() {
        return editor;
    }

    public String getDescription() {
        return description;
    }
    
    public double cost(int unitPrice, double labour) {
        return unitPrice * labour;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + (this.description != null ? this.description.hashCode() : 0);
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
        final Branding other = (Branding) obj;
        if ((this.description == null) ? (other.description != null) : !this.description.equals(other.description)) {
            return false;
        }
        return true;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tonata.photostudio.model.workTypePackage;

import com.tonata.photostudio.model.Customer;
import com.tonata.photostudio.model.Photographer;

/**
 *
 * @author student
 */
public final class Photograph implements Work{
    private final Photographer photographer;
    private final String description;
    
    private Photograph (Builder b){
        photographer = b.photographer;
        description = b.description;
    }
    
    public static class Builder{
        private Photographer photographer;
        private String description;

        public Builder() {
           
        }
        public Builder photographer(Photographer p){
            photographer = p;
            return this;
        }
        public Builder description(String d){
            description = d;
            return this;
        }
        public Photograph build(){
            return new Photograph(this);
        }
    }

    public Photographer getPhotographer() {
        return photographer;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (this.description != null ? this.description.hashCode() : 0);
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
        final Photograph other = (Photograph) obj;
        if ((this.description == null) ? (other.description != null) : !this.description.equals(other.description)) {
            return false;
        }
        return true;
    }
    
    public double cost(int unitPrice , double labour) {
        return unitPrice * labour;
    }
    
}

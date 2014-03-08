/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tonata.photostudio.model.equipmentPackage;

/**
 *
 * @author student
 */
public final class Speaker implements Equipment{
    private final String name;
    private final String code;
    
    private Speaker(Builder b){
        name = b.name;
        code = b.code;
    }
    
    public static class Builder{
        private String name;
        private String code;

        public Builder() {
            
        }
        
        public Builder code(String c){
            code = c;
            return this;
        }
        public Builder name(String n){
            name = n;
            return this;
        }
        public Speaker build(){
            return new Speaker(this);
        }
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + (this.name != null ? this.name.hashCode() : 0);
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
        final Speaker other = (Speaker) obj;
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        return true;
    }
    
    public double cost() {
        return 699.99;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tonata.photostudio.model;

import com.tonata.photostudio.model.equipmentPackage.Equipment;
import java.util.List;

/**
 *
 * @author student
 */
public final class Studio {
    private final double squareMeters;
    private final String address;
    private List<Equipment> equipment;
    
    private Studio(Builder b){
        squareMeters = b.squareMeters;
        address = b.address;
        equipment = b.equipment;
    }
    public static class Builder{
        private double squareMeters;
        private String address;
        private List<Equipment> equipment;
        
        public Builder(String add) {
            this.address = add;
        }
        
        public Builder squareMeters(double sq){
            squareMeters = sq;
            return this;
        }
        public Builder equipment(List<Equipment> e){
            equipment = e;
            return this;
        }
        
        public Studio build(){
            return new Studio(this);
        }
        
    }

    public double getSquareMeters() {
        return squareMeters;
    }

    public String getAddress() {
        return address;
    }

    public List<Equipment> getEquipment() {
        return equipment;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + (this.address != null ? this.address.hashCode() : 0);
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
        final Studio other = (Studio) obj;
        if ((this.address == null) ? (other.address != null) : !this.address.equals(other.address)) {
            return false;
        }
        return true;
    }
    
    
}

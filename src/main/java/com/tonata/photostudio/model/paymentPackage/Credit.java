/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tonata.photostudio.model.paymentPackage;

/**
 *
 * @author student
 */
public final class Credit {
    private final double amount;
    private final String accName;
    
    private Credit(Builder b){
        amount = b.amount;
        accName = b.accName;
    }
    
    public static class Builder{
        private double amount;
        private String accName;

        public Builder(String accName) {
            this.accName = accName;
        }
        
        public Builder amount(double amt){
            amount = amt;
            return this;
        }
        public Credit build(){
            return new Credit(this);
        }
    }

    public double getAmount() {
        return amount;
    }

    public String getAccName() {
        return accName;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + (this.accName != null ? this.accName.hashCode() : 0);
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
        final Credit other = (Credit) obj;
        if ((this.accName == null) ? (other.accName != null) : !this.accName.equals(other.accName)) {
            return false;
        }
        return true;
    }
    
}

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
public final class Cash {
    private final double amount;
    
    private Cash(Builder b){
        amount = b.amount;
    }
    
    public static class Builder{
        private double amount;
        
        public Builder(){
            
        }
        
        public Builder amount(double amt){
            amount =  amt;
            return this;
        }
        
        public Cash build(){
            return new Cash(this);
        }
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.amount) ^ (Double.doubleToLongBits(this.amount) >>> 32));
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
        final Cash other = (Cash) obj;
        if (Double.doubleToLongBits(this.amount) != Double.doubleToLongBits(other.amount)) {
            return false;
        }
        return true;
    }
    
    
}

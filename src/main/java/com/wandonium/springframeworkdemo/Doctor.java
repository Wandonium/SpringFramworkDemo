package com.wandonium.springframeworkdemo;

/**
 *
 * @author Hillary Wando
 */
public class Doctor implements Staff {
    
    @Override
    public void assist() {
        System.out.println("Doctor is assisting");
    }
    
}

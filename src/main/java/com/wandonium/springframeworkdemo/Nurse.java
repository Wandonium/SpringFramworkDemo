package com.wandonium.springframeworkdemo;

/**
 *
 * @author Futuristic Ltd
 */
public class Nurse implements Staff {
    @Override
    public void assist() {
        System.out.println("Nurse is assisting");
    }
}

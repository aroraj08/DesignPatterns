package com.templatemethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TeaMaker extends BeverageCaffeine {

    @Override
    public void addMainIngredient() {
        System.out.println("Adding Tea powder to the mixture");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding extra condiment");
    }

    @Override
    public boolean isCondimentToAdd() {

        boolean isCondimentToAdd = false;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            System.out.println("Do you wish to add condiments?");
            String str = br.readLine();
            if (str != null && str.toLowerCase().startsWith("y")) {
                isCondimentToAdd = true;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return isCondimentToAdd;
    }

}

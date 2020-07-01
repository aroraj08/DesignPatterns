package com.templatemethod;

public class Test {

    public static void main(String[] args) {

        BeverageCaffeine tea = new TeaMaker();
        tea.prepareBeverage();

        BeverageCaffeine coffee = new CoffeMaker();
        coffee.prepareBeverage();
    }
}

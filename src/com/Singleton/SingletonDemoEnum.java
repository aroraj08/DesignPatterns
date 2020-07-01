package com.Singleton;

public enum SingletonDemoEnum {

    JAN(1);
    int value;
    SingletonDemoEnum(int value){
        this.value=value;
    }
    int getValue(){
        return this.value;
    }

}

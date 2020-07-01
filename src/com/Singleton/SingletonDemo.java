package com.Singleton;

import java.io.Serializable;

public class SingletonDemo implements Serializable {

    private static volatile SingletonDemo instance = null;

    private SingletonDemo(){
        if(instance != null){
            throw new RuntimeException("SingletonDemo class already present. Can't be initiated again. " +
                    "Use getInstance() method to get the single instance of this class.");
        }
    }

    public static SingletonDemo getInstance(){
        if(instance == null){
            synchronized (SingletonDemo.class){
                if(instance == null){
                    instance = new SingletonDemo();
                }
            }
        }
        return instance;
    }

    public SingletonDemo readResolve(){
        return  getInstance();
    }

}

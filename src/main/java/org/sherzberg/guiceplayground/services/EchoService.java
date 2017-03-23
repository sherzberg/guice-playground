package org.sherzberg.guiceplayground.services;

import com.google.inject.Singleton;

@Singleton
public class EchoService {

    public void echo(){
        System.out.println("Hi");
    }

}

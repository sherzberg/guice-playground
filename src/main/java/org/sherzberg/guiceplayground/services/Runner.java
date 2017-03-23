package org.sherzberg.guiceplayground.services;


import com.google.inject.Inject;

public class Runner {

    @Inject
    private EchoService echoService;

    public void run() {
        echoService.echo();
    }
}

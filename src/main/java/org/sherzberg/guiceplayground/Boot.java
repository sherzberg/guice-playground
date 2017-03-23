package org.sherzberg.guiceplayground;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.sherzberg.guiceplayground.services.Runner;

public class Boot {

    public static void main(String [] args) {
        Injector injector = Guice.createInjector(new AppInjector());

        Runner app = injector.getInstance(Runner.class);

        app.run();
    }
}

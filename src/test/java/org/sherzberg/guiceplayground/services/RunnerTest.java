package org.sherzberg.guiceplayground.services;

import com.google.common.collect.ImmutableList;
import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class RunnerTest {

    @Test
    public void echoCalledTest() {
        final EchoService mockEchoService = mock(EchoService.class);

        final ImmutableList.Builder<Module> modules = com.google.common.collect.ImmutableList.builder();
        modules.add(new AbstractModule() {
            @Override
            protected void configure() {
                bind(EchoService.class).toInstance(mockEchoService);
            }
        });
        Injector injector = Guice.createInjector(modules.build());

        Runner runner = injector.getInstance(Runner.class);

        runner.run();

        verify(mockEchoService, times(1)).echo();
    }
}
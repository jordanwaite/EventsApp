package org.example;

import io.dropwizard.core.Application;
import io.dropwizard.core.setup.Bootstrap;
import io.dropwizard.core.setup.Environment;

public class EventsApplication extends Application<EventsConfiguration> {

    public static void main(final String[] args) throws Exception {
        new EventsApplication().run(args);
    }

    @Override
    public String getName() {
        return "Events";
    }

    @Override
    public void initialize(final Bootstrap<EventsConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final EventsConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}

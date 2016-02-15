package com.burson;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class PokerApplication extends Application<PokerConfiguration> {

    public static void main(final String[] args) throws Exception {
        new PokerApplication().run(args);
    }

    @Override
    public String getName() {
        return "Poker";
    }

    @Override
    public void initialize(final Bootstrap<PokerConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final PokerConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}

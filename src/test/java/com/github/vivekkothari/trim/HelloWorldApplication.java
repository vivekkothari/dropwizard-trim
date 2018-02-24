package com.github.vivekkothari.trim;

import com.github.vivekkothari.trim.config.HelloWorldConfiguration;
import io.dropwizard.Application;
import io.dropwizard.configuration.ResourceConfigurationSourceProvider;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

/**
 * @author by vivekkothari on 24/02/18.
 */
public class HelloWorldApplication extends Application<HelloWorldConfiguration> {

    public static HelloWorldConfiguration config = null;

    public static void main(String[] args) throws Exception {
        new HelloWorldApplication().run(args);
    }

    @Override
    public String getName() {
        return "hello-world";
    }

    @Override
    public void initialize(Bootstrap<HelloWorldConfiguration> bootstrap) {
        bootstrap.setConfigurationSourceProvider(new ResourceConfigurationSourceProvider());
        bootstrap.addBundle(new ConfigTrimmingBundle());
    }

    @Override
    public void run(HelloWorldConfiguration configuration, Environment environment) {
        config = configuration;
    }
}

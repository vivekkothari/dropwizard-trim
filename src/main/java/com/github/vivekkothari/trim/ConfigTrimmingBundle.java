package com.github.vivekkothari.trim;

import io.dropwizard.Bundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

/**
 * @author vivek.kothari on 04/05/16.
 */
public class ConfigTrimmingBundle
        implements Bundle {

    @Override
    public void initialize(final Bootstrap<?> bootstrap) {
        bootstrap.setConfigurationFactoryFactory(new TrimmingConfigurationFactoryFactory<>());
    }

    @Override
    public void run(final Environment environment) {

    }

}

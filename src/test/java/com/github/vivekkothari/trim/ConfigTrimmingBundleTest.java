package com.github.vivekkothari.trim;

import io.dropwizard.Configuration;
import io.dropwizard.setup.Bootstrap;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author vivek.kothari on 05/05/16.
 */
public class ConfigTrimmingBundleTest {

    private ConfigTrimmingBundle bundle = new ConfigTrimmingBundle();

    @Test
    public void testInitialize() {
        Bootstrap<Configuration> bootstrap = new Bootstrap<>(null);
        bundle.initialize(bootstrap);
        Assert.assertEquals(bootstrap.getConfigurationFactoryFactory()
                                     .getClass(), TrimmingConfigurationFactoryFactory.class);
    }

}
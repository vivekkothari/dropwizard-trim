package com.github.vivekkothari.trim;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.dropwizard.configuration.ConfigurationFactory;
import io.dropwizard.jackson.Jackson;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import javax.validation.Validator;

/**
 * @author vivek.kothari on 16/07/16.
 */
public class TrimmingConfigurationFactoryFactoryTest {

    private final TrimmingConfigurationFactoryFactory factory = new TrimmingConfigurationFactoryFactory();

    @Test
    public void create() throws Exception {
        final ConfigurationFactory configurationFactory = factory.create(Integer.class, Mockito.mock(Validator.class), Jackson.newObjectMapper(), "prefix");
        Assert.assertNotNull(configurationFactory);
    }

    @Test
    public void configureMapper() throws Exception {
        final ObjectMapper oldMapper = Jackson.newObjectMapper();
        final ObjectMapper newMapper = factory.configureMapper(oldMapper);
        Assert.assertNotEquals(oldMapper, newMapper);
    }

}
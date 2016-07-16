package com.github.vivekkothari.trim;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.dropwizard.configuration.ConfigurationFactory;
import io.dropwizard.configuration.ConfigurationFactoryFactory;
import io.dropwizard.configuration.YamlConfigurationFactory;

import javax.validation.Validator;

/**
 * @author vivek.kothari on 05/05/16.
 */
public class TrimmingConfigurationFactoryFactory<T>
        implements ConfigurationFactoryFactory<T> {

    @Override
    public ConfigurationFactory<T> create(final Class<T> klass, final Validator validator, final ObjectMapper objectMapper, final String propertyPrefix) {
        return new YamlConfigurationFactory<>(klass, validator, configureMapper(objectMapper), propertyPrefix);
    }

    ObjectMapper configureMapper(final ObjectMapper objectMapper) {
        return objectMapper.copy()
                           .registerModule(new StringTrimmingModule());
    }

}

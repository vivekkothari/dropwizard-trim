package com.github.vivekkothari.trim;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.dropwizard.jackson.Jackson;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

/**
 * @author vivek.kothari on 16/07/16.
 */
public class StringTrimmingModuleTest {

    @Test
    public void testStringTrimmer() throws IOException {
        final StringTrimmingModule module = new StringTrimmingModule();
        final ObjectMapper objectMapper = Jackson.newObjectMapper()
                                                 .registerModule(module);
        final String json = "{\"key\": \" Value \"}";
        final JsonNode jsonNode = objectMapper.readTree(json);

        final TestConfig testConfig = objectMapper.convertValue(jsonNode, TestConfig.class);
        Assert.assertEquals("Value", testConfig.getKey());
    }

    private static class TestConfig {
        private String key;

        public String getKey() {
            return key;
        }

        public void setKey(final String key) {
            this.key = key;
        }
    }

}
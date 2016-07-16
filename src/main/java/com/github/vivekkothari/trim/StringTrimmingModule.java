package com.github.vivekkothari.trim;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer;
import com.fasterxml.jackson.databind.module.SimpleModule;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;

/**
 * @author vivek.kothari on 16/07/16.
 */
public class StringTrimmingModule
        extends SimpleModule {

    public StringTrimmingModule() {
        addDeserializer(String.class, new StdScalarDeserializer<String>(String.class) {
            @Override
            public String deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException {
                return StringUtils.trim(jp.getValueAsString());
            }
        });
    }
}

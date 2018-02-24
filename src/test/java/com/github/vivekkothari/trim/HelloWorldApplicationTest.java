package com.github.vivekkothari.trim;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author by vivekkothari on 24/02/18.
 */
public class HelloWorldApplicationTest {

    @Test
    public void testAplication() throws Exception {
        HelloWorldApplication.main(new String[]{"server", "hello.yaml"});
        Assert.assertEquals("Stranger", HelloWorldApplication.config.getDefaultName());
    }

}

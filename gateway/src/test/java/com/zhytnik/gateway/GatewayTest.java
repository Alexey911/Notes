package com.zhytnik.gateway;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @author Alexey Zhytnik
 * @since 18.08.2016
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Gateway.class)
@WebAppConfiguration
public class GatewayTest {

    @Test
    public void loads() {
    }
}

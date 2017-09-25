package com.veera.test.swagger.impl;

import org.springframework.stereotype.Component;

/**
 * Created by Veeramani Bagavathi
 * on 9/11/2017.
 */
@Component
public class SwaggerService {
    public String testhello(String name) {
        return "Hello " + name;

    }
}

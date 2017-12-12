package com.sri.weldtest.model;

import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author elenius
 */
@ApplicationScoped
public class HelloApp {

    public HelloApp() {}

    public String hello() { return "Hello world!"; }

}

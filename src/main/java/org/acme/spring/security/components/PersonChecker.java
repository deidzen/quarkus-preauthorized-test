package org.acme.spring.security.components;

import org.springframework.stereotype.Component;

@Component
public class PersonChecker {
    public boolean check(String name) {
        return name.equals("John");
    }
}

package org.springcore.annotationBased;

import org.springframework.stereotype.Component;

@Component
public class Pacer implements BowlerType {
    @Override
    public void bowls() {
        System.out.println("Pacer bowls fast");
    }
}

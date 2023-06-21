package org.springcore.annotationBased;

import org.springframework.stereotype.Component;

@Component
public class Spinner implements BowlerType {
    @Override
    public void bowls() {
        System.out.println("Spinner bowls slow");
    }
}

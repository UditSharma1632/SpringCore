package org.springcore.annotationBased;

import org.springframework.stereotype.Component;

@Component
public class Medium implements BowlerType {
    @Override
    public void bowls() {
        System.out.println("I will bowl medium");
    }
}

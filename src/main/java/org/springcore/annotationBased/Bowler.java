package org.springcore.annotationBased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Bowler {

    BowlerType bowlerType;

    // We can use @Qualifier annotation on the bean instead of qualifier with constructor
    @Autowired
    public Bowler(@Qualifier("medium") BowlerType bowlerType){
        this.bowlerType = bowlerType;
    }

    public void startBowling(){
        this.bowlerType.bowls();
    }

}

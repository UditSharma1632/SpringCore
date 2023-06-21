package org.springcore.annotationBased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DeliveryIncoming{

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        Pacer pacer = applicationContext.getBean(Pacer.class);
        pacer.bowls();

        Spinner spinner = applicationContext.getBean(Spinner.class);
        spinner.bowls();

        Bowler bowler = applicationContext.getBean(Bowler.class);
        bowler.startBowling();
    }


}

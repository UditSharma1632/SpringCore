package org.springcore.assignment;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class MySQLDataSource implements DataSource{
    @Override
    public String[] getEmails() {

        String [] emails = {"uditsharma1632@gmail.com", "uditsharma926@gmail.com"};
        return emails;
    }
}

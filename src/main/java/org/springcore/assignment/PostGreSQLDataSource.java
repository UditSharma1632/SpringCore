package org.springcore.assignment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PostGreSQLDataSource implements DataSource{
    @Override
    public String[] getEmails() {
        String [] emails = {"uditsharma1632@gmail.com", "uditsharma926@gmail.com"};
        return emails;
    }
}

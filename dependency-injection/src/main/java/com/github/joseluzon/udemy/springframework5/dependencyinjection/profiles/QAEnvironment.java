package com.github.joseluzon.udemy.springframework5.dependencyinjection.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("qa")
public class QAEnvironment implements EnvironmentService {

    @Override
    public String getEnvironment() {
        return "QA";
    }
    
}

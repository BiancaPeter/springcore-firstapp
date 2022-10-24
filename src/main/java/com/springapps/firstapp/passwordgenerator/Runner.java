package com.springapps.firstapp.passwordgenerator;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {
    private final PasswordGenerator passwordGenerator;

    public Runner(@Autowired PasswordGenerator passwordGenerator) {
        this.passwordGenerator = passwordGenerator;
    }

    @Override
    public void run(String... args) {
        String generatedPassword = passwordGenerator.generatePass(5);
        System.out.println(generatedPassword);
        System.out.println(passwordGenerator.encode(generatedPassword));
    }
}

package com.beyzayuksel.springboot.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.beyzayuksel.springboot.backend.model.User;
import com.beyzayuksel.springboot.backend.repository.UserRepository;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootBackendApplication.class, args);
    }

    // UserRepository veya herhangi bir class main ile aynı package icinde değilse hata veriyor.
    @Autowired
    private UserRepository userRepository;


	@Override
    public void run(String... args) throws Exception {
      this.userRepository.save(new User("Beyza", "Yuksel", "beyza@gmail.com"));
      this.userRepository.save(new User("Ayse", "Salik", "ayse@gmail.com"));
      this.userRepository.save(new User("Meral", "Cebeci", "meral@gmail.com"));
      this.userRepository.save(new User("Tom", "Cruise", "tom@gmail.com"));
      this.userRepository.save(new User("Justin", "Timberlake", "justin@gmail.com"));
      this.userRepository.save(new User("Jonny", "Depp", "depp@gmail.com"));

    }
}

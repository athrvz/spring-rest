package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
  @Bean
  CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
    return args -> {
      Student alice = new Student(
						"Alice",
						LocalDate.of(2003, Month.JULY, 2),
						"alice@gmail.com");

      Student bob = new Student(
						"Bob",
						LocalDate.of(2001, Month.SEPTEMBER, 6),
						"bob@gmail.com");

      studentRepository.saveAll(List.of(alice, bob));
    };
  }
}

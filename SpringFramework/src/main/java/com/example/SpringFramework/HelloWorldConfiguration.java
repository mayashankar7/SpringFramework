package com.example.SpringFramework;

import org.springframework.context.annotation.Bean;
record Person(String name, int age, Address address) { }
record Address(String firstLine, String city){ }
public class HelloWorldConfiguration {
    @Bean
    public String name(){
        return "Maya Shankar";
    }
    @Bean
    public int age(){
        return 25;
    }
    @Bean
    public Person person(){
        return new Person("Maya Shankar", 25,new Address("123 Main St", "Gurugram") );
    }

    @Bean
    public Person person2(){
        return new Person(name(), age(), address());
    }
    @Bean
    public Person person3(String name, int age, Address address){
        return new Person(name, age, address);

    }
    @Bean(name = "address")
    public Address address(){
        return new Address("123 Main St", "Gurugram");
    }
}

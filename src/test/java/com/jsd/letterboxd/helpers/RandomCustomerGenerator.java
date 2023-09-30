package com.jsd.letterboxd.helpers;

import com.github.javafaker.Faker;
import com.jsd.letterboxd.models.Customer;

public class RandomCustomerGenerator {

    public static Customer getRandomCustomer() {

        Faker faker = new Faker();
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String zipCode = faker.address().zipCode();

        return new Customer()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setZipCode(zipCode);
    }
}

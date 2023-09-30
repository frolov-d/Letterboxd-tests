package com.jsd.letterboxd.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@Getter
@Setter
@ToString
@Accessors(chain = true)
public class Customer {

    private String firstName;
    private String lastName;
    private String zipCode;
}

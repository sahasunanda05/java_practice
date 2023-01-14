package com.jap.validator;

import java.util.Arrays;
import java.util.List;

public class CredentialsValidatorImpl {
    public String validateUser(String name, String password) {
        CredentialsValidator credentialsValidator = (nm, pwd) -> {

            if (nm == "admin" && pwd == "1234") {
                return "valid user";
            } else {

                return "invalid user";
            }
        };
        return credentialsValidator.validator(name,password);
    }
}

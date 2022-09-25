package com.sda;

import java.util.Objects;

public class StringUtils {

//  Napisz metodę "capitalize", która zwróci Twoje imię napisane z duzej litery.

    public static String capitalize(String name) {

        if (name == null) {
            return null;
        }

        if ("".equals(name)) {
            return "";
        }

        String firstLetter = name.substring(0, 1);
        firstLetter = firstLetter.toUpperCase();

        String secondPart = name.substring(1).toLowerCase();

        return firstLetter + secondPart;
    }


}

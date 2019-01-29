package com.company.sdacademy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static boolean isHexNumber(String number) {
        Pattern pattern = Pattern.compile("^(0x)?([0-9A-F]+)$");
        Matcher matcher = pattern.matcher(number);
        // .find() method can be changet too --> >matches
        //.matches() - ads ^ at start of regex and $ at the end
        return matcher.find();
    }

    public static String getPhoneNumber(String fullNumber) {
        Pattern pattern = Pattern.compile("[+]?(370|8)(6|5)(?<phonenumber>[0-9]+)");
        Matcher matcher = pattern.matcher(fullNumber);
        if (matcher.find()) {
            return matcher.group("phonenumber");
        } else {
            return "?";
        }

    }


    public static void main(String[] args) {
        String[] examples = {"1FFA", "0xBF", "H42", "82G"};
        for (String number : examples) {
            if (isHexNumber(number)) {
                System.out.println(number + "Is ok");
            } else {
                System.out.println(number + "is not a hex number");
            }
        }
        String number = "+3706555555";
        System.out.println("Number is: " + getPhoneNumber(number));

        double a = 2.45;                          // a method too round numbers up
        System.out.println((int) Math.round(a));   // a method too round numbers up just round up
        System.out.println((int) Math.floor(a));   // a method too round numbers up too the lowest limit
        System.out.println((int) Math.ceil(a));    // a method too round numbers up too the max limit


    }



}



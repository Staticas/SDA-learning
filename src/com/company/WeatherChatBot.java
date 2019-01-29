package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class WeatherChatBot {
    public static boolean isCold(String ans) {
        String[] words = {"cold", "freezing", "chilly"};
        for (String w : words) {
            if (ans.toLowerCase().contains(w)) {
                return true;
            }
        }
        return false;
    }
    // UperCase = WORD
    // LowerCase =word
    // cripto language  Levenshtein distance

    public static boolean isHot(String answer) {
        String[] hotWords = {"hot", "warm", "sunny"};
        String[] answerWords = answer.split(" ");
        for (String hotWord : hotWords) {
            for (String ansWord : answerWords) {
                if (hotWord.equalsIgnoreCase(ansWord)) {
                    return true;
                }
            }
        }
        return false;

    }

    public static boolean isRainy(String ans) {
        String[] rainyWords = {"wet", "rainy", "raining"};
        return Arrays
                .stream(ans.split(" "))
                .map((x) -> x.toLowerCase())
                .map((x) -> x.trim()) // remuves white spaces
                .filter((x) -> {
                    for (String r : rainyWords) {
                        if (r.equalsIgnoreCase(x)) {
                            return true;
                        }
                    }
                    return false;
                })

                .findAny()

                .isPresent();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("So what's the weather out side like?");
        System.out.print("Answer: ");

        String answer = scanner.nextLine();

        if (isCold(answer)) {
            System.out.println("Yep, it's very cold");
        }
        else if (isHot(answer)) {
            System.out.println("Damn hot!");
        }
        else if (isRainy(answer)) {
            System.out.println("Yep, it's rainy");
        }
        else{
            System.out.println("Sorry, What?");
        }

    }
}

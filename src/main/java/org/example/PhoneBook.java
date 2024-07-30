package org.example;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private final Map<String, String> namesToNumbers;
    private final Map<String, String> numbersToNames;

    public PhoneBook() {
        namesToNumbers = new HashMap<>();
        numbersToNames = new HashMap<>();
    }

    public int add(String name, String number) {
        namesToNumbers.put(name, number);
        numbersToNames.put(number, name);
        return namesToNumbers.size();
    }

    public String findByNumber(String number) {
        return numbersToNames.get(number);
    }

    public String findByName(String name) {
        return null;
    }
}

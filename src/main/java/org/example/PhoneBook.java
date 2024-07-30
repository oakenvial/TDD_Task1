package org.example;

import java.util.*;

public class PhoneBook {
    private final Map<String, String> namesToNumbers;
    private final Map<String, String> numbersToNames;
    private final List<String> sortedNames;

    public PhoneBook() {
        namesToNumbers = new HashMap<>();
        numbersToNames = new HashMap<>();
        sortedNames = new ArrayList<>();
    }

    public int add(String name, String number) {
        namesToNumbers.put(name, number);
        numbersToNames.put(number, name);
        sortedNames.add(name);
        sortedNames.sort(String::compareTo);
        return namesToNumbers.size();
    }

    public String findByNumber(String number) {
        return numbersToNames.get(number);
    }

    public String findByName(String name) {
        return namesToNumbers.get(name);
    }

    public List<String> printAllNames() {
        return sortedNames;
    }
}

package org.example;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private final Map<String, String> entries;

    public PhoneBook() {
        entries = new HashMap<>();
    }

    public int add(String name, String number) {
        entries.put(name, number);
        return entries.size();
    }

    public String findByNumber(String number) {
        return null;
    }
}

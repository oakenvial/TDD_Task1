package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookTest {
    @Test
    public void testAdd_oneEntry() {
        final String name = "Test name";
        final String number = "+79991001010";
        PhoneBook phoneBook = new PhoneBook();

        assertEquals(1, phoneBook.add(name, number));
    }

    @Test
    public void testAdd_twoEntries() {
        final String name1 = "Test name 1";
        final String number1 = "+79991001011";
        final String name2 = "Test name 2";
        final String number2 = "+79991001012";
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add(name1, number1);

        assertEquals(2, phoneBook.add(name2, number2));
    }

    @Test
    public void testFindByNumber() {
        final String name1 = "Test name 1";
        final String numberA = "+79991001011";
        final String name2 = "Test name 2";
        final String name3 = "Test name 3";
        final String numberB = "+79991001012";
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add(name1, numberA);
        phoneBook.add(name2, numberB);
        phoneBook.add(name2, numberB);

        assertEquals(name1, phoneBook.findByNumber(numberA));
        assertTrue(phoneBook.findByNumber(numberB).equals(name2) || phoneBook.findByNumber(numberB).equals(name3));
    }
}
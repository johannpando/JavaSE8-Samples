package org.javase8.collectionsample;

import java.util.Arrays;

/**
 *
 * @author Masudul Haque
 */
public class SortTest {

    public static void main(String[] args) {
//        List<Person> list=Person.createRoster();
//        list.stream().sorted((a,b)-> b.getName().compareTo(a.getName())).forEach(p -> System.out.println(p.getName()));
        String[] stringArray = {"Barbara", "James", "Mary", "John",
            "Patricia", "Robert", "Michael", "Linda","abc"};
        Arrays.sort(stringArray, String::compareToIgnoreCase);
        for (String string : stringArray) {
            System.out.println(string);
        }
        
    }
}

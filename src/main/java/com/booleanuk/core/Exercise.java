package com.booleanuk.core;

import com.booleanuk.helpers.ExerciseBase;

import java.util.ArrayList;
import java.util.HashMap;

public class Exercise extends ExerciseBase {
    /*
        The final fundamental building block of Java is a Map. There is still much to learn about the language,
        but this component will allow you to start building lots of more complex pieces of software.

        A map is like a list, except we have control over what we use for an item's index. This allows us to use
        types other than an incrementing integer to describe the positions of the data contained in the structure.

        Like Lists, Maps have a variety of different implementations. We'll focus on the HashMap in this exercise.

        We create a HashMap like this:
        HashMap<K, V>
        K is where you'd put the data type of the key for an item, V is the data type of the value.
        If we wanted to map a persons details (their first name, last name, occupation etc.), we could use
        a HashMap using a String key and a String value like so:
        HashMap<String, String>
     */

    /*
        Spend some time understanding the method below
        - It creates a HashMap of String, String key value pairs
        - It adds some keys with values
        - Under the hood, the Map would look like this: { "firstName": "Nathan", "lastName": King, etc. }
        - It returns the HashMap
        https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/util/Map.html
     */
    public HashMap<String, String> createPerson() {
        HashMap<String, String> map = new HashMap<>();

        map.put("firstName", "Nathan");
        map.put("lastName", "King");
        map.put("occupation", "Software Developer");

        return map;
    }

    public String getValue(String key) {
        return createPerson().get(key);
    }

    public boolean hasKey(HashMap<String, String> map, String key) {
        return map.containsKey(key);
    }

    public int getValueOrDefault(HashMap<String, Integer> map, String key) {
        return map.getOrDefault(key, -1);
    }

    public ArrayList<String> buildSecretPhrase(ArrayList<Integer> numbers) {
        // Do not modify the map
        HashMap<Integer, String> map = new HashMap<>();
        map.put(23, "chicken");
        map.put(42, "universe");
        map.put(165, "soup");
        map.put(6712, "bass");
        map.put(7, "muse");
        map.put(96, "nice");
        // Write your code below this comment...

        ArrayList<String> resultList = new ArrayList<>();
        numbers.forEach(number -> {
            boolean keyExists = map.containsKey(number);
            if (keyExists) {
                resultList.add(map.get(number));
            }
        });

        // Change the return statement below to return your actual ArrayList
        return resultList;
    }
}

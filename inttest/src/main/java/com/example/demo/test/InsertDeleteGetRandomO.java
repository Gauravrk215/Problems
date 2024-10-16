package com.example.demo.test;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class InsertDeleteGetRandomO {
    private ArrayList<Integer> list;          // Store elements
    private HashMap<Integer, Integer> map;    // Store element index in the list
    private Random random;                    // For generating random indices

    public InsertDeleteGetRandomO() {
        list = new ArrayList<>();
        map = new HashMap<>();
        random = new Random();
    }

    // Inserts an item val into the set if not present
    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false; // Element already present
        }
        // Add to list and map
        map.put(val, list.size());
        list.add(val);
        return true;
    }

    // Removes an item val from the set if present
    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false; // Element not present
        }
        // Get the index of the element to remove
        int index = map.get(val);
        int lastElement = list.get(list.size() - 1);

        // Swap the element with the last one for O(1) removal
        list.set(index, lastElement);
        map.put(lastElement, index);

        // Remove the last element
        list.remove(list.size() - 1);
        map.remove(val);
        return true;
    }

    // Returns a random element from the set
    public int getRandom() {
        int randomIndex = random.nextInt(list.size());
        return list.get(randomIndex);
    }
}

package org.howard.edu.lsp.finalExam;

import java.util.HashMap;

public class MapUtilities {
	/**
     * @param HashMap<String, String>, HashMap<String, String>: the two maps to be compared
     * @return int: count of common key value pairs
     * @throws NullMapException: if either map is null
     * 
     * This method returns the number of common key value pairs of two maps
     */
    public static int MatchingPairs(HashMap<String, String> map1, HashMap<String, String> map2) throws NullMapException {
    	// checking if passed in maps are null
        if (map1 == null || map2 == null) {
            throw new NullMapException("Null Map(s) passed: Can't operate on Null Map(s)!");
        }
        // checking if passed in maps are empty
        if (map1.isEmpty() || map2.isEmpty()) {
            return 0;
        }
        // checking for common key value pairs
        int count = 0;
        for (String key : map1.keySet()) {
            if (map2.containsKey(key) && map1.get(key).equals(map2.get(key))) {
                count++;
            }
        }
        return count;
    }
}

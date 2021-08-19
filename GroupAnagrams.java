package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

    private static List<List<String>> groupAnagrams(String strs[]) {

        Map<Map<Character, Integer>, List<String>> anagramMap = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            Map<Character, Integer> frequencyMap = new HashMap<>();
            populateFrequencyMap(strs[i], frequencyMap);
            if (!anagramMap.containsKey(frequencyMap)) {
                List<String> anagramList = new ArrayList<>();
                anagramList.add(strs[i]);
                anagramMap.put(frequencyMap, anagramList);
            } else {
                List<String> mappedList = anagramMap.get(frequencyMap);
                mappedList.add(strs[i]);
                anagramMap.put(frequencyMap, mappedList);
            }
        }

        List<List<String>> groupedAnagramList = new ArrayList<>();
        for (Map.Entry<Map<Character, Integer>, List<String>> entry : anagramMap.entrySet()) {
            groupedAnagramList.add(entry.getValue());
        }
        return groupedAnagramList;
    }

    private static void printAnagrams(List<String> list) {
        list.stream().forEach(e -> System.out.println(e));
        System.out.println("-------------------");
    }

    private static void populateFrequencyMap(String str, Map<Character, Integer> frequencyMap) {

        for (int i = 0; i < str.length(); i++) {
            if (!frequencyMap.containsKey(str.charAt(i))) {
                frequencyMap.put(str.charAt(i), 1);
            } else {
                int count = frequencyMap.get(str.charAt(i));
                count += 1;
                frequencyMap.put(str.charAt(i), count);
            }
        }

    }

    public static void main(String[] args) {

      //  String str[] = { "eat", "tea", "tan", "ate", "nat", "bat" };
      String str[]={"a"};
        List<List<String>> anagramGrouppedList = groupAnagrams(str);
        anagramGrouppedList.stream().forEach(list -> printAnagrams(list));

    }
}

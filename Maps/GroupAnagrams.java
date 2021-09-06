package DS.Maps;

import java.util.*;

public class GroupAnagrams {
        public List<List<String>> groupAnagrams(String[] strs) {

            Map<String,List<String>> m = new HashMap<>();

            for(String s:strs){
                char[] arr = s.toCharArray();
                Arrays.sort(arr);

                String sorted = new String(arr);

                if(!m.containsKey(sorted)){
                    m.put(sorted,new LinkedList<String>());
                }
                m.get(sorted).add(s);
            }

            return new LinkedList<>(m.values());

        }
}

package DS.Maps;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmap {

    public static void main(String[] args){


        Map<String,Integer> numbers = new HashMap<>();

        numbers.put("one",1);
        numbers.put("two",2);
        numbers.put("three",2);

        Set<Entry<String,Integer>> entries = numbers.entrySet();
        for(Entry<String,Integer> entry: entries){
            entry.setValue(entry.getValue() * 100);
        }

        System.out.print(numbers);
    }
}

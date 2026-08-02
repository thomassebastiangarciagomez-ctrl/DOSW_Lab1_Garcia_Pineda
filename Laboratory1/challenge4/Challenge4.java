package challenge4;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Class about the solution of challenge 4 from Laboratory 1
 *
 */
public class Challenge4 {
    
    public Challenge4(){}

    /**
     * This method is the equivalent to a hash table from the challenge 4 of Laboratory 1
     * 
     * @param data: Any map type that represents our entrys
     * @return Map type that represent the hash table
     */
    public Map<String, Integer> hashTableMethod(List<Map.Entry<String, Integer>> data){
        return data.stream()
            .map(entry -> Map.entry(entry.getKey().toUpperCase(), entry.getValue()))
            .sorted(Map.Entry.comparingByKey())
            .collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (existing, replacement) -> existing,
                LinkedHashMap::new
            ));
    }

    public static void main(String[] args){
        Challenge4 challenge4 = new Challenge4();
         List<Map.Entry<String, Integer>> hashtableData = List.of(
            Map.entry("silver", 8),
            Map.entry("ruby", 4),
            Map.entry("gold", 12),
            Map.entry("emerald", 6),
            Map.entry("gold", 90)
         );

        Map<String, Integer> result = challenge4.hashTableMethod(hashtableData);

        result.forEach((key, value) -> System.out.println("Key: " + key + " | Value: " + value));
    }
}

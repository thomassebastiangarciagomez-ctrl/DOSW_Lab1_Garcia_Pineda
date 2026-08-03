package challenge4;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Class about the solution of challenge 4 from Laboratory 1
 *
 */
public class Challenge4{
  
    public Challenge4(){}
  
    /**
    * This method works on a hashMap method that was requested
    *
    * @param data: List of pair elements
    * @return Map type that represent the hash table
    */
    public HashMap<String,Integer> hashMapMethod(List<Pair> data){
        HashMap<String,Integer> salida = data.stream().collect(Collectors.toMap(
            p -> p.getF(),
            p -> p.getS(),
            (before,after) -> before,
            () -> new HashMap<String,Integer>()
        ));
        return salida;
    }
  
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
  
    public Map<String, Integer> hashMetod(Map<String, Integer> hashMapData, Map<String, Integer> hashtableData){
        Stream<Map.Entry<String, Integer>> combinedStream = Stream.concat(
          hashMapData.entrySet().stream(),
          hashtableData.entrySet().stream()
        );

        return combinedStream
        .map(entry -> Map.entry(entry.getKey().toUpperCase(), entry.getValue()))
        .sorted(Map.Entry.comparingByKey())
        .collect(Collectors.toMap(
            Map.Entry::getKey,
            Map.Entry::getValue,
            (fromHashMap, fromHashtable) -> fromHashtable,  // el segundo stream (Hashtable) gana en caso de choque
            LinkedHashMap::new
        ));
    }
  
    public static void main(String[] args){
        Challenge4 ch = new Challenge4();
        List<Pair> data = new ArrayList<>();
        data.add(new Pair("gold",5));
        data.add(new Pair("silver",3));
        data.add(new Pair("gold",7));
        data.add(new Pair("diamond",10));
        HashMap<String,Integer> hm = ch.hashMapMethod(data);
      
        List<Map.Entry<String, Integer>> hashtableData = List.of(
            Map.entry("silver", 8),
            Map.entry("ruby", 4),
            Map.entry("gold", 12),
            Map.entry("emerald", 6)
         );
        Map<String, Integer> ht = ch.hashTableMethod(hashtableData);
        
        Map<String, Integer> merged = ch.hashMetod(hm, ht);
        merged.forEach((key, value) -> System.out.println("Key: " + key + " | Value: " + value));
    }
}
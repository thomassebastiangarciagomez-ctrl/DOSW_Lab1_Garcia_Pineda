package challenge4;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.List;
import java.util.ArrayList;

public class Challenge4{
    public Challenge4(){

    }
    public HashMap<String,Integer> hashMapMethod(List<Pair> data){
        HashMap<String,Integer> salida = data.stream().collect(Collectors.toMap(
            p -> p.getF(),
            p -> p.getS(),
            (before,after) -> before,
            () -> new HashMap<String,Integer>()
        ));
        return salida;
    }

    public static void main(String[] args){
        Challenge4 ch = new Challenge4();
        List<Pair> data = new ArrayList<>();
        data.add(new Pair("gold",5));
        data.add(new Pair("silver",3));
        data.add(new Pair("gold",7));
        data.add(new Pair("diamond",10));
        
        HashMap<String,Integer> hm = ch.hashMapMethod(data);
        hm.entrySet().stream()
            .sorted(Map.Entry.comparingByKey())
            .map(s -> Map.entry(s.getKey().toUpperCase(),s.getValue()))
            .forEach(s -> System.out.println("Key: "+s.getKey()+" | Value: "+s.getValue()));
        
    }


}
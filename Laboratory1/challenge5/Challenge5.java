package challenge5;
import java.util.List;
import java.util.stream.Collectors;
import java.util.HashSet;

public class Challenge5{
    public Challenge5(){

    }

    public HashSet<Integer> hashSetMethod(List<Integer> numbers){
        return numbers.stream().filter(n -> n%3 != 0).collect(Collectors.toCollection(HashSet::new));
    }

    public static void main(String[] args){
        Challenge5 ch = new Challenge5();
        HashSet<Integer> hs = ch.hashSetMethod(List.of(4,9,15,7,18,21,10,5));
        hs.stream().forEach(e -> System.out.println("Number in the arena: "+e));
    }
}
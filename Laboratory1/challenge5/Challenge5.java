package challenge5;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;
import java.util.HashSet;
import java.util.stream.Stream;
/**
 * Class about the solution of challenge 5 from Laboratory 1, it´s importante to mention that the
 * size of tree set were not mencioned
 * 
 */
public class Challenge5{
    public Challenge5(){

    }

    public HashSet<Integer> hashSetMethod(List<Integer> numbers){
        return numbers.stream().filter(n -> n%3 != 0).collect(Collectors.toCollection(HashSet::new));
    }
  /**
     * This method create a tree set with random integers and filter the numbers with the condition that
     * the multiples of 5 will be pop on the tree set
     * 
     * @return Tree set that represent the element that we are founding
     */
    public TreeSet<Integer> treeGroup(List<Integer> numbers){
        return tree.stream()
                .filter(n -> n % 5 != 0)
                .collect(Collectors.toCollection(TreeSet::new));
    }

    public static void main(String[] args){
        Challenge5 ch = new Challenge5();
        HashSet<Integer> hs = ch.hashSetMethod(List.of(4,9,15,7,18,21,10,5));
        hs.stream().forEach(e -> System.out.println("Number in the arena: "+e));
    }
}






package challenge5;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Class about the solution of challenge 4 from Laboratory 1, it´s importante to mention that the
 * size of tree set were not mencioned
 * 
 */
public class Challenge5 {
    private int quantity;

    public Challenge5(){
        quantity = 7;
    }

    /**
     * This method create a tree set with random integers and filter the numbers with the condition that
     * the multiples of 5 will be pop on the tree set
     * 
     * @return Tree set that represent the element that we are founding
     */
    public TreeSet<Integer> treeGroup(){
        Random random = new Random();

        TreeSet<Integer> tree = Stream.generate(() -> random.nextInt(30) + 1)
                .distinct()
                .limit(quantity)
                .collect(Collectors.toCollection(TreeSet::new));

        return tree.stream()
                .filter(n -> n % 5 != 0)
                .collect(Collectors.toCollection(TreeSet::new));
    }

    public static void main(String[] args){
        Challenge5 challenge5 = new Challenge5();

        TreeSet<Integer> tree = challenge5.treeGroup();
        tree.forEach(value -> System.out.println("Number in the arena: " + value));
    }
}

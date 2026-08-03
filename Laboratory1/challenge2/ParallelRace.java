package challenge2;
import java.util.function.Function;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/**
 * This class is form the challenge 2 of the laboratory 1 DOSW
 * 
 */
public class ParallelRace {
    
      
    private ArrayList<Integer> numbers;

    /**
     * Initializer of the class ParallelRace
     * @param numbers ArrayList of Integers that we are working in
     */
    public ParallelRace(ArrayList<Integer> numbers){
        this.numbers = new ArrayList<>();
        this.numbers = numbers;
    }
  
    public Function<List<Integer>,Integer> maximum = l -> Collections.max(l);

    public Function<Integer,Boolean> isEven = n -> n%2==0 ? true : false;

    /**
     * This method works on search the minimun value in a ArrayList of Integers
     * 
     * @param numbers ArrayList of Integers that we are working in
     * @return Integer that represent the minimun value from array
     */
    public int minNum(){
        int lessMin = numbers.stream()
            .min((a, b) -> a.compareTo(b))
            .orElse(null);

        return lessMin;
    }

    /**
     * This method works on count all elements in a ArrayList of Integers
     * 
     * @return Integer that represent the number of elements in the array
     */
    public int countElements(){
        return numbers.size();
    }

    /**
     * This method works on a create a collition between version in git without validations
     * 
     */
    public void firstCollition(){
        System.out.println("Maximun value of the array is: " + maximum.apply(numbers));
        System.out.println("Minimun value of the array is: " + minNum());
        System.out.println("Count of elements in the array is: " + countElements());
    }

    public void secondCollition(){
        int size = countElements();
        System.out.println( isEven.apply(size) ? "The size is even" : "The size is not even");
    }

    /**
     * This is the main method of the second challenge of laboratory 1
     * 
     * @param args
     */
    public static void main(String[] args){
        ParallelRace parallelRace = new ParallelRace(new ArrayList<>(List.of(1,2,3,45,3,1,0)));
        parallelRace.firstCollition();
        parallelRace.secondCollition();                               
    }
}

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

    /**
     * This funtion works on search the maximun value in a ArrayList of Integers
     * 
     * @return Integer that represent the maximun value from array
     */
    public Function<List<Integer>,Integer> maximum = l -> Collections.max(l);

    public Function<Integer,Boolean> isEven = n -> n%2==0 ? true : false;

    /**
     * This funtion works on search the minimun value in a ArrayList of Integers
     * 
     * @return Integer that represent the minimun value from array
     */
    public Function<List<Integer>,Integer> minimun = l -> Collections.min(l);

    /**
     * This method works on count all elements in a ArrayList of Integers
     * 
     * @return Integer that represent the number of elements in the array
     */
    public int countElements(){
        return numbers.size();
    }

    /**
     * This metod works on a decide if the maximun integer in the array is divisor of 2 or not
     * 
     * @param number Integer that represent the maximun number in the array
     * @return Boolean that represent the result of the evaluation
     */
    public boolean isDivisorOf2(int number){
        return (number % 2 == 0) ? true : false;            // This is a ternary operator and it mencioned in the explanation of the challenge 2
    }

    /**
     * This metod works on a decide if the size of the array is odd or not
     * 
     * @param sizeOf Integer that represent the size of the array
     * @return Boolean that represent the result of the evaluation
     */
    public boolean sizeIsOdd(int sizeOf){
        return (sizeOf % 2 == 0) ? false : true;            // This is a ternary operator and it mencioned in the explanation of the challenge 2
    }

    /**
     * This method works on a create a collition between version in git without validations
     * 
     */
    public void firstCollition(){
        System.out.println("Maximun value of the array is: " + maximum.apply(numbers));
        System.out.println("Minimun value of the array is: " + minimun.apply(numbers));
        System.out.println("Count of elements in the array is: " + countElements());
    }

    /**
     * This method works on a create a collition between version in git with validations
     * in this moment is in construction
     * 
     */
    public void secondCollition(){
        System.out.println("Maximun value of the array is: " + maximum.apply(numbers));
        System.out.println("Minimun value of the array is: " + minimun.apply(numbers));
        System.out.println("Count of elements in the array is: " + countElements());
        System.out.println("Maximun value of the array is multiple of 2: " + isDivisorOf2(maximum.apply(numbers)));
        System.out.print("The size of the list is: ");
        if(isEven.apply(countElements())){
          System.out.println("Even");
        }else{
          System.out.println("Odd");
        }
    }

    /**
     * This is the main method of the second challenge of laboratory 1
     * 
     * @param args
     */
    public static void main(String[] args){
        ParallelRace parallelRace = new ParallelRace(new ArrayList<>(List.of(1,2,3,45,3,1,0)));
        System.out.println("First collition: ");
        parallelRace.firstCollition();
        System.out.println("\nSecond collition: ");
        parallelRace.secondCollition();
    }
}

package challenge2;
import java.util.*;

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
        System.out.println("Minimun value of the array is: " + minNum());
        System.out.println("Count of elements in the array is: " + countElements());
    }

    /**
     * This method works on a create a collition between version in git with validations
     * in this moment is in construction
     * 
     */
    public void secondCollition(){
        int maxNumber = 0;
        int minNumber = minNum();
        System.out.println("Maximun value of the array is: " + maxNumber);
        System.out.println("Minimun value of the array is: " + minNumber);
        System.out.println("Count of elements in the array is: " + countElements());
        System.out.println("The size of the list is odd: " + sizeIsOdd(numbers.size()));
    }

    /**
     * This is the main method of the second challenge of laboratory 1
     * 
     * @param args
     */
    public static void main(String[] args){
        ParallelRace parallelRace = new ParallelRace(null);
        parallelRace.firstCollition();
        //parallelRace.secondCollition();                               //This method is in construction
    }
}

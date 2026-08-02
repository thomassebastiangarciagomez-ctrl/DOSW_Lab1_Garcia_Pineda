package challenge3;

import java.util.List;

/**
 * This class is about the challenge 3 The mysterious Echo
 * 
 */
public class Challenge3 {
    
    public Challenge3(){}

    public String repetitionMessage(String message){
        StringBuilder sb = new StringBuilder(message);
        List<Integer> li = List.of(1,2);
        li.stream().forEach(i -> sb.append(" "+message));
        return sb.toString();

    }

    public void collitionMethod(String message){
        System.out.println(repetitionMessage(message));
    }

    public static void main(String[] args){
        Challenge3 challenge3 = new Challenge3();
        String s =challenge3.repetitionMessage("Holla");
        challenge3.collitionMethod("Hello World!!");
    }
}
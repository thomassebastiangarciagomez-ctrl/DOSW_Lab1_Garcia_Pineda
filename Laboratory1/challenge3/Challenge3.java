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

    /**
     * This method have the work of reverses a message that it recived
     * 
     * @param message String that represents the message that was given
     * @return String that represents the message reverses
     */
    public String reverseMessage(String message){
        StringBuffer buffer = new StringBuffer(message);
        return buffer.reverse().toString();
    }

    /**
     * This method have the work of create a collition in git
     * 
     * @param message String that represents the message that was given
     */
    public void collitionMethod(String message){
        System.out.println(reverseMessage(message));
        System.out.println(repetitionMessage(message));
    }

    public static void main(String[] args){
        Challenge3 challenge3 = new Challenge3();
        challenge3.collitionMethod("Hello World!!");
    }
}


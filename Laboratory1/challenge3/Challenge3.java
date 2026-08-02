package challenge3;

/**
 * This class is about the challenge 3 The mysterious Echo
 * 
 */
public class Challenge3 {
    
    public Challenge3(){}

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
    }

    public static void main(String[] args){
        Challenge3 challenge3 = new Challenge3();

        challenge3.collitionMethod("Hello World!!");
    }
}

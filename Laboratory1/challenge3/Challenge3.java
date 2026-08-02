package challenge3;

/**
 * This class is about the challenge 3 The mysterious Echo
 * 
 */
public class Challenge3 {
    
    public Challenge3(){}

    public String repetitionMessage(String message){
        StringBuilder sb = new StringBuilder(message);
        for(int i=0; i<2; i++){
            sb.append(" "+message);
        }
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
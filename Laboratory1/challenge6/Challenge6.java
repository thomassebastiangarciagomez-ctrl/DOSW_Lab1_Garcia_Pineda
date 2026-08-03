package challenge6;
import java.util.*;

/**
 * Class about the solution of challenge 6 from Laboratory 1
 * 
 */
public class Challenge6 {
    private Map<String, Runnable> commands;

    public Challenge6(){
        commands = new HashMap<>();
        registerComand();
    }

    /**
     * This method works on register the commands in the HashMap type <String, Runnable>
     * 
     */
    public void registerComand(){
        commands.put("JOKE", () -> System.out.println("Why did the RAM break up with the CPU? It needed space."));
        commands.put("SHOUT", () -> System.out.println("STACK OVERFLOW ALERT!"));
        commands.put("WHISPER", () -> System.out.println("Shhh... the bugs are sleeping."));
        commands.put("ANALYZE", () -> System.out.println("Processing data... result: You are amazing at programming!"));
        commands.put("GREET", () -> System.out.println("Greetings, traveler of time and code!"));
        commands.put("FAREWELL", () -> System.out.println("May the bits be with you until the next mission."));
        commands.put("SING", () -> System.out.println("01010101"));
        commands.put("DANCE", () -> System.out.println("Spinning in party mode."));
    }

    /**
     * This method works on execute the command that was given
     * 
     * @param command String that represent the command
     */
    public void executeComand(String command){
        Runnable action;
        switch (command) {
            case "JOKE": action = commands.get("JOKE");         break;
            case "SHOUT": action = commands.get("SHOUT");       break;
            case "WHISPER": action = commands.get("WHISPER");   break;
            case "ANALYZE": action = commands.get("ANALYZE");   break;
            case "GREET": action = commands.get("GREET");     break;
            case "FAREWELL": action = commands.get("FAREWELL"); break;
            case "SING": action = commands.get("SING");   break;
            case "DANCE": action = commands.get("DANCE");  break;
            default: action = () -> System.out.println("Unknown command: " + command);
        }
        action.run();
    }

    public static void main(String[] args){
        Challenge6 challenge6 = new Challenge6();
        challenge6.executeComand("GREET");
        challenge6.executeComand("JOKE");
        challenge6.executeComand("ANALYZE");
        challenge6.executeComand("DANCE");
    }
}

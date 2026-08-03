package challenge6;
import java.util.*;

public class Challenge6 {
    private Map<String, Runnable> commands;

    public Challenge6(){
        commands = new HashMap<>();
        registerComand();
    }

    public void registerComand(){
        commands.put("GREET", () -> System.out.println("Greetings, traveler of time and code!"));
        commands.put("FAREWELL", () -> System.out.println("May the bits be with you until the next mission."));
        commands.put("SING", () -> System.out.println("01010101"));
        commands.put("DANCE", () -> System.out.println("Spinning in party mode."));
    }

    public void executeComand(String command){
        Runnable action;
        switch (command) {
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
        challenge6.executeComand("FAREWELL");
        challenge6.executeComand("SING");
        challenge6.executeComand("DANCE");
        challenge6.executeComand("OTHER");
    }
}
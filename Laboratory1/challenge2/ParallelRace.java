package challenge2;
import java.util.function.Function;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ParallelRace {
    public Function<List<Integer>,Integer> maximum = l -> Collections.max(l);

    public void firstCollition(){
        System.out.println(maximum.apply(new ArrayList<Integer>(List.of(1,2,3,56,2,1))));
    }
}

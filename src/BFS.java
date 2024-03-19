import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class BFS {
    final int HORE = 1;
    final int DOLE = 2;
    final int DOPRAVA = 3;
    final int DOLAVA = 4;
    private Pole pole;
    private LinkedList<Pole> queue = new LinkedList<>();
    private HashSet<Pole> pozrene = new HashSet<>();

    public BFS(){
        Pole pole = new Pole();
        queue.addFirst(pole);
        pozrene.add(pole);
        System.out.println("Starting position:\n" + pole);

        while(!queue.isEmpty()){
            Pole tmp = queue.poll();
            if(tmp.jeReseni()){
                //System.out.println(tmp);
                System.out.println("BFS Solution: " + tmp.getPohyby());
                break;
            }
            for (int move : Arrays.asList(HORE, DOLE, DOPRAVA, DOLAVA)) {
                Pole next = tmp.klonujAPohni(move);
                if (!pozrene.contains(next)) {
                    queue.add(next);
                    pozrene.add(next);
                }
            }
        }
    }
}

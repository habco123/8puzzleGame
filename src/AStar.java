import java.util.*;

public class AStar {
    final int HORE = 1;
    final int DOLE = 2;
    final int DOPRAVA = 3;
    final int DOLAVA = 4;
    private PriorityQueue<Pole> open = new PriorityQueue<>(new Comparator<Pole>() {
        @Override
        public int compare(Pole o1, Pole o2) {
            return Integer.compare(o1.cost(), o2.cost());
        }
    });
    private HashSet<Pole> pozrene = new HashSet<>();

    public AStar (){
        Pole pole = new Pole();
        open.add(pole);
        pozrene.add(pole);
        System.out.println("Starting position: \n" + pole);

        while(!open.isEmpty()){
            Pole tmp = open.poll();
            if(tmp.jeReseni()){
                System.out.println("A* Solution: " + tmp.getPohyby());
                break;
            }
            for(int move : Arrays.asList(HORE, DOLE, DOPRAVA, DOLAVA)){
                Pole next = tmp.klonujAPohni(move);
                if(!pozrene.contains(next)){
                    open.add(next);
                    pozrene.add(next);
                }
            }
        }
    }
}

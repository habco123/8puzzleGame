
public class main {

    public static void main(String[] args) {
        long startTime, endTime, elapsedTime;

        startTime = System.currentTimeMillis();
        BFS BDF_solution = new BFS();
        endTime = System.currentTimeMillis();
        elapsedTime = endTime - startTime;
        System.out.println("BFS Runtime: " + elapsedTime + " milliseconds");

        startTime = System.currentTimeMillis();
        AStar astar_solution = new AStar();
        endTime = System.currentTimeMillis();
        elapsedTime = endTime - startTime;
        System.out.println("A* Runtime: " + elapsedTime + " milliseconds");

    }
}

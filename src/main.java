import java.util.*;

public class main {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        BFS solution = new BFS();
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Runtime: " + elapsedTime + " milliseconds");
    }
}

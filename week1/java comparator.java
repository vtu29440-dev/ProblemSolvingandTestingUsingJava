import java.util.*;

class Player {
    String name;
    int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

// Checker class implementing Comparator<Player>
class Checker implements Comparator<Player> {
    @Override
    public int compare(Player a, Player b) {
        // First, compare by score in descending order
        if (a.score != b.score) {
            return b.score - a.score; // descending
        }
        // If scores are equal, compare by name in ascending alphabetical order
        return a.name.compareTo(b.name);
    }
}

// Solution class (stub code not shown here, but this is what you'd submit)
class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Player[] players = new Player[n];

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int score = sc.nextInt();
            players[i] = new Player(name, score);
        }

        Arrays.sort(players, new Checker());

        // Output is handled by the platform, but for reference:
        for (Player p : players) {
            System.out.println(p.name + " " + p.score);
        }
    }
}

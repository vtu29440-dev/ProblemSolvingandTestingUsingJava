import java.util.*;

class Checker implements Comparator<Player> {
    @Override
    public int compare(Player a, Player b) {
        // First, compare by score in descending order
        if (a.score != b.score) {
            return b.score - a.score;
        }
        
        // If scores are equal, compare by name in ascending alphabetical order
        return a.name.compareTo(b.name);
    }
}

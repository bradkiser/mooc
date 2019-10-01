import java.util.ArrayList;

public class Team{
    private String name;
    private ArrayList<Player> players = new ArrayList<Player>();
    private int maxSize;
    private int goals;

    public Team(String name, int maxSize) {
        this.name = name;
        this.maxSize = maxSize;
    }

    public Team(String name) {
        this(name, 16);
    }

    public String getName() {
        return this.name;
    }

    public void addPlayer(Player i) {
        int currentTeamSize = players.size();

        if (currentTeamSize < this.maxSize) {
            players.add(i);
        }

    }

    public void printPlayers() {
        for (Player i: players) {
            System.out.println(i.toString());
        }
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int size() {
        return this.players.size();
    }

    public int goals() {
        for (Player i: players) {
            this.goals += i.getGoals();
        }
        return  this.goals;
    }
}
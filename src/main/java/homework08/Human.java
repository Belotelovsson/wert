package homework08;

public class Human implements Runner {
    private final String name;
    private final String type;
    private final int maxRun;
    private final int maxJump;

    public Human(String name, int maxRun, int maxJump) {
        this.name = name;
        this.type = "Human";
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public int getMaxRun() {
        return maxRun;
    }

    @Override
    public int getMaxJump() {
        return maxJump;
    }
}
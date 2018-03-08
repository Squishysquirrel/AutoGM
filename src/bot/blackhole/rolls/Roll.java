package bot.blackhole.rolls;

public interface Roll {

    protected final int rollAmount; // This is how many rolls one makes ex: xd6
    protected final int diceSize; // This is how many sides a die has ex: 1dx

    protected List<Integer> makeRoll();
}

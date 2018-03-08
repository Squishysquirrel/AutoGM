package bot.blackhole.rolls;

public interface Roll {

    int rollAmount; // This is how many rolls one makes ex: xd6
    int diceSize; // This is how many sides a die has ex: 1dx

    List<Integer> makeRoll();
}

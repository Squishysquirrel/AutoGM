package bot.blackhole.rolls;

import bot.blackhole.rolls.Roll;

public class Test implements Roll {

    public Test(int rollAmount, int diceSize) {
        this.rollAmount = rollAmount;
        this.diceSize = diceSize;
    }
    
    public Test(int rollAmount) {
        this.rollAmount = rollAmount;
        this.diceSize = 6;
    }

    public int makeTest() {


    }

    protected List<Integer> makeRoll() {
        // do them rolls
    }
}

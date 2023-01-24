package core.basesyntax;

import java.util.Random;

public class Lottery {
    Random random = new Random();//new class instance random
    ColorSupplier colorSupplier = new ColorSupplier();//new class instance colorSupplier
    private static final int maxBound = 100;//range random 0...100
    public Ball getRandomBall() {
        int randomNumberBall = random.nextInt(maxBound);
        Ball ball = new Ball();
        ball.setNumber(randomNumberBall);
        ball.setColor(colorSupplier.getRandomColor());
        return ball;
    }

}

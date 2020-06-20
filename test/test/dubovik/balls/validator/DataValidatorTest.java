package test.dubovik.balls.validator;

import com.dubovik.balls.entity.Ball;
import com.dubovik.balls.entity.Basket;
import com.dubovik.balls.validator.DataValidator;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class DataValidatorTest {

    @Test
    public void testCheckDataForBallColor() {
        DataValidator validator = new DataValidator();
        String in_color = "green";
        double in_weight = 12;
        boolean expected = true;
        boolean actual = validator.checkDataForBall(in_color, in_weight);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testCheckDataForBallWeight() {
        DataValidator validator = new DataValidator();
        String in_color = "green";
        double in_weight = -12;
        boolean expected = false;
        boolean actual = validator.checkDataForBall(in_color, in_weight);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testCheckDataForBasket() {
        DataValidator validator = new DataValidator();
        Basket actual_basket = new Basket(12);
        ArrayList<Ball> balls = new ArrayList<>();
        Ball ball1 = new Ball(11, "red");
        Ball ball2 = new Ball(3, "blue");
        Ball ball3 = new Ball(4, "green");
        balls.add(ball1);
        balls.add(ball2);
        balls.add(ball3);
        boolean actual = validator.checkDataForBasket(actual_basket, balls);
        boolean expected = false;
        Assert.assertEquals(actual, expected);
    }
}
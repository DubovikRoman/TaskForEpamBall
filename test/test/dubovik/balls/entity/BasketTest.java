package test.dubovik.balls.entity;

import com.dubovik.balls.entity.Ball;
import com.dubovik.balls.entity.Basket;
import com.dubovik.balls.service.BasketService;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class BasketTest {

    @Test
    public void testAddNewBallCorrect() {
        BasketService test = new BasketService();
        Basket actual_basket = new Basket(12);
        ArrayList<Ball> expected_balls = new ArrayList<>();
        Ball ball = new Ball(11, "blue");
        expected_balls.add(ball);
        actual_basket.addOneBall(ball);;
        Assert.assertEquals(actual_basket.getAllBalls(), expected_balls);
    }

    @Test
    public void testAddNewBallIncorrect() {
        BasketService test = new BasketService();
        Basket actual_basket = new Basket(12);
        ArrayList<Ball> expected_balls = new ArrayList<>();
        Ball ball = new Ball(13, "blue");
        actual_basket.addOneBall(ball);
        Assert.assertEquals(actual_basket.getAllBalls(), expected_balls);
    }

    @Test
    public void testCalculateCurrentWeight() {
        Basket actual_basket = new Basket(12);
        Ball ball1 = new Ball(2, "blue");
        Ball ball2 = new Ball(3, "blue");
        Ball ball3 = new Ball(4, "green");
        actual_basket.addOneBall(ball1);
        actual_basket.addOneBall(ball2);
        actual_basket.addOneBall(ball3);
        double expected_weight = 9;
        double actual_weight = actual_basket.calculateCurrentWeight();
        Assert.assertEquals(actual_weight, expected_weight);
    }
}
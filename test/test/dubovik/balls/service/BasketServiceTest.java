package test.dubovik.balls.service;

import com.dubovik.balls.entity.Ball;
import com.dubovik.balls.entity.Basket;
import com.dubovik.balls.entity.CustomColor;
import com.dubovik.balls.service.BasketService;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class BasketServiceTest {

    @Test
    public void testFillInBasketCorrect() {
        BasketService test = new BasketService();
        Basket actual_basket = new Basket(12);
        Basket expected_basket = new Basket(12);
        ArrayList<Ball> balls = new ArrayList<>();
        Ball ball1 = new Ball(2, "red");
        Ball ball2 = new Ball(3, "blue");
        Ball ball3 = new Ball(4, "green");
        balls.add(ball1);
        balls.add(ball2);
        balls.add(ball3);
        test.fillInBasket(actual_basket, balls);
        for(Ball i : balls){
            expected_basket.addOneBall(i);
        }
        Assert.assertEquals(actual_basket.getAllBalls(), expected_basket.getAllBalls());
    }

    @Test
    public void testFillInBasketIncorrect() {
        BasketService test = new BasketService();
        Basket actual_basket = new Basket(12);
        Basket expected_basket = new Basket(12);
        ArrayList<Ball> balls = new ArrayList<>();
        Ball ball1 = new Ball(11, "red");
        Ball ball2 = new Ball(3, "blue");
        Ball ball3 = new Ball(4, "green");
        balls.add(ball1);
        balls.add(ball2);
        balls.add(ball3);
        test.fillInBasket(actual_basket, balls);
        Assert.assertEquals(actual_basket.getAllBalls(), expected_basket.getAllBalls());
    }

    @Test
    public void testCalculateCountColorBalls() {
        BasketService test = new BasketService();
        Basket actual_basket = new Basket(12);
        Ball ball1 = new Ball(1, "blue");
        Ball ball2 = new Ball(3, "blue");
        Ball ball3 = new Ball(4, "green");
        actual_basket.addOneBall(ball1);
        actual_basket.addOneBall(ball2);
        actual_basket.addOneBall(ball3);
        int expected_color_balls = 2;
        int actual_color_balls = test.calculateCountColorBalls(actual_basket,
                CustomColor.BLUE);
        Assert.assertEquals(actual_color_balls, expected_color_balls);

    }
}
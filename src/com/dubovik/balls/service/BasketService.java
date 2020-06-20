package com.dubovik.balls.service;

import com.dubovik.balls.entity.Ball;
import com.dubovik.balls.entity.Basket;
import com.dubovik.balls.entity.CustomColor;
import com.dubovik.balls.validator.DataValidator;

import java.util.ArrayList;

public class BasketService {

    public boolean fillInBasket(Basket current,
                                ArrayList<Ball> in_all_balls){
        DataValidator validator = new DataValidator();
        boolean is_operation_correct = false;
        if(validator.checkDataForBasket(current, in_all_balls)){
            is_operation_correct = true;
            for(Ball i : in_all_balls){
                if(i != null){
                    current.addOneBall(i);
                }
            }
        }
        return is_operation_correct;
    }

    public int calculateCountColorBalls(Basket basket, CustomColor color){
        int count_color_balls = 0;
        for(Ball i : basket.getAllBalls()){
            if(i.getColor() == color){
                count_color_balls++;
            }
        }
        return count_color_balls;
    }
}

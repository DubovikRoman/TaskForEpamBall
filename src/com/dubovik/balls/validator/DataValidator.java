package com.dubovik.balls.validator;

import com.dubovik.balls.entity.Ball;
import com.dubovik.balls.entity.Basket;

import java.util.ArrayList;

public class DataValidator {

    public boolean checkDataForBall(String in_color, double in_weight){
        boolean is_data_correct = false;
        boolean is_color_data_correct = false;
        boolean is_weight_data_correct = false;
        if(in_color == "red" || in_color == "blue" || in_color == "green"){
            is_color_data_correct = true;
        }
        if(in_weight >= 0){
            is_weight_data_correct = true;
        }
        if(is_color_data_correct == true && is_weight_data_correct == true){
            is_data_correct = true;
        }
        return is_data_correct;
    }

    public boolean checkDataForBasket(Basket current,
                                       ArrayList<Ball> in_all_balls){
        boolean is_operation_correct = false;
        double in_current_weight = 0;
        for(Ball i : in_all_balls){
            if(i != null){
                in_current_weight += i.getWeight();
            }
        }
        if(in_current_weight <= current.getMaxWeight()){
            is_operation_correct = true;
        }
        return is_operation_correct;
    }
}

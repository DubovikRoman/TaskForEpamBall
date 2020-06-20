package com.dubovik.balls.entity;

import java.util.ArrayList;

public class Basket {

    private ArrayList<Ball> all_balls;
    private double max_weight;

    public Basket(double in_max_weight) {
        max_weight = in_max_weight;
        all_balls = new ArrayList<>();
    }

    public ArrayList<Ball> getAllBalls() {
        ArrayList<Ball> clone_balls = new ArrayList<>(all_balls);
        return clone_balls;

    }

    public boolean addOneBall(Ball need_to_add){
        boolean is_operation_correct = false;
        double current_weight = calculateCurrentWeight();
        if(current_weight + need_to_add.getWeight() <= max_weight){
            is_operation_correct = true;
            all_balls.add(need_to_add);
        }
        return is_operation_correct;
    }

    public double getMaxWeight() {
        return max_weight;
    }

    /*
    *
    *   setMaxWeight is not provided by the task
    *
     */

    public double calculateCurrentWeight() {
        double current_weight = 0;
        for(Ball i : all_balls){
            current_weight += i.getWeight();
        }
        return current_weight;
    }

    public boolean equals(Basket basket) {
        if (this == basket){
            return true;
        }
        if (basket == null || getClass() != basket.getClass()){
            return false;
        }
        boolean equals = true;
        int vector_size;
        if(all_balls.size() < basket.all_balls.size()){
            vector_size = all_balls.size();
        }else{
            vector_size = basket.all_balls.size();
        }
        for(int i = 0; i < vector_size; i++){
            if(!all_balls.get(i).equals(basket.all_balls.get(i))){
                equals = false;
            }
        }
        if(max_weight != basket.max_weight
                || calculateCurrentWeight() != basket.calculateCurrentWeight()){
            equals = false;
        }
        return equals;
    }

    public int hashCode() {
        int hash_code = 0;
        for(Ball i : all_balls){
            hash_code += i.hashCode();
        }
        return hash_code;
    }
}

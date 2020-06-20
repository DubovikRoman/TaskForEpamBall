package com.dubovik.balls.entity;

public class Ball {
    private double weight;
    private CustomColor color;

    public Ball(double in_weight, String in_color) {
        this.weight = in_weight;
        switch(in_color){
            case "red":
                color = CustomColor.RED;
                break;
            case "green":
                color = CustomColor.GREEN;
                break;
            case "blue":
                color = CustomColor.BLUE;
                break;
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public CustomColor getColor() {
        return color;
    }

    public void setColor(CustomColor color) {
        this.color = color;
    }

    public boolean equals(Ball ball) {
        if (this == ball){
            return true;
        }
        if (ball == null || getClass() != ball.getClass()){
            return false;
        }
        return Double.compare(ball.weight, weight) == 0 &&
                color == ball.color;
    }

    public int hashCode() {
        return (int) weight;
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder("Ball{");
        sb.append("weight=").append(weight);
        sb.append(", color=").append(color);
        sb.append('}');
        return sb.toString();
    }
}

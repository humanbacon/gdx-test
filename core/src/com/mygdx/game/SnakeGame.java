package com.mygdx.game;
import java.util.LinkedList;

/**
 * Created by yulapshun on 26/7/15.
 */
enum DIRECTION{
    UP, RIGHT, DOWN, LEFT;
}
public class SnakeGame {

    Food food;
    Snake snake;

    class Food{
        int x;
        int y;
        public Food(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    class Snake{
        int x;
        int y;
        LinkedList<DIRECTION> directions;
        public Snake(int x, int y){
            this.x = x;
            this.y = y;
            directions = new LinkedList<>();
            directions.add(DIRECTION.UP);
        }
    }

    public SnakeGame(){
        //food = new Food();
        //snake = new Snake();
    }

}

package com.company;

public class World {

    public static void main(String[] args) {
        Apple apple = new Apple();
        God god = new God();
        Human adam = new Human("Adam", false);
        Human eva = new Human("Eva", true);
        Snake snake = new Snake();
        World world = new World();

        System.out.println("=========== VƯỜN ĐỊA ĐÀNG===========");
        adam.say("Adam được sinh ra.");
        eva.say("Eva được sinh ra.");
        snake.say("Con rắn nói: Ăn táo đi ngon lắm, không chết đâu.");
        System.out.println("Eva ăn một miếng táo, Adam ăn một miếng táo, cho đến khi hết.");
        while (apple.isEmpty()){
            adam.eat(apple);
            eva.eat(apple);
        }
        System.out.println("Adam đi ngủ. Eva đi ngủ.");
        eva.sleep();
        System.out.println("Hết");
    }

}

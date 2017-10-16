package com.company;

public class Main {

    public static void main(String[] args) {
        Holiday christmas = new Holiday("christmas ", 25, "December");
        Holiday independenceDay = new Holiday("indepenence day", 4, "December");
        Food food= new Food("bengali","spicy",true,true,false);
        System.out.println(food.getBotanicalName());
        System.out.println(christmas.inSameMonth(independenceDay));
        Human human= new Human();
        human.getHisAge();
        System.out.println(human.getHisAge());
   human.setHisAge(29);
        System.out.println(human.getHisAge());
        human.grow();
    }
}

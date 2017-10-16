package com.company;

public class Food {
    private String name;
    private String type;
    private boolean isRipe;
    private boolean isSpicy;
    private boolean isEdible;

    public Food(String name, String type,boolean isRipe, boolean isSpicy, boolean isEdible) {
        this.name = name;
        this.type = type;
        this.isRipe= isRipe;
        this.isSpicy = isSpicy;
        this.isEdible = isEdible;
    }

    public String getBotanicalName() {
        return "the name of food is" + name;

    }
    public String getType() {
        return "the type is" + type;
    }
}

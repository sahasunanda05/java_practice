package com.furniture;

public class FurnitureItem {
    static final int Discount = 5;
    private int furnitureCode;
    private String furnitureType;
    private java.lang.String gradeOfFurniture;
    private String color;
    private String furnitureUsage;
    private float price;

    FurnitureItem() {
        furnitureCode = 0;
        furnitureType = "";
        gradeOfFurniture = "";
        color = "";
        furnitureUsage = "";
        price = 0;
    }

    public int getFurnitureCode() {
        return furnitureCode;
    }

    public void setFurnitureCode(int furnitureCode) {
        this.furnitureCode = furnitureCode;
    }

    public String getFurnitureType() {
        return furnitureType;
    }

    public void setFurnitureType(String furnitureType) {
        this.furnitureType = furnitureType;
    }

    public String getGradeOfFurniture() {
        return gradeOfFurniture;
    }

    public void setGradeOfFurniture(String gradeOfFurniture) {
        this.gradeOfFurniture = gradeOfFurniture;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFurnitureUsage() {
        return furnitureUsage;
    }

    public void setFurnitureUsage(String furnitureUsage) {
        this.furnitureUsage = furnitureUsage;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float calculateDiscount() {
        if (furnitureUsage.equalsIgnoreCase("outdoor") && gradeOfFurniture.equals("grade1")) {
            float discountedPrice = price - (price * Discount / 100);
            return discountedPrice;
        } else {
            return price;
        }

    }
}

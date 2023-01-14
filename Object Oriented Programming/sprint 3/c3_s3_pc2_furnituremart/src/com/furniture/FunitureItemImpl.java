package com.furniture;

public class FunitureItemImpl {
    public static void main(String[] args) {
        FurnitureItem furnitureItem = new FurnitureItem();
        furnitureItem.setFurnitureCode(101);
        System.out.println("Furniture Code = " + furnitureItem.getFurnitureCode());
        furnitureItem.setFurnitureType("table");
        System.out.println("Furniture Type = " + furnitureItem.getFurnitureType());
        furnitureItem.setGradeOfFurniture("grade1");
        System.out.println("gradeOfFurniture = " + furnitureItem.getGradeOfFurniture());
        furnitureItem.setFurnitureUsage("outdoor");
        System.out.println("getFurnitureUsage = " + furnitureItem.getFurnitureUsage());
        furnitureItem.setPrice(10);
        System.out.println("price = $" + furnitureItem.getPrice());

        System.out.println("Discounted Price is = $" + furnitureItem.calculateDiscount());


    }
}

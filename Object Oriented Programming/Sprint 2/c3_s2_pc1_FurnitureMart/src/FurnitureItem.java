public class FurnitureItem {
    int furnitureCode;
    String furnitureType;
    String gradeOfFurniture;
    String color;
    String furnitureUsage;
    double price;

    FurnitureItem() {
        furnitureCode = 0;
        furnitureType = "Table";
        gradeOfFurniture = "Grade 1";
        color = "red";
        furnitureUsage = "indoor";
        price = 100.0;
    }

    public double getFinalPriceAfterDiscount() {
        if (furnitureUsage.equalsIgnoreCase("outdoor")) {
            return price - (price * 5 / 100);
        }
        return price;
    }
}



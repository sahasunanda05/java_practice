public class FurnitureItems {
    //attributes
    String color;
    String grade;
    String placementType;
    String furnitureType;
    double price;

    public double getFinalPriceAfterDiscount(){
        if(placementType.equalsIgnoreCase("outdoor")){
            return price-(price*5/100);
        }

        return price;
    }

    public void display(){
        System.out.println("color = " + color);
        System.out.println("grade = " + grade);
        System.out.println("placement type = " + placementType);
        System.out.println("furniture type = " + furnitureType);
        System.out.println("price = " + price);

    }
}

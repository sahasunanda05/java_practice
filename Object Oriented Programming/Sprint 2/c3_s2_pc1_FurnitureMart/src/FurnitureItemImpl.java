import java.util.Scanner;
public class FurnitureItemImpl {
    public static void main(String[] args) {
        FurnitureItem furnitureItem = new FurnitureItem();

        Scanner scanner = new Scanner(System.in);

        furnitureItem.furnitureCode = 0;
        furnitureItem.furnitureType = "stools";
        furnitureItem.furnitureUsage = "outdoor";
        furnitureItem.color = "red";
        furnitureItem.gradeOfFurniture = "grade 1";
        furnitureItem.price = 800;

        System.out.println("Enter furniture code (0/1/2/3) : ");
        furnitureItem.furnitureCode = scanner.nextInt();

        System.out.println("Enter furniture type (stool/chair/cupboard/table) : ");
        scanner.nextLine();
        furnitureItem.furnitureType = scanner.nextLine();

        System.out.println("Enter furniture type (outdoor/indoor) : ");
        furnitureItem.furnitureUsage = scanner.nextLine();

        System.out.println("Enter furniture color (red/blue/green) : ");
        furnitureItem.color = scanner.nextLine();


        System.out.println("Enter the grade of furniture (1/2/3) ");
        furnitureItem.gradeOfFurniture = scanner.nextLine();

        System.out.println("Enter the price : ");
        furnitureItem.price = scanner.nextDouble();


        System.out.println("Discounted Price:" + furnitureItem.getFinalPriceAfterDiscount());


    }
}

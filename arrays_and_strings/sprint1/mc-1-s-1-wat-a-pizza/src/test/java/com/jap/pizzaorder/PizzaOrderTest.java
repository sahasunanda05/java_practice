package com.jap.pizzaorder;

import com.jap.pizzaorder.PizzaOrder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class PizzaOrderTest {
    PizzaOrder pizzaOrder = null;
    @Before
    public void setUp(){
        //Initialize the object of class PizzaOrder
        pizzaOrder = new PizzaOrder();
    }
    @After
    public void tearDown(){
        // Assign object of PizzaOrder to null
        pizzaOrder = null;
    }

    // Write th logic inside the test case methods
    @Test
    public void givenNoOfPizzaAndPriceOfPizzaCalculateTotalPriceSuccess(){
        float totalPriceOfPizzas = pizzaOrder.calculatePriceOfPizza(2,5.1f);
        //assertEquals(10.2,totalPriceOfPizzas);
        assertEquals(10.2f,totalPriceOfPizzas,totalPriceOfPizzas-10.2f);
    }
    @Test
    public void givenNoOfGarlicBreadAndPriceOfGarlicBreadCalculateTotalPriceSuccess(){
        float totalPriceOfGarlicBread = pizzaOrder.calculatePriceOfGarlicBread(2,3.0f);
        assertEquals(6.0f,totalPriceOfGarlicBread,totalPriceOfGarlicBread-6.0f);
    }
    @Test
    public void givenNoOfBeveragesAndPriceOfBeverageCalculateTotalPriceSuccess(){
        float totalPriceOfBeverages = pizzaOrder.calculatePriceOfBeverage(2,4.0f);
        assertEquals(8.0f,totalPriceOfBeverages,totalPriceOfBeverages-8.0f);
    }
    @Test
    public void givenNoOfPizzaAndPriceOfPizzaCalculateTotalPriceFailure(){
        float totalPriceOfPizzas = pizzaOrder.calculatePriceOfPizza(-6,5.1f);
        assertEquals(-1,totalPriceOfPizzas,totalPriceOfPizzas-(-1));
    }
    @Test
    public void givenNoOfGarlicBreadAndPriceOfGarlicBreadCalculateTotalPriceFailure(){
        float totalPriceOfGarlicBread = pizzaOrder.calculatePriceOfGarlicBread(-7,3.0f);
        assertEquals(-1,totalPriceOfGarlicBread,totalPriceOfGarlicBread-(-1));
    }
    @Test
    public void givenNoOfBeveragesAndPriceOfBeverageCalculateTotalPriceFailure(){
        float totalPriceOfBeverages = pizzaOrder.calculatePriceOfBeverage(-1,4.0f);
        assertEquals(-1,totalPriceOfBeverages,totalPriceOfBeverages-(-1));
    }
    @Test
    public void givenSizeofPizzaReturnPrice(){
        float priceOfPizzaBasedOnSize= pizzaOrder.getPriceOfPizzaBasedOnSize(1);
        assertEquals(9.99f,priceOfPizzaBasedOnSize,priceOfPizzaBasedOnSize-(-1));
    }
    @Test
    public void givenPriceOfItemsCalculateTotalBillAmount(){
        float totalBill = pizzaOrder.calculateTotalBill(9.99f,11.99f,13.99f);
        assertEquals(35.97f,totalBill,totalBill-(-1));
    }

    @Test
    public void givenTotalBillAmountGreaterThan50CalculateDiscount(){
        float actual = pizzaOrder.calculateDiscountAndReturnBillAmount(57.95f);
        assertEquals(52.155f,actual,actual-(-1));
    }
    @Test
    public void givenTotalBillLessThan50AmountCalculateDiscount(){
        float actual = pizzaOrder.calculateDiscountAndReturnBillAmount(21.98f);
        assertEquals(21.98f,actual,actual-(-1));


    }
}

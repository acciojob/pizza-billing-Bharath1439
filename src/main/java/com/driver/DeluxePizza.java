package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);

        this.addExtraCheese();
        this.addExtraToppings();

//          this directly call parent class meathos
//        super.addExtraCheese();
//        super.addExtraToppings();
//
//
//        this and 1st one is similar
//        this.addExtraCheese();
//        this.addExtraToppings();
        // your code goes here
    }
}

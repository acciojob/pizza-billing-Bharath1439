package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int toppings;

    private int chees;

    private int takeaway;

    private boolean istoppings;

    private boolean ischees;

    private boolean istakeaway;

    private boolean isbilling;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.chees=80;
        if(isVeg){
            this.price=300;
            this.toppings=70;
        }
        else{
            this.price=400;
            this.toppings=120;
        }
        this.takeaway=20;

        this.istakeaway=false;

        this.ischees=false;

        this.istoppings=false;

        this.isbilling=false;

        this.bill="Base Price Of The Pizza: "+this.price+"\n";
        // your code goes here
    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
       if(ischees==false){
           this.price=this.price+this.chees;
           ischees=true;
       }
        // your code goes here
    }

    public void addExtraToppings(){
        if(istoppings==false) {
            this.price = this.price + this.toppings;
            istoppings = true;
        }
        // your code goes here
    }

    public void addTakeaway(){
        if(istakeaway==false) {
            this.price = this.price + this.takeaway;
            istakeaway = true;
        }
        // your code goes here
    }

    public String getBill(){
        if(isbilling==false){
            if(ischees==true){
                this.bill=this.bill+"Extra Cheese Added: "+this.chees+"\n";
            }
            if(istoppings==true){
                this.bill=this.bill+"Extra Toppings Added: "+this.toppings+"\n";
            }
            if(istakeaway==true){
                this.bill=this.bill+"Paperbag Added: "+this.takeaway+"\n";
            }
            this.bill=this.bill+"Total Price : "+this.price+"\n";
            isbilling=true;
        }
        // your code goes here
        return this.bill;
    }
}

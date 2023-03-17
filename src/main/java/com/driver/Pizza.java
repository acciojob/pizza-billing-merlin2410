package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean isExtraCheese;
    private boolean isExtraToppings;
    private boolean isPaperBag;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.isExtraCheese = false;
        this.isExtraToppings = false;
        this.isPaperBag = false;
        // your code goes here
        if(isVeg==true)
            this.price = 300;
        else
            this.price = 400;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isExtraCheese==false)
        {
            this.price += 80;
            isExtraCheese = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isExtraToppings==false)
        {
            if(isVeg==true)
            {
                this.price += 70;
            }
            else
            {
                this.price += 120;
            }
            isExtraToppings = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(isPaperBag==false)
        {
            this.price += 20;
            isPaperBag = true;
        }

    }

    public String getBill(){
        // your code goes here
        this.bill = "Base Price Of The Pizza: ";
        if(isVeg)
            this.bill += "300";
        else
            this.bill += "400";
        this.bill += "\n";

        if(isExtraCheese==true)
            this.bill += "Extra Cheese Added: 80\n";
        if(isExtraToppings==true)
            this.bill += "Extra Toppings Added: ";
        if(isVeg)
            this.bill += "70\n";
        else
            this.bill += "120\n";
        if(isPaperBag)
            this.bill += "Paperbag Added: 20\n";
        this.bill += "Total Price: "+this.price+"\n";
        return this.bill;
    }
}

package SecondTurn;

public class SetMeal {
    protected String mealName;
    protected String chickenName;
    protected Drinks drink;
    protected double mealPrice;

    public SetMeal()
    {

    }

    public SetMeal(String mealName, String chickenName, Drinks drink, double mealPrice)
    {
        this.mealName = mealName;
        this.chickenName = chickenName;
        this.drink = drink;
        this.mealPrice = mealPrice;
    }
    //override
    public String toString()
    {
        return("MealName: " + mealName + "\nincludes " + chickenName + " and " + drink +"\nThe price is" + mealPrice);
    }
}

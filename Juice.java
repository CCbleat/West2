package SecondTurn;

import java.time.LocalDate;

public class Juice extends Drinks
{
    public Juice()
    {

    }
    public Juice(String name, double cost, LocalDate dateOfMan)
    {
        super(name, cost, dateOfMan, 2);
    }
    //Override
    public String toString()
    {
        return(name + "'s price: " + cost + " ,it was produced on: " + dateOfMan.getYear() + "." + dateOfMan.getMonth() + "." + dateOfMan.getDayOfMonth()  +" ,and it's"+ ifOutOfDate());
    }
}

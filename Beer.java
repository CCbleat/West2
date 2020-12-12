package SecondTurn;

import java.time.LocalDate;

public class Beer extends Drinks
{
    //Extra attributes
    private float alcDegree;
    public Beer()
    {

    }
    public Beer(String name, double cost, LocalDate dateOfMan, float alcDegree)
    {
        super(name, cost, dateOfMan, 30);
        this.alcDegree = alcDegree;
    }
    //Override
    public String toString()
    {
        return(name + "'s price: " + cost + " ,it was produced on: " + dateOfMan.getYear() + "." + dateOfMan.getMonth() + "." + dateOfMan.getDayOfMonth() + ", it's alcohol degree is: " + alcDegree +" ,and it's"+ ifOutOfDate());
    }
}

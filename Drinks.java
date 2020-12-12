package SecondTurn;

import java.time.LocalDate;

public abstract class Drinks {
    //Attributes
    protected String name;
    protected double cost;
    protected LocalDate dateOfMan;
    protected int quaGuaPer;

    public Drinks()
    {

    }

    public Drinks(String name, double cost, LocalDate dateOfMan, int quaGuaPer)
    {
        this.name = name;
        this.cost = cost;
        this.dateOfMan = dateOfMan;
        this.quaGuaPer = quaGuaPer;
    }

    public boolean ifOutOfDate()
    {
        return dateOfMan.plusDays(quaGuaPer).isAfter(LocalDate.now());
    }
    public abstract String toString();
}
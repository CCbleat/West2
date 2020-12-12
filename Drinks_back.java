package SecondTurn;

import java.time.LocalDate;

public abstract class Drinks_back {
    //Attributes
    protected String name;
    protected double cost;
    protected LocalDate dateOfMan;
    protected int quaGuaPer;

    public Drinks_back()
    {

    }

    public Drinks_back(String name, double cost, int year, int month, int dayOfMonth, int quaGuaPer)
    {
        this.name = name;
        this.cost = cost;
        this.dateOfMan = LocalDate.of(year, month, dayOfMonth);
        this.quaGuaPer = quaGuaPer;
    }

    public boolean ifOutOfDate()
    {
//        int temp = 0;
//        boolean WithinWarPer = true;
//        LocalDate dateNow = LocalDate.now();
//        if(dateOfMan.getYear() == dateNow.getYear())
//        {
//            temp = dateNow.getDayOfYear() - dateOfMan.getDayOfYear();
//        }
//        else
//        {
//            if( (dateOfMan.getYear()%4 == 0 && dateOfMan.getYear()%4 != 0) || dateOfMan.getYear()%400 == 0 )
//            {
//                temp = 366 - dateOfMan.getDayOfYear() + dateNow.getDayOfYear();
//            }
//            else
//            {
//                temp = 365 - dateOfMan.getDayOfYear() + dateNow.getDayOfYear();
//            }
//        }
//        if(temp > quaGuaPer)
//        {
//            WithinWarPer = false;
//        }
//        if(WithinWarPer)
//        {
//            return("Within the warranty period");
//        }
//        else
//        {
//            return("Out of the warranty period");
//        }
        return dateOfMan.plusDays(quaGuaPer).isAfter(LocalDate.now());
    }
    public abstract String toString();
}

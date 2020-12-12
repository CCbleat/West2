package SecondTurn;

import java.util.ArrayList;
import java.time.LocalDate;

public class West2FriedChickenRestaurant implements FriedChickenRestaurant {
    double balance;
    /*
    The reason why I choose ArrayList to store beers and juices
    is Arraylist is facilitate to add and delete elements,
    which satisfies the requirements of fired chicken store
     */
    static ArrayList<Beer> beers = new ArrayList<Beer>();
    static ArrayList<Juice> juices =  new ArrayList<Juice>();
    final static ArrayList <SetMeal> setMeals = null;
    boolean found = false;
    static {
        beers.add(new Beer("可乐威士忌",50,LocalDate.now(),3));
        beers.add(new Beer("雪津精酿",12,LocalDate.now(),3.5f));
        juices.add(new Juice("蔬菜汁",20,LocalDate.now()));
        juices.add(new Juice("柠檬汁",18,LocalDate.now()));
        setMeals.add(new SetMeal("套餐1", "烤串", beers.get(1), 70));
        setMeals.add(new SetMeal("套餐2", "炸鸡", beers.get(2), 40));
        setMeals.add(new SetMeal("套餐3", "辣翅", juices.get(1), 50));
    }

    private void use(Beer beer){
        try {
            if(beers != null){
                for (Beer b : beers) {
                    if (b.ifOutOfDate()) {
                        beers.remove(b);
                    }
                }
                //check if exist this drink
                for(Beer b:beers){
                    if(b.name.equals(beer.name)){
                        beers.remove(b);
                        found = true;
                        break;
                    }else {
                        throw new IngredientSortOutException(beer.name+" is sold out");
                    }
                }
            }else {
                throw new IngredientSortOutException("Beer is null");
            }
        }catch (IngredientSortOutException ing){
            System.out.println(ing.getMessage());
        }

    }

    private void use(Juice juice){
        try {
            if(juices != null){
                for (Juice j : juices) {
                    if (j.ifOutOfDate()) {
                        juices.remove(j);
                    }
                }
                //check if exists this drink
                for(Juice j:juices){
                    if(j.name.equals(juice.name)){
                        juices.remove(j);
                        found = true;
                        break;
                    }else {
                        throw new IngredientSortOutException(juice.name+" is sold out");
                    }
                }
            }else {
                throw new IngredientSortOutException("Juice is null");
            }
        }catch (IngredientSortOutException ing){
            System.out.println(ing.getMessage());
        }

    }
    //check set meal
    //Override
    public void sellMeal(SetMeal meal) {
        boolean check = false;
        for(SetMeal m:setMeals){
            if(m == meal){
                check = true;
            }
        }
        if(!check){
            System.out.println("This setMeal is sold out.Sorry.");
        }else{
            if(meal.drink instanceof Beer){
                use((Beer) meal.drink);
            }else if(meal.drink instanceof Juice){
                use((Juice) meal.drink);
            }

            if(found){
                System.out.println("Thanks for your ordering. There is your set meal.");
                balance += meal.mealPrice;
            }
        }
    }


    //purchase
    //Override
    public void purchase(Drinks drink) {
        if(drink instanceof Beer){
            use((Beer) drink);
            if(!found && balance>drink.cost){
                beers.add((Beer) drink);
                balance -= drink.cost;
            }
        }else if(drink instanceof Juice){
            use((Beer) drink);
            if(!found && balance>drink.cost){
                juices.add((Juice) drink);
                balance -= drink.cost;
            }
        }

    }

}


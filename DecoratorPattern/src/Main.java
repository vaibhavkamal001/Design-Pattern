import StarbuzzCoffie.Beverage;
import StarbuzzCoffie.Decorator.BeverageDecorateImp.Milk;
import StarbuzzCoffie.Decorator.BeverageDecorateImp.Mocha;
import StarbuzzCoffie.Decorator.BeverageDecorateImp.Soy;
import StarbuzzCoffie.Decorator.BeverageImp.DarkRoast;
import StarbuzzCoffie.Decorator.BeverageImp.Expresso;
import StarbuzzCoffie.Decorator.Size;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Thread curr = Thread.currentThread();
        curr.setName("Vaibhav");
        System.out.println(Thread.currentThread().getName());
        System.out.println(10/0);
    }

    static void testStarBuzz(){
        Beverage expresso  = new Expresso(Size.MEDIUM);
        expresso = new Milk(expresso);
        expresso = new Mocha(expresso);

        System.out.println(expresso.getDescription());
        System.out.println(expresso.cost());

        System.out.println("----------------------------------");

        Beverage darkRoast = new DarkRoast(Size.LARGE);
        darkRoast = new Milk(darkRoast);
        darkRoast = new Soy(darkRoast);
        darkRoast = new Mocha(darkRoast);

        System.out.println(darkRoast.getDescription());
        System.out.println(darkRoast.cost());
    }
}
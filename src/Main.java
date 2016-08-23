/**
 * Created by melaniejohnson on 8/17/16.
 */
public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.size = "large";

        Cat cat2 = new Cat();
        cat2.size = "small";

        Cat cat3 = new Cat();
        cat3.size = "medium";

        cat.name = "Enormo";
        cat2.name = "Tiny";
        cat3.name = "Fig";

        cat.breed = "Persian";
        cat2.breed = "Hairless";
        cat3.breed = "Tabby";

        cat.weight = 27.7;
        cat2.weight = 9.3;
        cat3.weight = 8.125;

        cat.friendly = false;
        cat2.friendly = true;
        cat3.friendly = true;

        cat.age = 6;
        cat2.age = 7;
        cat3.age = 1;

        System.out.println(cat);
        System.out.println(cat2);
        System.out.println(cat3 + "\n");

        System.out.println(cat.healthyCat());
        System.out.println(cat2.healthyCat());
        System.out.println(cat3.healthyCat() + "\n");

        cat.catYear();
        cat2.catYear();
        cat3.catYear();

        cat.catPigOut();
        cat2.catPigOut();
        cat3.catPigOut();

        //System.out.println(cat2.name);
        // System.out.println(cat.toString("Hairless", true));

        System.out.println(cat);
        System.out.println(cat2);
        System.out.println(cat3 + "\n");

        System.out.println(cat.healthyCat());
        System.out.println(cat2.healthyCat());
        System.out.println(cat3.healthyCat() + "\n");
    }
}
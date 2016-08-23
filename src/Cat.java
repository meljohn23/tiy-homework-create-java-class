/**
 * Created by melaniejohnson on 8/17/16.
 */
public class Cat {
    String name;
    String size;
    String breed;
    double weight;
    int age;
    boolean friendly;

    public Cat() {
        this.name = name;
        this.size = size;
        this.breed = breed;
        this.weight = weight;
        this.friendly = friendly;
        this.age = age;
    }

    public String toString() {
        if (this.friendly == true) {
            return "This cat's name is " + this.name + ":  it is " + this.age + " years old, weighs " + this.weight + " lbs and is super duper nice.";

        } else {
            return "This cat's name is " + this.name + ":  it is " + this.age + " years old, weighs " + this.weight + " lbs and is scary-ass mean.";
        }
    }

    public void catYear() {
        this.age += 2;
    }

    public void catPigOut() {
        this.weight += 3;
    }

    public String healthyCat() {
        if (this.age > 7 && this.weight > 11.125) {
            return (this.name + " is old & fat.");

        } else if (this.age < 7 && this.weight < 11.125) {
            return (this.name + " is young & skinny.");

        } else if (this.age > 7 && this.weight < 11.125) {
            return (this.name + " is old & skinny.");

        } else if (this.age < 7 && this.weight > 11.125) {
            return (this.name + " is young & fat.");

        } else {
            return (this.name + " is for the most part healthy.");
        }
    }

}

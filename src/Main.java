import Exam.Levels;
import Exam.Ranking;
import ZOO.Animals;
import ZOO.Features;
import ZOO.Zoo;
import basket.Basket;
import basket.Fruits;
import cars.Colors;
import cars.Ford;

/**
 * @author Programozz Te Is!
 *
 */
public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Ford myBlueFord = new Ford(Colors.BLUE);

        Ford myWhiteFord = new Ford(Colors.WHITE);

        Ford myRedFord = new Ford(Colors.RED);

        Ford myBlackFord = new Ford(Colors.BLACK);

        Ford myYellowford = new Ford(Colors.YELLOW);


        System.out.println("Value of my " + myBlueFord.getColor()
                + " Ford: " + myBlueFord.valueOfCar());

        System.out.println("Value of my " + myWhiteFord.getColor()
                + " Ford: " + myWhiteFord.valueOfCar());

        System.out.println("Value of my " + myRedFord.getColor()
                + " Ford: " + myRedFord.valueOfCar());

        System.out.println("Value of my " + myBlackFord.getColor()
                + " Ford: " + myBlackFord.valueOfCar());

        System.out.println("Value of my " + myYellowford.getColor() + " FORD " + myYellowford.valueOfCar());


        // 2. feladat Hello! My name is Peter and I am ENGINEER.

        Ranking jegyem = new Ranking();

        jegyem.rank(Levels.MID, 45);

        Basket myBasket = new Basket();

        myBasket.add(Fruits.APPLE);

        myBasket.add(Fruits.ORANGE);

        Zoo allatkert = new Zoo(Animals.TIGER, Animals.MONKEY, Animals.BEAR);

        Features etet = new Features(Animals.TIGER, Animals.MONKEY, Animals.BEAR);

        etet.feed(Animals.MONKEY);




    }
}

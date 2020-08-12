package ZOO;

public class Features extends Zoo {

    public Features(Animals animal, Animals animal2, Animals animal3) {
        super(animal, animal2, animal3);
    }

    public void feed(Animals animal){

        System.out.println("eat" + animal);

    }

}

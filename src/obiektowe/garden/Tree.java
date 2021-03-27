package obiektowe.garden;

import java.util.Random;

public class Tree {

    private int ripeFruits = 0;
    private int allFruits = 200;

    public Tree() {
        Random random = new Random();
        ripeFruits = random.nextInt(25)+1;
    }

    public int collectFruits() {
        System.out.println("Zbierasz owoce...");
        System.out.println("Zebrałeś z drzewa " + ripeFruits + " dojzalch owoców");
        int collectedFrits = ripeFruits;
        ripeFruits = 0;
        allFruits -= collectedFrits;
        return collectedFrits;
    }


    @Override
    public String toString() {
        return "Tree{" +
                "ripeFruits=" + ripeFruits +
                ", allFruits=" + allFruits +
                '}';
    }
}

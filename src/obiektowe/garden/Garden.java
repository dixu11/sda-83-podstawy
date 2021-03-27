package obiektowe.garden;

import java.util.Arrays;

public class Garden {

    private Bench bench;
    private Flower[] flowers;
    private Tree[] trees;

    //ławkę można wstawić lub sama może się zrobić w ogrodzie
    //kwiaty należy wstawić
    //drzewa robią się same przy stworzeniu ogrodu ale trzeba podać ich ilość


    public Garden(Flower[] flowers, int treeCount) { // ławka robi się sama
        bench = new Bench("wood");
        this.flowers = flowers; // kwiaty należy wstawić
        trees = new Tree[treeCount]; //podano ilość drzew i robimy tablice dla takiej ilości obiektów
        for (int i = 0; i < treeCount; i++) {
            trees[i] = new Tree(); // uzupełniam tablicę drzewami
        }
    }

    public Garden(Bench bench, Flower[] flowers, int treeCount) { // wstawiamy ławkę
        this.bench = bench;
        this.flowers = flowers; // kwiaty należy wstawić
        trees = new Tree[treeCount]; //podano ilość drzew i robimy tablice dla takiej ilości obiektów
        for (int i = 0; i < treeCount; i++) {
            trees[i] = new Tree(); // uzupełniam tablicę drzewami
        }
    }

    public void sitOnBench() {
        bench.sit();
    }

    public void waterFlowers() {
      /*  for (int i = 0; i < flowers.length; i++) {
            flowers[i].water();
        }*/

        for (Flower flower : flowers) {
            flower.water();
            flower.showFlower();
        }
    }

    //zbierz wszystkie owoce
    public int gatherAllFruits() {
        int allFruits = 0;
        for (Tree tree : trees) {
          allFruits +=  tree.collectFruits();
        }
        System.out.println("Zebrano " + allFruits + " owoców!");
        return allFruits;
    }


    @Override
    public String toString() {
        return "Garden{" +
                "bench=" + bench +
                ", flowers=" + Arrays.toString(flowers) +
                ", trees=" + Arrays.toString(trees) +
                '}';
    }
}

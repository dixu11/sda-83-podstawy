package obiektowe.garden;

public class GardenDemo {
  //ogród
    //drzewa
    //kwiaty
    //1 ławka

    //garden ma mieć możliwość zbierania owoców z drzew, siadania na ławce, podlewania kwiatów

    public static void main(String[] args) {

        Flower flower = new Flower("Czerwony", "Róża");
        Flower flower2 = new Flower("Fioletowy", "Fiołek");
//        flower.showFlower();
//        flower.water();
//        flower.showFlower();

        Bench bench = new Bench("drewno");
        bench.sit();
        bench.sit();

        Tree tree1 = new Tree();
        Tree tree2 = new Tree();

        System.out.println(tree1);
        System.out.println(tree2);

        System.out.println(tree1.collectFruits());
        System.out.println(tree2.collectFruits());

        System.out.println(tree1);
        System.out.println(tree2);

        Flower[] flowers = {flower, flower2};
        Garden garden = new Garden(flowers,6);
        System.out.println(garden);
        garden.sitOnBench();
        garden.waterFlowers();
        System.out.println(garden);
        int fruits = garden.gatherAllFruits();
        System.out.println(fruits);

    }



}

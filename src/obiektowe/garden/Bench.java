package obiektowe.garden;

public class Bench {

    private String material;
    private boolean occupied;

    public Bench(String material) {
        this.material = material;
    }

    public void sit() {
        if (!occupied) {
            System.out.println("Siadasz");
            occupied = true;
        } else {
            System.out.println("Lawka zajęta, idź podlać kwiaty!");
        }
    }

    @Override
    public String toString() {
        return "Bench{" +
                "material='" + material + '\'' +
                '}';
    }
}

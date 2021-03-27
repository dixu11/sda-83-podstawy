package obiektowe.garden;

public class Flower {
    private String color;
    private String name;
    private boolean bloom = false;


    public Flower(String color, String name) {
        this.color = color;
        this.name = name;
    }

    public void water() {
        System.out.println("Podlewasz kwiat " + name);
        bloom = true;
    }

    public void showFlower() {
        if (bloom) {
            System.out.println(name + " kwitnie!");
        } else {
            System.out.println(name + " nie kwitnie");
        }
    }

    @Override
    public String toString() {
        return "Flower{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", bloom=" + bloom +
                '}';
    }
}

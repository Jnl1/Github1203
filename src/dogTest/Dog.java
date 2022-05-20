package dogTest;

public class Dog {
    public int weight;

    public Dog(int weight) {
        this.weight = weight;
    }
    public void makeNoise(){
        if (weight < 10){
            System.out.println("yip");
        }else if (weight < 30){
            System.out.println("bark");
        }else {
            System.out.println("woooof");
        }

    }
}

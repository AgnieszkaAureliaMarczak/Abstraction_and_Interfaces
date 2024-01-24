package interfaces_practice;

public class Truck implements Trackable{
    public void track() {
        System.out.println(getClass().getSimpleName() + "'s coordinates recorded");
    }
}

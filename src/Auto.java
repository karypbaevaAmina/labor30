import java.util.List;
import java.util.Random;

public class Auto {

    public State state;
    private static final Random r = new Random();

    private static final List<String> autoNames = List.of("KIA", "Mercedes", "Honda", "Toyota", "Lexus", "Ford", "BMW", "Jeep");

    private int num;

    public Auto(int num) {
        this.num = num;
        state = State.ONTHEWAY;
    }

    public static void carNum(List<Auto> cars){
        for (int i = 0; i < 200 ; i++) {
            cars.add(new Auto( r.nextInt(1005, 5030)));
            System.out.println();
        }
    }
    public void  changeState(){
        Random r = new Random();
        if ( r.nextInt(100) <3){
            state = State.ONTHEWAY;
        }
        if ( r.nextInt(100) <3){
            state = State.INPARKING;
        }
    }




}

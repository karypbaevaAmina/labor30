import java.util.List;
import java.util.Random;

public class Auto {
    public State state;
    private static final Random r = new Random();
    private int num;

    public Auto(int num) {
        this.num = num;
        state = State.ONTHEWAY;
    }

    public Auto() {
    }

    public static void carNum(List<Auto> car){
        for (int i = 0; i < 200 ; i++) {
            car.add(new Auto( r.nextInt(1005, 5030)));
            System.out.println();
        }
    }

    public void changeState(){
        Random r = new Random();
        if ( r.nextInt(100) <3){
            state = State.ONTHEWAY;
        }
        if ( r.nextInt(100) <3){
            state = State.INPARKING;
        }
    }

    public static void changeStateCar(List<Auto> autos) {
        for (int i = 0; i <200 ; i++) {
            autos.get(i).changeState();
        }
    }

    public static void carInParking(List<Auto> autos, List<Auto> parking){
        for (int i = 0; i < 200 ; i++) {
            if (State.INPARKING == autos.get(i).state) {
                parking.add(autos.get(i));
            }
        }
    }

    @Override
    public String toString() {
        return "Auto{" +
                "state=" + state +
                ", num=" + num +
                '}';
    }

}



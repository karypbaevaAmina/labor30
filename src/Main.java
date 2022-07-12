import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 24; j++) {
                for (int k = 0; k < 60; k = k + 5) {
                    System.out.println("" + i + " " + j + " " + k + " ");
                    List<Auto> autos = new ArrayList<>();
                    Auto.carNum(autos);
                    Auto.changeStateCar(autos);
                    List<Auto> parking = new ArrayList<>(20);
                    Auto.carInParking(autos, parking);
                    System.out.println();
                }
            }
        }
    }
}
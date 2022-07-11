import java.util.List;
import java.util.Random;

public class Auto {

    public State state;
    private static final Random r = new Random();
    private static final List<String> autoNames = List.of("KIA", "Mercedes", "Honda", "Toyota", "Lexus", "Ford", "BMW", "Jeep");

    private static int [] nums = new int[200];

    public Auto(State state) {
        this.state = state;
    }

    public static void carName() {
        String name;
        name = autoNames.get(r.nextInt(autoNames.size()));
        System.out.println(name);
    }

    public static void carNum(){
        for (int i = 0; i <nums.length ; i++) {
            nums[i] = r.nextInt(1005, 5030);
            System.out.println(nums[i]);
        }
    }

//    public static void stateAuto(){
//        Random random = new Random();
//        int v = random.nextInt(100);
//        if (v < 3){
//
//        }
//    }



}

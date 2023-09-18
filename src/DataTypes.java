import java.util.ArrayList;
import java.util.List;

public class DataTypes {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            lst.add(i);
        }
        System.out.println(DataTypes.sum(lst));
    }
    // TODO TASK 1: fix this code so that it passes the test in DataTypesTest.java
    public static long sum(List<Integer> numbers) {

        long s = 0; //TODO: Check difference between long and int
        // below is a "foreach" loop which iterates through numbers
        for (long x : numbers) {
            s += x;
        }
        return s;
    }
}


import java.util.Arrays;
import java.util.List;

public class MAP {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(12 ,12, 33, 4, 25, 63, 887, 128, 9, 99);
        final var r =integers.stream().filter(integer -> integer%integer==0 && integer%1==0).toList()/*.stream().mapToInt(Integer::intValue).max()*/;
        System.out.println(r);


        final var list = integers.stream().takeWhile(integer -> integer%2==0).findAny().get();
        System.out.println(list);

//        integers.stream().filter(integer -> integer)
    }
}

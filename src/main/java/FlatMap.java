import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class FlatMap {
    public static  void main(String [] args){
        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7);
        List<Integer> list2 = Arrays.asList(2,4,5);
        List<Integer> list3 = Arrays.asList(3,5,7);

        List<List<Integer>> list = Arrays.asList(list1, list2, list3);

        System.out.println(list);

        // takes List of integer and returns streams on Interger
        Function<List<Integer>, Stream<Integer>> flatmap =
                l -> l.stream();

        //list.stream().map(l -> l.size()).forEach(System.out::println);

        // use flatmap to get content of the map
        list.stream().flatMap(flatmap).forEach(System.out::println);

    }
}

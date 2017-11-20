import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReductionExample {
    public static void main(String... args){

//        List<Integer> list = Arrays.asList();
//        List<Integer> list = Arrays.asList(10);
//        List<Integer> list = Arrays.asList(10,10,10);


//        Integer sum =
//        list.stream()
//                .reduce(0, Integer::sum);
//
//        System.out.println(sum);


 // ########## max function
//
//        List<Integer> list = Arrays.asList(-10); // return max = 0 because indetity element is 0
////        List<Integer> list = Arrays.asList(-10,-10);
////        List<Integer> list = Arrays.asList(1,12,15);
//
//        Integer max =
//                list.stream()
//                        .reduce(0, Integer::max);
//
//        System.out.println(max);


        // ########## fixing above issue

//        List<Integer> list = Arrays.asList(); // return max = 0 because indetity element is 0
//        List<Integer> list = Arrays.asList(-10,-10);
        List<Integer> list = Arrays.asList(1,12,15);

        Optional<Integer> max =
                list.stream()
                        .reduce(Integer::max);


        System.out.println(max.orElse(0));
    }
}

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorLambda {
    public static void main(String... args){

        /**
         * anonymous class with 2 params
         */
//        Comparator comparator = new Comparator<String>() {
//            @Override
//            public int compare(String s1, String s2) {
//                return Integer.compare(s1.length(),s2.length());
//            }
//        };

        Comparator<String> comparator = (String s1, String s2) -> Integer.compare(s1.length(),s2.length());



        List<String> strings = Arrays.asList("rajesh", "yogeshs", "RT");
        Collections.sort(strings,comparator);

        for(String s: strings){
            System.out.println(s);
        }

    }
}

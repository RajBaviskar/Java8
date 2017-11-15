import java.util.function.Predicate;
import java.util.stream.Stream;

public class FirstPredicate {

    public static void main(String[] args){
        Stream<String> stream = Stream.of("One", "Two", "Three", "Four", "Five");

        Predicate<String> p1 = s -> s.length() > 3;

        Predicate<String> p2 = Predicate.isEqual("Two");
        Predicate<String> p3 = Predicate.isEqual("three");

        stream.filter(p1.or(p3))
                .forEach(System.out::println);
     }
}

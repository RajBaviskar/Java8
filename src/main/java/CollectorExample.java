import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CollectorExample {
    public static void main(String... args){
        List<Person> personList = new ArrayList<>();

        try (

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(
                            CollectorExample.class.getResourceAsStream("people.txt")));

        ){
            Stream<String> eachline = reader.lines();

            eachline.map(line -> {
                String[] s = line.split(" ");
                Person p = new Person(s[0].trim(), Integer.parseInt(s[1]));
                personList.add(p);
                return p;
            }).forEach(System.out::println);
        }catch (IOException ioe){
            System.out.println(ioe);
        }
    }
}

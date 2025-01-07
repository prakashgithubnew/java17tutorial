import java.util.Comparator;
import java.util.List;


public class ListImplementation {
    public static void main(String args[]){
        List<Integer> list = List.of(1,2,5,0,17,11);
        System.out.println("List in default sorting order");
        list.stream().sorted().forEach(System.out::println);

        System.out.println("List in descending sorting order");
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}

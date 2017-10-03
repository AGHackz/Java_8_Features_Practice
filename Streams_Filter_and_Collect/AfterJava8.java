import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class AfterJava8 {
    
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Kotlin", "Java", "Android", "Swift", "iOS");
        List<String> filteredList = list.stream().filter(
            item -> !item.equals("Java")
        ).collect(
            Collectors.toList()
        );

        filteredList.forEach(
            item -> System.out.println(item)
        );
    }

}
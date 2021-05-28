package HW_10;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Second {

    public static void main(String[] args) {
        List<String> users = Arrays.asList("Gandalf", "Aragorn", "Gimli", "Legolas","Sam", "Frodo", "Boromir", "Pippin", "Merry");
        List <String> result = users.stream()
                .map(user -> user.toUpperCase())
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(result);
    }
}

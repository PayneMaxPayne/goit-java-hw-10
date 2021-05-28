package HW_10;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Fifth {
    private static Stream<String> first = Arrays.stream(new String[]{"A", "B", "C"});
    private static Stream<String> second = Arrays.stream(new String[]{"D", "E", "F", "G", "H", "I"});

    public static <E> Stream<E> zip(Stream<E> first, Stream<E> second) {
        Iterator<E> firstIterate = first.iterator();
        Iterator<E> secondIterate = second.iterator();
        Stream<E> result = Stream.empty();
        while (firstIterate.hasNext() & secondIterate.hasNext()) {
            result = Stream.concat(result, Stream.of(firstIterate.next(),
                    secondIterate.next()));
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(zip(first, second).collect(Collectors.joining(" ")));
    }
}

package HW_10;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Fourth {
    public List<Long> generator(long a, long c, long m, long seed) {
        Stream<Long> streamFromIterate = Stream.iterate(seed, n -> 1 * (a * n + c) % m);
        return streamFromIterate.limit(10).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Fourth test = new Fourth();
        System.out.println(test.generator(25214903917L, 11L, 2^48, 0L));
    }
}

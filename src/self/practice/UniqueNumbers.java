package self.practice;

import java.util.Arrays;
import java.util.Collection;
import java.util.function.Function;

import static java.util.stream.Collectors.*;

public class UniqueNumbers {
    public static Collection<Integer> findUniqueNumbers(Collection<Integer> numbers) {
      return numbers.stream().collect(collectingAndThen(groupingBy(Function.identity(), counting()), m -> {
            m.values().removeIf(c -> c > 1);
            return m.keySet();
        }));
    }
    public static void main(String[] args) {
        findUniqueNumbers(Arrays.asList(1, 2, 1, 3)).forEach(System.out::println);
    }
}

package coll;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.random.RandomGenerator;
import java.util.stream.IntStream;

/**
 * @author matemaster
 */
public class ListTest {

    @Test
    public void list() {
        List<String> emptyList = List.of();
        System.out.println(emptyList);
    }

    @Test
    public void test1() {

        RandomGenerator defaultRandom = RandomGenerator.getDefault();

        int[] arr1 = IntStream.generate(() -> defaultRandom.nextInt(0, 100))
                .limit(defaultRandom.nextInt(0, 100))
                .toArray();

        int[] arr2 = IntStream.generate(() -> defaultRandom.nextInt(0, 100))
                .limit(defaultRandom.nextInt(0, 100))
                .toArray();

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.stream(arr1).boxed().toList());
        list.addAll(Arrays.stream(arr2).boxed().toList());

        Collections.sort(list);
        if (list.size() % 2 == 0) {
            int sum = list.get(list.size() / 2) + list.get(list.size() / 2 - 1);
            System.out.println(sum / 2.0);
        } else {
            System.out.println(list.get(list.size() / 2));
        }

    }
}

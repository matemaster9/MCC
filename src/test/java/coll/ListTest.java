package coll;

import org.junit.Test;

import java.util.List;

/**
 * @author matemaster
 */
public class ListTest {

    @Test
    public void list() {
        List<String> emptyList = List.of();
        System.out.println(emptyList);
    }
}

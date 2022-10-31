import org.junit.Test;

/**
 * @author matemaster
 */
public class RecordTest {


    @Test
    public void name() {
        Person mate = new Person("mate", 24);
        System.out.println(mate.name());
        System.out.println(mate.age());
    }

}

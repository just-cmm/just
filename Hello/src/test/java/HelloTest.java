import org.junit.Test;

/**
 * @author cang
 * @create 2021-08-31 21:50
 */
public class HelloTest {
    @Test
    public void testHello() {
        Hello hello = new Hello();
        String maven = hello.sayHello("Maven");
        System.out.println(maven);
    }
}

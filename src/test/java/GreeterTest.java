import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

public class GreeterTest {

    private Greeter greeter = new Greeter();

    @Test
    public void greet(){
        String result = greeter.greet("Emmalala");

        assertEquals("Hello Emma!", result);
        assertThat("Hello Emma!").isEqualTo(result);
    }

}
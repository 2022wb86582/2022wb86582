package com.bits;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
public class AppTest {
    @Test
    public void messageShouldContainHello() {
        App.main(new String[]{});
        assertTrue(App.getMessage().contains("Hello"));
    }
}

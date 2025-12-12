package hooks;

import core.DriverFactory;
import core.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before
    public void setUp() {
        TestBase.initialize();
    }

    @After
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}

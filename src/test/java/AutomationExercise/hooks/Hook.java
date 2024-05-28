package AutomationExercise.hooks;

import AutomationExercise.utilities.ConfigReader;
import AutomationExercise.utilities.Driver;
import io.cucumber.messages.types.Exception;
import org.junit.Before;

public class Hook  {

    @Before
    public void setUp() throws Exception {
        Driver.getDriver().get(ConfigReader.getProperty("URL"));

    }
}

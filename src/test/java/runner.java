import org.junit.runner.RunWith;
import org.junit.runner.RunWith; 
import cucumber.junit.Cucumber; 

@RunWith(Cucumber.class)

@Cucumber.Options(format={"pretty","html:reports/test-report", "json:target/cucumber.json"},tags= "@smokeTest")
public class runner {
}

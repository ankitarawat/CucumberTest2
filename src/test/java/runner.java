//import cucumber.api.CucumberOptions;
//import org.junit.runner.RunWith;
import org.junit.runner.RunWith; 
import cucumber.junit.Cucumber; 

 
/*import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber; */
 


@RunWith(Cucumber.class)

@Cucumber.Options(format={"pretty", "html:target/cucumber","json:target/cucumber.json"},tags= {"@smokeTest,@tagTest"})

//features = {"src/test/resources/features"

//@Cucumber.Options(format={"pretty", "html:target/cucumber","json:target/cucumber.json"},tags= {"@smokeTest"})
public class runner {
}


import cucumber.annotation.en.Given; 
import cucumber.annotation.en.Then; 
import cucumber.annotation.en.When; 

public class stepTest {

       @Given("^sample feature file is ready$")
       public void givenStatment(){

              System.out.println("Given statement executed successfully");

       }
       @When("^I run the feature file$")

      public void whenStatement(){

              System.out.println("When statement execueted successfully");

       }

       @Then("^run should be successful$")

       public void thenStatment(){

              System.out.println("Then statement executed successfully");
       }
              
      //for sample2.feature
              
              
        @Given("^i am on homepage$")
              public void givenStatment1(){

                     System.out.println("Given statement executed successfully");

              }
              @When("^When I open contact page$")

             public void whenStatement1(){

                     System.out.println("When statement execueted successfully");

              }

              @Then("^Then contact page is opened$")

              public void thenStatment1(){

                     System.out.println("Then statement executed successfully");
                     
             //for sample2.feature
              
              

       }

}

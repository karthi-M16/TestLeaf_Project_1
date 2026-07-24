package runner;


import base.BaseClass;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features={"src/test/resources/features"},
    glue={"pages"},plugin={"pretty"}
)
public class RunnerCucumber extends BaseClass {

}
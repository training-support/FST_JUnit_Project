package testSuite;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectPackages("examples")
@SelectClasses({examples.CalculatorTest.class, examples.ExecutionOrderTest.class})

public class NewTestSuiteExample {}
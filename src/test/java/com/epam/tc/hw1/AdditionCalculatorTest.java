package com.epam.tc.hw1;

import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class AdditionCalculatorTest extends TestingCalculatorOperations {

    @DataProvider(name = "DPAdd")
    public Object[][] dataSetForAddition() {
        return new Object[][]{{5, 3, 8}, {0, 0, 0}, {-11, -3, -14}, {1677, 2300, 3977}, {1.5, 1.5, 3}};
    }

    @Test(dataProvider = "DPAdd", groups = {"subAddition"})
    public void sumTest(double a, double b, double realSumOfAddition) {
        double sumOfAddition = calculator.sum(a, b);
        assertThat(sumOfAddition).isEqualTo(realSumOfAddition);
    }
}

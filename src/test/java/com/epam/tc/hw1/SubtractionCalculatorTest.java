package com.epam.tc.hw1;

import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class SubtractionCalculatorTest extends TestingCalculatorOperations {

    @DataProvider(name = "DPSubtraction")
    public Object[][] dataSetForSubtraction() {
        return new Object[][]{{17, 5, 12}, {-4444, -4, -4440}, {8, 10, -2}};
    }

    @Test(dataProvider = "DPSubtraction", groups = {"subAddition"})
    public void subTest(long a, long b, long realDifference) {
        long differenceAfterSub = calculator.sub(a, b);
        assertThat(differenceAfterSub).isEqualTo(realDifference);
    }
}

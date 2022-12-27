package com.epam.tc.hw1;

import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultipleCalculatorTest extends TestingCalculatorOperations {

    @DataProvider(name = "DBMultiple")
    public Object[][] dataSetForMultiplication() {
        return new Object[][]{{7, 3, 21}, {-7, -3, 21}, {333, 3, 999}, {0, 0, 0}};
    }

    @Test(dataProvider = "DBMultiple", groups = {"divMultiple"})
    public void multipleTest(long a, long b, long realProduct) {
        long productAfterMultiple = calculator.mult(a, b);
        assertThat(productAfterMultiple).isEqualTo(realProduct);
    }
}


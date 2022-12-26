package com.epam.tc.hw1;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DivisionCalculatorTest extends TestingCalculatorOperations {

    @DataProvider(name = "DPDivision")
    public Object[][] dataSetForDivision() {
        return new Object[][]{{5, 2, 2}, {-6, -3, 2}, {10000, 55, 181}, {- 1777, -35, 50}};
    }

    @Test(dataProvider = "DPDivision", groups = {"divMultiple"})
    public void divTest(long a, long b, long realRemainder) {
        long remainderAfterDivision = calculator.div(a, b);
        assertThat(remainderAfterDivision).isEqualTo(realRemainder);
    }

    @Test(groups = {"divMultiple"})
    public void divBy0Test() {
        assertThatThrownBy(() -> calculator.div(1L, 0L)).isInstanceOf(NumberFormatException.class);
    }
}

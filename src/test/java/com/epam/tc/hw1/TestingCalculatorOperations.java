package com.epam.tc.hw1;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

abstract class TestingCalculatorOperations  {

    protected Calculator calculator;

    @BeforeMethod(groups = {"subAddition", "divMultiple"})
    public void initializeCalculator() {
        calculator = new Calculator();
    }

    @AfterMethod(groups = {"subAddition", "divMultiple"})
    public void clearCalculator() {
        calculator = null;
    }
}

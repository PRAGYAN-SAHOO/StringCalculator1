package com.pra;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

		
	public class TestCalculator {
		
	    private Calculator calculator;

	    @BeforeEach
	    void init() {
	        calculator = new Calculator();
	    }

	   @Test
	    public void emptyStringReturnZero()throws Exception {
	    	assertEquals(calculator.calculate(""),0);
	    }
	    @Test
	   public void singleValueIsReplied()throws Exception {
		   assertEquals(calculator.calculate("1"),1);
	   }
	    @Test
	    public void TwoNumCommaDelimiterReturnSum()throws Exception {
			   assertEquals(calculator.calculate("1,2"),3);
		   }
	    @Test
	    public void TwoNumNewLineDelimiterReturnSum()throws Exception {
			   assertEquals(calculator.calculate("1,2,3"),6);
	}
	    
	    public void ThreeNumDelimiterReturnSum()throws Exception {
			   assertEquals(calculator.calculate("1\n2"),3);
	}
	 /*@Test
	   public void negativeInputReturnException()throws Exception {
	  calculator.calculate("-1");
	}*/
	    public void ignorNumGreaterThan1000()throws Exception
	    {
	    	  assertEquals(calculator.calculate("1,2,1001"),3);
	    }
	}

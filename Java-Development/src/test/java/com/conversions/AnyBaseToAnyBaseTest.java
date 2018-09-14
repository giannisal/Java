package src.test.java.com.conversions;

import org.junit.Assert;
import org.junit.Test;
import src.main.java.com.conversions.AnyBaseToAnyBase;

public class AnyBaseToAnyBaseTest {
	
	@Test
	  public void valid4baseTrue() {
		AnyBaseToAnyBase anyBaseToAnyBase = new AnyBaseToAnyBase();
		
		Assert.assertTrue(anyBaseToAnyBase.validForBase("0", 2));
		Assert.assertTrue(anyBaseToAnyBase.validForBase("166", 10));
		Assert.assertTrue(anyBaseToAnyBase.validForBase("3", 8));
		Assert.assertTrue(anyBaseToAnyBase.validForBase("6CE", 16));
		Assert.assertTrue(anyBaseToAnyBase.validForBase("PQ", 32));
		Assert.assertTrue(anyBaseToAnyBase.validForBase("2", 5));
		Assert.assertTrue(anyBaseToAnyBase.validForBase("1", 4));
		Assert.assertTrue(anyBaseToAnyBase.validForBase("0", 3));
		
	}
	
	
	@Test
	  public void valid4baseFalse() {
		AnyBaseToAnyBase anyBaseToAnyBase = new AnyBaseToAnyBase();
		
		Assert.assertFalse(anyBaseToAnyBase.validForBase("5", 2));
		Assert.assertFalse(anyBaseToAnyBase.validForBase("16A", 10));
		Assert.assertFalse(anyBaseToAnyBase.validForBase("9", 8));
		Assert.assertFalse(anyBaseToAnyBase.validForBase("ZA", 16));
		Assert.assertFalse(anyBaseToAnyBase.validForBase("ZZ", 32));
		Assert.assertFalse(anyBaseToAnyBase.validForBase("29", 5));
		Assert.assertFalse(anyBaseToAnyBase.validForBase("15", 4));
		Assert.assertFalse(anyBaseToAnyBase.validForBase("90", 3));
		
	}
	
	@Test
	  public void base2baseRight() {
	    AnyBaseToAnyBase anyBaseToAnyBase = new AnyBaseToAnyBase();
	    
	    Assert.assertEquals("0", anyBaseToAnyBase.base2base("0", 10, 2));
	    Assert.assertEquals("4", anyBaseToAnyBase.base2base("100", 2, 10));
	    Assert.assertEquals("5", anyBaseToAnyBase.base2base("101", 2, 10));
	    Assert.assertEquals("10", anyBaseToAnyBase.base2base("1010", 2, 10));
	    Assert.assertEquals("1024", anyBaseToAnyBase.base2base("10000000000", 2, 10));
	    Assert.assertEquals("7", anyBaseToAnyBase.base2base("7", 8, 10));
	    Assert.assertEquals("8", anyBaseToAnyBase.base2base("10", 8, 10));
	    Assert.assertEquals("9", anyBaseToAnyBase.base2base("11", 8, 10));
	    Assert.assertEquals("10", anyBaseToAnyBase.base2base("12", 8, 10));
	    Assert.assertEquals("1024", anyBaseToAnyBase.base2base("2000", 8, 10));
	    Assert.assertEquals("10", anyBaseToAnyBase.base2base("10", 10, 10));
	    Assert.assertEquals("1024", anyBaseToAnyBase.base2base("1024", 10, 10));
	    Assert.assertEquals("16", anyBaseToAnyBase.base2base("10", 16, 10));
	    Assert.assertEquals("17", anyBaseToAnyBase.base2base("11", 16, 10));
	    Assert.assertEquals("100", anyBaseToAnyBase.base2base("64", 16, 10));
	    Assert.assertEquals("225", anyBaseToAnyBase.base2base("E1", 16, 10));
	    Assert.assertEquals("1024", anyBaseToAnyBase.base2base("400", 16, 10));
	    Assert.assertEquals("100001", anyBaseToAnyBase.base2base("11110100", 2, 3));
	    Assert.assertEquals("1043", anyBaseToAnyBase.base2base("11110011", 2, 6));
	    Assert.assertEquals("183", anyBaseToAnyBase.base2base("11110011", 2, 12));
	    Assert.assertEquals("A3", anyBaseToAnyBase.base2base("11110011", 2, 24));
	    Assert.assertEquals("7J", anyBaseToAnyBase.base2base("11110011", 2, 32));
	    Assert.assertEquals("6R", anyBaseToAnyBase.base2base("11110011", 2, 36));
	    Assert.assertEquals("110113", anyBaseToAnyBase.base2base("1210021", 3, 4));
	    Assert.assertEquals("2427", anyBaseToAnyBase.base2base("1210021", 3, 8));
	    Assert.assertEquals("159", anyBaseToAnyBase.base2base("110210", 3, 16));
	    Assert.assertEquals("2I2H", anyBaseToAnyBase.base2base("11021021221", 3, 32));
	    Assert.assertEquals("8A3923A", anyBaseToAnyBase.base2base("251426245", 7, 11));
	    //Assert.assertEquals("3CFGCC5F99", anyBaseToAnyBase.base2base("251426245523516", 7, 20));
	    //Assert.assertEquals("21220100220120221122", anyBaseToAnyBase.base2base("71539A12B", 12, 3));
	    //Assert.assertEquals("2AA6DC596DB", anyBaseToAnyBase.base2base("71539A12BA29", 12, 17));
	    //Assert.assertEquals("13011103212201022322022133300000", anyBaseToAnyBase.base2base("139AD7793B1362C67", 15, 4));
	    Assert.assertEquals("0", anyBaseToAnyBase.base2base("0", 15, 6));
	    Assert.assertEquals("20APP3QDNGNE1H", anyBaseToAnyBase.base2base("139AD7793B1362C67", 15, 27));
	    Assert.assertEquals("123213313", anyBaseToAnyBase.base2base("92BFB", 16, 5));
	    Assert.assertEquals("5052300", anyBaseToAnyBase.base2base("92BFB", 16, 7));
	    Assert.assertEquals("K5EO", anyBaseToAnyBase.base2base("92BFB", 16, 31));
	    
	}
	
	@Test
	  public void base2baseInvalidBase() {
		
		AnyBaseToAnyBase anyBaseToAnyBase = new AnyBaseToAnyBase();
		
	    Assert.assertEquals("Invalid base!", anyBaseToAnyBase.base2base("95", 1, 16));
	    Assert.assertEquals("Invalid base!", anyBaseToAnyBase.base2base("2", 2, 89));
	    Assert.assertEquals("Invalid base!", anyBaseToAnyBase.base2base("2", 64, 89));
	    Assert.assertEquals("Invalid base!", anyBaseToAnyBase.base2base("2", 2, 0));

	  }
	
	@Test
	  public void base2baseInvalidNumber() {
		
		AnyBaseToAnyBase anyBaseToAnyBase = new AnyBaseToAnyBase();
		
		Assert.assertEquals("The number is invalid for this base!", anyBaseToAnyBase.base2base("2", 2, 12));
	    Assert.assertEquals("The number is invalid for this base!", anyBaseToAnyBase.base2base("7", 3, 16));
	    Assert.assertEquals("The number is invalid for this base!", anyBaseToAnyBase.base2base("8", 8, 2));
	    Assert.assertEquals("The number is invalid for this base!", anyBaseToAnyBase.base2base("9", 8, 10));
	    Assert.assertEquals("The number is invalid for this base!", anyBaseToAnyBase.base2base("A", 10, 26));
	    Assert.assertEquals("The number is invalid for this base!", anyBaseToAnyBase.base2base("G", 16, 9));
	}

}

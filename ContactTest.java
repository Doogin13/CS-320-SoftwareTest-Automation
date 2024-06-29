package Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import Contact.Contact;

class ContactTest {

	@DisplayName("Test a constructor with good behavior")
	@Test
	void testGoodConstructor() {
		String contactId="12";
		String firstName="David";
		String lastName="Brown";
		String phoneNumber="1234567890";
		String address="327 Oak St";
		
		Contact testContact = new Contact(contactId, firstName, lastName,phoneNumber,address);
		
		assertEquals(contactId, testContact.getContactID());
		assertEquals(firstName, testContact.getFirstName());
		assertEquals(lastName, testContact.getLastName());
		assertEquals(phoneNumber, testContact.getPhoneNumber());
		assertEquals(address, testContact.getAddress());
	}
	
	@DisplayName("Test an invalid constructor")
	@Test
	void testBadConstructor() {
		String contactId="4";
		String firstName="David";
		String lastName="Brown";
		String phoneNumber="1";
		String address="327 Oak St";
		
		Assertions.assertThrows(IllegalArgumentException.class,
				()->{new Contact(contactId, firstName,lastName,phoneNumber,address);
				});
		}
		
	
	
	
	@DisplayName("Test a valid setFirstName")
	@Test
	void testGoodFirstName() {
		String contactId="12";
		String firstName="David";
		String lastName="Brown";
		String phoneNumber="1234567890";
		String address="327 Oak St";
	
		Contact testContact = new Contact("12", "David", "Brown", "1234567890", "327 Oak St");
	
		testContact.setFirstName("Test");
		assertEquals("Test", testContact.getFirstName());
	}
	
	/**
	 * Test setFirstName with a null string; should throw an error
	 */
	@DisplayName("Test an invalid null setFirstName")
	@Test
	public void testBadSetFirst() {
        String contactId = "3";
      	String firstName = "David";
        String lastName = "Brown";
        String phoneNumber = "1234567890";
        String address = "327 Oak St";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setFirstName(null);
        });
	}
	
	/**
	 * Test the setFirstName with length too great; should throw an exception
	 */
	@DisplayName("Test an invalid length setFirstName")
	@Test
	public void testLongSetFirst() {
        String contactId = "3";
      	String firstName = "David";
        String lastName = "Brown";
        String phoneNumber = "1234567890";
        String address = "327 Oak St";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setFirstName("IamWayTooLongOfAFirstName");
        });
	}
	
	/**
	 * Test getID by using a good constructor and then evaluate that an integer is returned
	 */
	@DisplayName("Test getID")
	@Test
	public void testGetID() {
        String contactId = "3";
      	String firstName = "David";
        String lastName = "Brown";
        String phoneNumber = "1234567890";
        String address = "327 Oak St";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        assertEquals("3", testContact.getContactID());
	}
	
	/**
	 * Test getID by using a good constructor and then evaluate that a string IS NOT returned
	 */
	@DisplayName("Test bad getID")
	@Test
	public void testBadGetID() {
        String contactId = "3";
      	String firstName = "David";
        String lastName = "Brown";
        String phoneNumber = "1234567890";
        String address = "327 Oak St";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        assertEquals("3", testContact.getContactID());
	}
	
	/**
	 * Test getID by using an ID too long in the constructor
	 */
	@DisplayName("Test too long getID")
	@Test
	public void testlongGetID() {
        String contactId = "12345678910111213";
      	String firstName = "David";
        String lastName = "Brown";
        String phoneNumber = "1234567890";
        String address = "327 Oak St";
		
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	new Contact(contactId, firstName, lastName, phoneNumber, address);
        });
	}
	
	/**
	 * Test setLastName with a null string; should throw an error
	 */
	@DisplayName("Test an invalid null setLastName")
	@Test
	public void testBadSetLast() {
        String contactId = "3";
      	String firstName = "David";
        String lastName = "Brown";
        String phoneNumber = "1234567890";
        String address = "327 Oak St";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setLastName(null);
        });
	}
	
	/**
	 * Test the setLastName with length too great; should throw an exception
	 */
	@DisplayName("Test an invalid length setLastName")
	@Test
	public void testLongSetLast() {
        String contactId = "3";
      	String firstName = "David";
        String lastName = "Brown";
        String phoneNumber = "1234567890";
        String address = "327 Oak St";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setLastName("IamWayTooLongOfALastName");
        });
	}
	
	/**
	 * Test the setLastName with good input 
	 */
	@DisplayName("Test a valid setLastName")
	@Test
	public void testGoodsetLast() {
        String contactId = "3";
      	String firstName = "David";
        String lastName = "Brown";
        String phoneNumber = "1234567890";
        String address = "327 Oak St";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        testContact.setLastName("Test");        
        assertEquals("Test", testContact.getLastName());
	}
	
	/**
	 * Test setPhoneNumber with a null string; should throw an error
	 */
	@DisplayName("Test an invalid null setPhoneNumber")
	@Test
	public void testBadSetPhone() {
        String contactId = "3";
      	String firstName = "David";
        String lastName = "Brown";
        String phoneNumber = "1234567890";
        String address = "327 Oak St";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setPhoneNumber(null);
        });
        
	}
	
	/**
	 * Test the setPhone with length != 10; should throw an exception
	 */
	@DisplayName("Test an invalid length setPhoneNumber")
	@Test
	public void testWrongLengthPhone() {
        String contactId = "3";
      	String firstName = "David";
        String lastName = "Brown";
        String phoneNumber = "1234567890";
        String address = "327 Oak St";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setPhoneNumber("1");
        });
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setPhoneNumber("123456789101112131415");
        });
	}
	/**
	 * Test the setPhone with length 10
	 */
	@DisplayName("Test a valid length setPhoneNumber")
	@Test
	public void testGoodPhone() {
        String contactId = "3";
      	String firstName = "David";
        String lastName = "Brown";
        String phoneNumber = "1234567890";
        String address = "327 Oak SAt";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   

        testContact.setPhoneNumber("1987654321");        
        assertEquals("1987654321", testContact.getPhoneNumber());

	}
	
	/**
	 * Test setAddress with a null string; should throw an error
	 */
	@DisplayName("Test an invalid null setAddress")
	@Test
	public void testNullSetAddress() {
        String contactId = "3";
      	String firstName = "David";
        String lastName = "Brown";
        String phoneNumber = "1234567890";
        String address = "327 Oak St";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setAddress(null);
        });
        
	}
	
	/**
	 * Test the setAddress with length > 30; should throw an exception
	 */
	@DisplayName("Test an invalid length setPhoneNumber")
	@Test
	public void testWrongLengthAddress() {
        String contactId = "3";
      	String firstName = "David";
        String lastName = "Brown";
        String phoneNumber = "1234567890";
        String address = "327 Oak St";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setAddress("123456789 Address Waaaaaaaaaay Toooooo Long Street");
        });
	}
	/**
	 * Test the setAddress with good input
	 */
	@DisplayName("Test a valid length setAddress")
	@Test
	public void testGoodAddress() {
        String contactId = "3";
      	String firstName = "David";
        String lastName = "Brown";
        String phoneNumber = "1234567890";
        String address = "327 Oak St";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   

        testContact.setAddress("987 Good Address");        
        assertEquals("987 Good Address", testContact.getAddress());

	}
	
}

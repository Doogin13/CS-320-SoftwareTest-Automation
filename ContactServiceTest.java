package Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Contact.Contact;
import Contact.ContactService;

class ContactServiceTest {

	@Test
	void testContactService() {
		//fail("Not yet implemented");
		
	}

	@Test
	void testAddContact() {
		ContactService contactService = new ContactService();
        Contact contact = new Contact("12", "David", "Brown", "1234567890", "327 Oak St");
        contactService.addContact(contact);
        
        assertEquals(contact, contactService.getContact("12"));
		
		//fail("Not yet implemented");
	}

	@Test
	void testDeleteContact() {
		ContactService contactService = new ContactService();
        Contact contact = new Contact("12", "David", "Brown", "1234567890", "327 Oak St");
        contactService.addContact(contact);
        contactService.deleteContact("12");

        assertNull(contactService.getContact("12"));
		
		//fail("Not yet implemented");
	}

	@Test
	void testUpdateFirstName() {
		ContactService contactService = new ContactService();
        Contact contact = new Contact("12", "David", "Brown", "1234567890", "327 Oak St");
        contactService.addContact(contact);
        contactService.updateFirstName("12", "Larry");

        assertEquals("Larry", contactService.getContact("12").getFirstName());
		
		//fail("Not yet implemented");
	}

	@Test
	void testUpdateLastName() {
		ContactService contactService = new ContactService();
        Contact contact = new Contact("12", "David", "Brown", "1234567890", "327 Oak St");
        contactService.addContact(contact);
        contactService.updateLastName("12", "Grey");

        assertEquals("Grey", contactService.getContact("12").getLastName());
		
		//fail("Not yet implemented");
	}

	@Test
	void testUpdatePhone() {
		ContactService contactService = new ContactService();
        Contact contact = new Contact("12", "David", "Brown", "1234567890", "327 Oak St");
        contactService.addContact(contact);
        contactService.updatePhone("12", "5555555555");

        assertEquals("5555555555", contactService.getContact("12").getPhoneNumber());
		
		//fail("Not yet implemented");
	}

	@Test
	void testUpdateAddress() {
		ContactService contactService = new ContactService();
        Contact contact = new Contact("12", "David", "Brown", "1234567890", "327 Oak St");
        contactService.addContact(contact);
        contactService.updateAddress("12", "715 Reading St");

        assertEquals("715 Reading St", contactService.getContact("12").getAddress());
		
		//fail("Not yet implemented");
	}

}

package Contact;




import java.util.HashMap;
import java.util.Map;
//import java.util.function.BooleanSupplier;


public class ContactService {
    private Map<String, Contact> contacts;

    public ContactService() {
        contacts = new HashMap<>();
    }

    public void addContact(Contact contact) {
        contacts.put(contact.getContactID(), contact);
    }

    public void deleteContact(String contactID) {
        contacts.remove(contactID);
    }

    public void updateFirstName(String contactID, String newFirstName) {
        Contact contact = contacts.get(contactID);
        if (contact != null) {
            contact.firstName = newFirstName;
        }
    }

    public void updateLastName(String contactID, String newLastName) {
        Contact contact = contacts.get(contactID);
        if (contact != null) {
            contact.lastName = newLastName;
        }
    }

    public void updatePhone(String contactID, String newPhone) {
        Contact contact = contacts.get(contactID);
        if (contact != null) {
            contact.phoneNumber = newPhone;
        }
    }

    public void updateAddress(String contactID, String newAddress) {
        Contact contact = contacts.get(contactID);
        if (contact != null) {
            contact.address = newAddress;
        }
    }

	public Contact getContact(String contactID) {
		// TODO Auto-generated method stub
		return contacts.get(contactID);
	}

	
}

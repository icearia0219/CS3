import java.util.ArrayList;
import java.util.List;

class ContactDAO {
    private List<Contact> contacts = new ArrayList<>();

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public List<Contact> getAllContacts() {
        return contacts;
    }

    public void updateContact(String name, String newPhone) {
        for (Contact contact : contacts) {
            if (contact.name.equals(name)) {
                contact.phone = newPhone;
                return;
            }
        }
    }
    public void deleteContact(String name) {
        contacts.removeIf(contact -> contact.name.equals(name));
    }
}
import java.util.List;

class AddressBookService {
    private ContactDAO contactDAO = new ContactDAO();

    public void addContact(String name, String phone) {
        contactDAO.addContact(new Contact(name, phone));
    }

    public List<Contact> getContacts() {
        return contactDAO.getAllContacts();
    }

    public void updateContact(String name, String phone) {
        contactDAO.updateContact(name, phone);
    }

    public void deleteContact(String name) {
        contactDAO.deleteContact(name);
    }
}
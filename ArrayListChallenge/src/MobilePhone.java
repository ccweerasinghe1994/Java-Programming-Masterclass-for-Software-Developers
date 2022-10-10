import java.util.ArrayList;
import java.util.Objects;

public class MobilePhone {
    private static final ArrayList<Contact> contacts = new ArrayList<>();

    public void addContactToList(String name, int number) {
        if (isExists(name)) {
            System.out.println("This contact already exists");
        } else {
            Contact contact = new Contact(name, number);
            contacts.add(contact);
        }

    }

    public void printContactList() {
        System.out.println("your contact list has " + contacts.size() + " items");
        for (Contact contact : contacts) {
            System.out.println(contact.getName() + " : " + contact.getNumber());
        }
    }

    private boolean isExists(String contactName) {
        for (Contact contact : contacts) {
            return Objects.equals(contact.getName(), contactName);
        }
        return false;
    }

    private Contact getContact(String contactName) {
        Contact matchedContact = null;
        for (Contact contact : contacts) {
            if (Objects.equals(contact.getName(), contactName)) {
                matchedContact = contact;
            }
        }
        return matchedContact;
    }

    public void updateContact(String currentContactName, String name, Integer number) {
        if (isExists(currentContactName)) {
            for (Contact contact : contacts) {
                if (Objects.equals(contact.getName(), currentContactName)) {
                    if (number != null) {
                        contact.setNumber(number);
                    }
                    if (name != null) {
                        contact.setName(name);
                    }
                }
            }
        } else {
            System.out.println("this contact doesn't exist on you mobile");
        }
    }

    public void removeContact(String contactName) {
        Contact contact = getContact(contactName);
        if (contact != null) {
            contacts.remove(contact);
        } else {
            System.out.println("this contact is not found on your phone");
        }
    }

    public void findContact(String name) {
        Contact contact = getContact(name);
        if (contact == null) {
            System.out.println("this contact doesn't exist on your mobile");
        } else {
            System.out.println("Contact name :" + contact.getName() + ", number : " + contact.getNumber());
        }
    }

}

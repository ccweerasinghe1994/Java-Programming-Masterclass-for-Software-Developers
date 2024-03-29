import java.util.ArrayList;

public class MobilePhone {
    private String mobileNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String mobilePhone) {
        this.mobileNumber = mobilePhone;
        this.myContacts = new ArrayList<Contact>();
    }

    public void printContactList() {
        System.out.println("your contact list has " + myContacts.size() + " items");
        int index = 1;
        for (Contact contact : myContacts) {
            System.out.println(index + "." + contact.getName() + " -> " + contact.getPhoneNumber());
            index++;
        }
    }

    public boolean addContact(Contact contact) {
        if (findContact(contact) >= 0) {
            System.out.println("contact already in the contact list");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int position = findContact(oldContact);
        if (position < 0) {
            System.out.println("this contact was not found");
            return false;
        } else if (findContact(newContact.getName()) != -1) {
            System.out.println("This contact name already exists in your contact list. update failed");
            return false;
        }
        myContacts.set(position, newContact);
        System.out.println(oldContact.getName() + " is updated to " + newContact.getName());
        return true;
    }

    public boolean removeContact(Contact contact) {
        int position = findContact(contact);
        if (position < 0) {
            System.out.println("this contact was not found");
            return false;
        }
        myContacts.remove(contact);
        System.out.println("this " + contact.getName() + " is deleted");
        return true;
    }

    private int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }

    private int findContact(String contactName) {
        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    public String queryContact(Contact contact) {
        if (findContact(contact) >= 0) {
            return contact.getName();
        }
        return null;
    }

    public Contact queryContact(String name) {
        int position = findContact(name);
        if (position >= 0) {
            return myContacts.get(position);
        }
        return null;
    }
}

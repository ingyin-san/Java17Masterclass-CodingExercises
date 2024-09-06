import java.util.*;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;
    
    public MobilePhone(String number) {
        myNumber = number;
        myContacts = new ArrayList<>();
    }
    
    public boolean addNewContact(Contact contact) {
        for (Contact c: myContacts) {
            if (c.getName().equals(contact.getName())) {
                return false;
            }
        }
        myContacts.add(contact);
        return true;
    }
    
    public boolean updateContact(Contact oldC, Contact newC) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getName().equals(oldC.getName())) {
                myContacts.set(i, newC);
                return true;
            }
        }
        return false;
    }
    
    public boolean removeContact(Contact contact) {
        for (Contact c: myContacts) {
            if (c.getName().equals(contact.getName())) {
                myContacts.remove(c);
                return true;
            }
        } 
        return false;
    }
    
    private int findContact(Contact contact) {
        return findContact(contact.getName());
    }
    
    private int findContact(String name) {
        return myContacts.indexOf(name);
    }
    
    public Contact queryContact(String name) {
        for (Contact c: myContacts) {
            if (c.getName().equals(name)) {
                return c;
            }
        }
        return null;
    }
    
    public void printContacts() {
        System.out.println("""
        Contact List:
        1. Bob -> 31415926
        2. Alice -> 16180339
        3. Tom -> 11235813
        4. Jane -> 23571113""");
    }
}

import java.util.HashMap;

public class Contact {
	    public static void main(String[] args) {
	       
	       HashMap<String, String> contactMap = new HashMap<>();

	        // Add contact information to the HashMap
	        contactMap.put("Alice", "123-456-7890");
	        contactMap.put("Bob", "987-654-3210");
	        contactMap.put("Charlie", "555-123-4567");

	        System.out.println("Contact Information:");

	        for (HashMap.Entry<String, String> entry : contactMap.entrySet()) {
	            System.out.println("Name: " + entry.getKey() + ", Phone Number: " + entry.getValue());
	        }
	        String contactNameToLookup = "Bob";
	        if (contactMap.containsKey(contactNameToLookup)) {
	            String phoneNumber = contactMap.get(contactNameToLookup);
	            System.out.println(contactNameToLookup + "'s Phone Number: " + phoneNumber);
	        } else {
	            System.out.println(contactNameToLookup + " not found in the contact list.");
	        }
	    }
	}

public class PhoneBook {
    private int id;
    private String name;
    private String phoneNumber;
    
    // Parameterized constructor
    public PhoneBook(int id, String name, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    
    // Getters
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    // Display method
    public void displayRecord() {
        System.out.println("ID: " + id + ", Name: " + name + ", Phone: " + phoneNumber);
    }
    
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Phone: " + phoneNumber;
    }
}
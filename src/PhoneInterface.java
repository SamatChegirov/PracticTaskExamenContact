public interface PhoneInterface {

    void turnOn();
    void callN(int phoneNumber);
    void callC(String fullName);
    void searchContact(String names);
    void updateName(String newName, String oldName);
    void getAllContacts(Contact[] contacts);



}

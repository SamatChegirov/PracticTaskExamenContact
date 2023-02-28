import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Scanner;

public class Phone implements PhoneInterface {
    private String brand;
    private String name;
    private int password;
    Contact[] contacts;

    public Phone(String brand, String name, int password, Contact[] contacts) {
        this.brand = brand;
        this.name = name;
        this.password = password;
        this.contacts = contacts;
    }


    @Override
    public void turnOn() {
        System.out.println("\nТелефон включен\nВведите пароль: ");
        int scan = new Scanner(System.in).nextInt();
        if (scan == password) {
            System.out.println("Добро пожаловать!");
        } else {
            System.out.println("Введите пароль: ");
        }
    }

    @Override
    public void callN(int phoneNumber) {
        System.out.println("Введите номер:...");
        int num = new Scanner(System.in).nextInt();
        for (Contact n : contacts) {
            if (num == n.getPhoneNumber()) {
                System.out.println("Вызов..." + n.getFullName() + " " + n.getPhoneNumber());
            }
        }
    }

    @Override
    public void callC(String fullName) {
        System.out.println("Введите имя контакта...");
        String name = new Scanner(System.in).next();
        for (Contact c : contacts) {
            if (name.equals(c.getFullName())) {
                System.out.println("Вызов..." + c.getFullName() + " " + c.getPhoneNumber());
            }
        }
    }

    @Override
    public void searchContact(String names) {
        System.out.println("Поиск контактов...");
        String name = new Scanner(System.in).next();
        for (Contact con : contacts) {
            if (name.equals(con.getFullName())) {
                System.out.println("Найдено: " + con.getFullName() + " " + con.getPhoneNumber());
            }
        }
    }

    @Override
    public void updateName(String oldName, String newName) {
        System.out.println("Переименовать: ");
        for (Contact con : contacts) {
            if (con.getFullName().equals(oldName)) {
                con.setFullName(newName);
                System.out.println(newName);
            }
        }
    }

    @Override
    public void getAllContacts(Contact[] contacts) {
        System.out.println("\nВсе контакты: ");
        for (Contact co : contacts) {
            System.out.println(co.getFullName() + co.getPhoneNumber());
        }

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public Contact[] getContacts() {
        return contacts;
    }

    public void setContacts(Contact[] contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", password=" + password +
                ", contacts=" + Arrays.toString(contacts) +
                '}';
    }
}

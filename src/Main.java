import java.util.Scanner;

/**
 * 2 класс тузунуз  * Contact(phoneNumber, fullName)  * Phone(brand, name, password, Contacts[] contacts)
 * PhoneInterface деген interface тузунуз, turnOn(); телефонду жандырат,
 * пароль сурайт анан ошол пароль туура болсо "Телефон жанды" деп кайтарат метод.
 * call(); деген 2 метод бар бироосу параметрине телефон номер сурайт анан издейт
 * эгер тапса номер менен ошол номерди жана ошол номер кандай атта сакталган болсо ошол аты менен чалып жатасыз деп кайтарып берет
 * call(); дагы бир методу атын жазасыз эгер ошол ат менен сакталган контакт табылса
 * ошол контакттын атын жана ошол номерди кайтарып ушуга чалып жатасыз деп кайтарып берет
 * searchContact(); деген методдун жардамы менен контакттарды издейсиз параметрине
 * бир контактын аты жазылат, ошол ат менен контакт табылса ошол контакты(Contact) кайтарып берет
 * Contact updateName(); бул методдун жардамы менен контакттын атын озгортсо болот, параметрине 2 соз алат ( эскиАты, жаныАты)
 * getAllContacts(); бул метод бир телефондун ичиндеги контактардын баарын алып берет
 * main - ден класстардын объееттерин тузуп программанызды иштетиниз.
 */
public class Main {
    public static void main(String[] args) {

        Contact contact1 = new Contact("Дос1", 555);
        Contact contact2 = new Contact("Дос2", 773);
        Contact contact3 = new Contact("Дос3", 551);
        Contact contact4 = new Contact("Дос4", 552);
        Contact contact5 = new Contact("Дос5", 553);

        Phone phone = new Phone("RedMi", "Note11S", 1212, new Contact[]{contact1, contact2, contact3, contact4, contact5});

        phone.turnOn();
        phone.callN(0);
        phone.callC(" ");
        phone.searchContact(" ");
        phone.updateName("Дос4", "Доке4");
        phone.getAllContacts(phone.contacts);


    }
}
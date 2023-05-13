package j18_exceptionHandlingAndDebugging.Contact;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Contact {
    private String name;
    private String phoneNumber;
    private String birthDate;
    private int age;

    public Contact(String name, String phoneNumber, String birthDate) throws ParseException {
        if (name ==null||name.isBlank()) {
            throw new IllegalArgumentException("name can not be null or blank");
        }
        if (phoneNumber==null||phoneNumber.isBlank()) {
            throw new IllegalArgumentException("phone number can not be null or blank");
        }
        if (phoneNumber.length()<5) {
            throw new IllegalArgumentException("phone number can not be less than 5");
        }
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.age = toAge(birthDate);
    }

    public Contact(Contact source) {
        this.name = source.name;
        this.phoneNumber = source.phoneNumber;
        this.birthDate = source.birthDate;
        this.age = source.age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name ==null||name.isBlank()) {
            throw new IllegalArgumentException("name can not be null or blank");
        }
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber==null||phoneNumber.isBlank()) {
            throw new IllegalArgumentException("phone number can not be null or blank");
        }
        if (phoneNumber.length()<5) {
            throw new IllegalArgumentException("phone number can not be less than 5");
        }
        this.phoneNumber = phoneNumber;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) throws ParseException {
        this.birthDate = birthDate;
        setAge(toAge(birthDate));
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    public int toAge(String birthDate) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        formatter.setLenient(false);
        Date toDate = formatter.parse(birthDate);
        long toMili = toDate.getTime();
        long diff = new Date().getTime() - toMili;

        return (int) (TimeUnit.MILLISECONDS.toDays(diff) / 365);
    }

    public String toString() {
        return "Name: " + this.name + "\n" +
                "Phone Number: " + this.phoneNumber + "\n" +
                "Birth Date: " + this.birthDate + "\n" +
                "Age: " + this.age + " years old\n";
    }
}

package PR2.TUT8.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.regex.Pattern;

public class Person {
    int id;
    String name;
    String dateOfBirth;
    String email;
    String tel;
    String address;

    private boolean validateID(int id){
        return id>1;
    }
    private boolean validateName(String name){
        return name.length()<=35&& !name.isEmpty();
    }
    private boolean validateDateOfBirth(String dateOfBirth){
        return dateOfBirth.length()==8&&Pattern.compile("^(0[1-9]|[12][0-9]|3[01])(0[1-9]|1[012])((19|2[0-9])[0-9]{2})$").matcher(dateOfBirth).matches();
    }
    private boolean validateEmail(String email){
        return email.length()<=40&&Pattern.compile("^(?=.{1,64}@)[A-Za-z0-9_-]+(\\\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\\\.[A-Za-z0-9-]+)*(\\\\.[A-Za-z]{2,})$").matcher(email).matches();
    }
    private boolean validateTel(String tel){
        return tel.length()<=20;
    }
    private boolean validateAddress(String address){
        return address.length()<=60;
    }
    public Person(int ID, String name ,String dateOfBirth, String address){
        if(validateID(ID)){
        this.id = ID;
        }else{throw new RuntimeException("Invalid ID");}
        if(validateName(name)) {
            this.name = name;
        }else{throw new RuntimeException("Invalid name");}
        if(validateDateOfBirth(dateOfBirth)){
            this.dateOfBirth = dateOfBirth;
        }else{throw new RuntimeException("Invalid date of birth");}
        if(validateAddress(address)){
            this.address = address;
        }else{throw new RuntimeException("Invalid address");}
    }

    public void setEmail(String email) {
        if(validateEmail(email)){
        this.email = email;
        }else{throw new RuntimeException("Invalid email");}
    }
    public void setTel(String tel){
        if(validateTel(tel)){
            this.tel = tel;
        }else{throw new RuntimeException("Invalid telephone number");}
    }
    public String toString(){
        return id + " "+ name + " " + address;
    }
//    public static void sortPeople(ArrayList<Person> people, Comparator<Person> comparator){
//        people.sort(comparator);
//    }
}

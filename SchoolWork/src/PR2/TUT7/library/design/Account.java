package PR2.TUT7.library.design;

import javax.swing.plaf.ActionMapUIResource;

public class Account {
    public enum AccountStatus {
        ACTIVE,
        DISABLED,
        RESTRICTED,
        BLACKLISTED,
        DELETED
    }
        public static class Person {
            String name;
            String address;

            public Person(String name, String address) {
                this.name = name;
                this.address = address;
            }

            public String getName(Person person) {
                return person.name;
            }
            public String getAddress(Person person) {
                return person.address;
            }
            public void setAddress(String newaddress) {
                this.address = newaddress;
            }
            //@Override
            public String toString() {
                return "Person[name="+ this.name + ",address="+this.address+"]";
            }
        }
    private String accountType;
    private int ID;
    private String password;
    public Person person;
    public AccountStatus status;

    public Account(String accountType, int ID, Person person, AccountStatus accountStatus){
        if(validateAccountType(accountType)){
            this.accountType = accountType;
        }
        if(validateID(ID)){
            this.ID = ID;
        }
        this.status = accountStatus;
        this.person = person;
    }

    private boolean validateAccountType(String accountType){
        return accountType.equals("member")||accountType.equals("librarian");
        }
    private boolean validateID(int ID){
        return ID>=1;
    }
}

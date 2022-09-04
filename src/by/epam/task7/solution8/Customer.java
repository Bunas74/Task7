package by.epam.task7.solution8;

public class Customer {
	
	private int id;
    private String surname;
    private String firstname;
    private String patronymic;
    private String address;
    private int numberCard;
    private int accountBank;
    
    Customer(int i, String s, String f, String p, String ad, int n, int ac) {
        id = i;
        surname = s;
        firstname = f;
        patronymic = p;
        address = ad;
        numberCard = n;
        accountBank = ac;
    }
    
    public int getId() {
        return id;
    }
    public String getSurname() {
        return surname;
    }
    public String firstname() {
        return firstname;
    }
    public String getPatronymic() {
        return patronymic;
    }
    public String getAddress() {
        return address;
    }
    public int getNumberCard() {
        return numberCard;
    }
    public int getAccountBank() {
        return accountBank;
    }
    
    public void title() {
        System.out.printf("%-3s %-10s %-11s %-11s %-16s %8s %6s","ID","SURNAME","FIRSTNAME","PATRONYMIC","ADDRESS","CARD","ACCOUNT\n\n");
    }
    
    public void printList() {
        System.out.printf("%-3s %-10s %-11s %-11s %-16s %8s %6s \n", id, surname, firstname, patronymic, address, numberCard, accountBank);
    }

}

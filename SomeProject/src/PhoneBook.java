import java.util.HashMap;

public class PhoneBook {
    HashMap <String,Integer> PhoneBook = new HashMap<>();

    public HashMap<String, Integer> getPhoneBook() {
        return PhoneBook;
    }
    public Boolean checkName (String str){
        Boolean name = PhoneBook.containsKey(str);
        return name;
    }
    public Boolean checkNumber (Integer num){
        Boolean number = PhoneBook.containsValue(num);
        return number;
    }

    public void addEntry (String str){


    }
    public String typePhoneBook (){
        String type = "";
        return type;
    }
}

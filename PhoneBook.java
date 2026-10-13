import java.util.HashMap;
/**
 * Write a description of class PhoneBook here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PhoneBook
{
    private HashMap<String, String> phonebook;

    /**
     * Constructor for objects of class PhoneBook
     */
    public PhoneBook()
    {
        phonebook = new HashMap<>();
    }
    
    public void enterNumber(String name, String number)
    {
        phonebook.put(name, number);
    }
    
    public String lookUpNumber(String name){
        String number = phonebook.get(name);
        return number;
    }
    
    public boolean containsName(String name){
        return phonebook.containsKey(name);
    }
    
    public void printAllNames(){
        for(String name: phonebook.keySet()){
            System.out.println(name);
        }
    }
}
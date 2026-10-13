import java.util.HashMap;
/**
 * Write a description of class PhoneBook here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PhoneBook
{
    // instance variables - replace the example below with your own
    private HashMap<String, String> phonebook;

    /**
     * Constructor for objects of class PhoneBook
     */
    public PhoneBook()
    {
        // initialise instance variables
        phonebook = new HashMap<>();
    }
    
    public void enterNumber(String name, String number)
    {
        phonebook.put(name, number);
    }
    
    public String lookupNumber(String name){
        String number = phonebook.get(name);
        return number;
    }
}
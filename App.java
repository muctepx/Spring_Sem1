package ru.geekbrain;
import com.google.gson.Gson;


public class App 
{
    public static void main( String[] args )
    {
        /*
        String[] words = {"Hello", "World"};
        String message = Joiner.on(", ").join(words);
        System.out.println(message);
        */

        Person person = new Person("Ivan", "Ivanovich", 30);
        Gson gson = new Gson();

        String json = gson.toJson(person);
        System.out.println(json);
        Person read = gson.fromJson(json, Person.class);
        System.out.println(read);
    }
}

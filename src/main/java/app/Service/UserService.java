package app.Service;

import app.entity.Person;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserService {
    private Map<Integer,Person> data = new HashMap<>();
    public  UserService(){
        this.data.put(1, new Person("Jim"));
        this.data.put(2, new Person("John"));
    }
    public Collection<Person> getAll() {
        return data.values();
    }

    public Person get(int id) {
        return  data.get(id);
    }

    public Person create(String name){
        Person person = new Person(name);
        return data.put(data.size()+1,person);
    }
}

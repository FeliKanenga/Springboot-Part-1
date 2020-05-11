package com.example.demo.Dao;
import com.example.demo.Model.User;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@Repository
public class FakeRepo implements FakeRepoInterface  {


    private static List<User> database = new ArrayList<>();


    @Override
    public void insertUser(long id, String name, String surname) {
        database.add(new User(id, name, surname));
        System.out.println(name + " entered");

    }

    @Override
    public void findUserById(long id) {
        database.get((int) id);

    }

    @Override
    public void deleteUser(long id) {
        database.remove(id);
    }
}

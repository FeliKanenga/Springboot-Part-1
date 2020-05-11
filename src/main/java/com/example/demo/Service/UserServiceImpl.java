package com.example.demo.Service;

import com.example.demo.Dao.FakeRepoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    // FakeRepoInterface
    @Autowired
    private FakeRepoInterface fakeRepoInterface;
    // constructor parameter
    public UserServiceImpl(FakeRepoInterface fakeRepoInterface) {
        this.fakeRepoInterface = fakeRepoInterface;
    }


    @Override
    public void addUser(long id, String name, String surname) {
        fakeRepoInterface.insertUser(id,name,surname);
    }

    @Override
    public void removeUser(long id) {
        fakeRepoInterface.deleteUser(id);

    }

    @Override
    public void getUser(long id) {
        fakeRepoInterface.findUserById(id);
    }
}

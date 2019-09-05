package fakeAPI;

import org.junit.Test;

import java.util.List;

public class ApiTesting {

    // User creation API
    // We use HTTP POST method to achieve this
    // Requirements:
    // 1. url+resource 2. request body
    // Imagine url+resource for this API is
    // "api.test.com/user/create"
    // Request body MUST be as following:
    // user must have name, user must have username
    // user must have password.

    @Test
    public void api1(){
        User u = new User();
        u.name = "James Bond";
        u.username = "jbond";
        u.password = "JB123";
        String response = API.createUser("api.test.com/user/create", u);
        System.out.println(response);
        List<User> eu = API.getUsers("api.test.com/user/all");
        eu.get(0).info();
    }

    @Test
    public void api2(){
        List<User> u = API.getUsers("api.test.com/user/all");
        System.out.println(u.size());
    }

}

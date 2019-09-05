package fakeAPI;

import java.util.ArrayList;
import java.util.List;

public class DB {

    private static List<User> users;

    static {
        users = new ArrayList<>();
    }

    private static String pass = "hello321";

    public static List<User> getUsers(String password) {
        if(password.equals(pass)){
            return users;
        }
        else{
            System.out.println("Database connection failed");
            return null;
        }

    }

    public static void setUsers(List<User> users) {
        DB.users = users;
    }





}

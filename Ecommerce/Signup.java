package com.example.ecommerce;

import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;

import static com.example.ecommerce.Login.toHexString;

public class Signup {
    String name;
    String pass;
    String email;
    String mobile;
    String address;

    public static void customerSignup(String userName, String userMobile, String userEmail, String userPass, String userAddress) throws NoSuchAlgorithmException {
        // insert into customers (name, email, mobile, password) values ('Vipul','vipul@gmail.com','9870928168','mzn');
        String encryptedPassword = toHexString(userPass);
        //System.out.println("This is the encrypted password --> " + encryptedPassword);
        String query = "INSERT INTO customer(name, email, mobile, password, address)values('"+userName+"','"+userEmail+"','"+userMobile+"','"+encryptedPassword+"','"+userAddress+"')";
        DataBaseConnection dbConn = new DataBaseConnection();
        dbConn.insertUpdate(query);
    }
}

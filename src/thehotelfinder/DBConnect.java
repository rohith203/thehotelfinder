/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thehotelfinder;

import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.Iterator;
import org.bson.Document;


/**
 *
 * @author Rohith
 */
public class DBConnect {
    private MongoClient mongoClient;
    private MongoDatabase database;

    public DBConnect(){
            mongoClient = new MongoClient("localhost", 27017);
            System.out.println("Database connection created");
            database = mongoClient.getDatabase("mydb");
            System.out.println("Connected to mydb.");
    }
    
    public boolean addBooking(Hotel h, User u, String checkin, String checkout){
        MongoCollection<Document> collection = database.getCollection("booking");
        
        return true;
    }
    
    public boolean getHotel(String location){
        
        return true;
    }
    
    public boolean registerUser(User u){
        MongoCollection<Document> collection = database.getCollection("users");
        
        FindIterable<Document> iterDoc = collection.find();
        for(Document d: iterDoc){
            if(u.getUsername().equals(d.get("username"))){
                TheHotelFinder.log_reg.showMessage("Username already exists.");
                return false;
            }else if(u.getEmail().equals(d.get("email"))){
                TheHotelFinder.log_reg.showMessage("Email already exists.");
                return false;
            }
        }
        Document document = new Document("name", u.getName())
        //.append("id", u.getId())
        .append("dob", u.getDob())
        .append("street", u.getAddress()[0])
        .append("city", u.getAddress()[1])
        .append("state", u.getAddress()[2])                
        .append("email", u.getEmail())
        .append("username", u.getUsername())
        .append("password", u.getPassword());
        collection.insertOne(document);
        System.out.println("Inserted");
        return true;
    }
    
    public boolean loginUser(String username, String password){
        MongoCollection<Document> collection = database.getCollection("users");
        FindIterable<Document> iterDoc = collection.find(); 
        for(Document d:iterDoc){
            if(username.equals(d.get("username"))){
                if(password.equals(d.get("password"))){
                    TheHotelFinder.curUser = getUser(d);
                    return true;
                }
            }
        }
       
        return false;
    }
    
    public User getUser(Document d){
        String address[] = new String[3];
        address[0] = (String)d.get("street");
        address[1] = (String)d.get("city");
        address[2] = (String)d.get("state");
        User u = new User((String)d.get("name"), (String)d.get("dob"), 
                          address, (String)d.get("email"),
                          (String)d.get("username"),(String)d.get("password"));
        
        return u;
    }
    
    public void closeConnection(){
        mongoClient.close();
        System.out.println("Connection closed.");
    }
}

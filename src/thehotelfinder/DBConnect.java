/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thehotelfinder;

import com.mongodb.MongoClient;
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
    private final MongoClient mongoClient;
    private final MongoDatabase database;

    public DBConnect(){
        mongoClient = new MongoClient("localhost", 27017);
        System.out.println("Database connection created");
        database = mongoClient.getDatabase("mydb");
        System.out.println("Connected to mydb.");
    }
    
    public boolean registerUser(User u){
        MongoCollection<Document> collection = database.getCollection("users");
        
        FindIterable<Document> iterDoc = collection.find();
//        Iterator it = iterDoc.iterator(); 

        for(Document d: iterDoc){
            if(u.getUsername().equals(d.get("username"))){
                TheHotelFinder.log_reg.showMessage("Username already exists.");
                return false;
            }else if(u.getEmail().equals(d.get("email"))){
                TheHotelFinder.log_reg.showMessage("Email already exists.");
                return false;
            }
            //System.out.println(d.get("name"));
        }
        Document document = new Document("name", u.getName())
        .append("id", u.getId())
        .append("dob", u.getDob())
        .append("address", u.getAddress())
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
        int i = 1; 

        Iterator it = iterDoc.iterator(); 
        
        while (it.hasNext()) {  
           System.out.println(it.next()); 
        i++; 
        }
        return true;
    }
    
//    public User getUser(String username, String password){
//        User u = new User();
//        
//        return u;
//    }
    
    public void closeConnection(){
        mongoClient.close();
        System.out.println("Connection closed.");
    }
}

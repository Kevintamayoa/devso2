/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author macbook
 */
public class User {
   public int Id;
   public String Name;
   public String lname;
   public String Password;
   public int Type_Id;
   public String Type;

    public User(String Name, String lname, String Password, int Type_Id) {
        this.Name = Name;
        this.lname = lname;
        this.Password = Password;
        this.Type_Id = Type_Id;
    }

    public User(int Id, String Name, String lname, String Password, int Type_Id) {
        this.Id = Id;
        this.Name = Name;
        this.lname = lname;
        this.Password = Password;
        this.Type_Id = Type_Id;
    }

    public User(int Id, String Name, String lname, String Password, int Type_Id, String Type) {
        this.Id = Id;
        this.Name = Name;
        this.lname = lname;
        this.Password = Password;
        this.Type_Id = Type_Id;
        this.Type = Type;
    }

    
   
   
    
}

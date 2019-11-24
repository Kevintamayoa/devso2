/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Date;

/**
 *
 * @author xchel
 */
public class Project {
    public int Id;
    public String Description;
    public Date Date;
    public String Concept;
    public String  Ubication;
    public String Collabs;
    public int Duration;
    public double Amount;

    public Project(int Id, String Description, Date Date, String Concept, String Ubication, String Collabs, int Duration, double Amount) {
        this.Id = Id;
        this.Description = Description;
        this.Date = Date;
        this.Concept = Concept;
        this.Ubication = Ubication;
        this.Collabs = Collabs;
        this.Duration = Duration;
        this.Amount = Amount;
    }

    public Project(String Description, Date Date, String Concept, String Ubication, String Collabs, int Duration, double Amount) {
        this.Description = Description;
        this.Date = Date;
        this.Concept = Concept;
        this.Ubication = Ubication;
        this.Collabs = Collabs;
        this.Duration = Duration;
        this.Amount = Amount;
    }

   
    
    
    
}

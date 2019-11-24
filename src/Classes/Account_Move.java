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
public class Account_Move {
    public int Id;
    public Date Date;
    public int Out_Id;
    public int In_Id;
    public String Concept;
    public double amount;
    
    public String Out;
    public String In;

    public Account_Move(Date Date, int Out_Id, int In_Id, String Concept, double amount) {
        this.Date = Date;
        this.Out_Id = Out_Id;
        this.In_Id = In_Id;
        this.Concept = Concept;
        this.amount = amount;
    }

    public Account_Move(int Id, Date Date, int Out_Id, int In_Id, String Concept, double amount) {
        this.Id = Id;
        this.Date = Date;
        this.Out_Id = Out_Id;
        this.In_Id = In_Id;
        this.Concept = Concept;
        this.amount = amount;
    }

    public Account_Move(int Id, Date Date, int Out_Id, int In_Id, String Concept, double amount, String Out, String In) {
        this.Id = Id;
        this.Date = Date;
        this.Out_Id = Out_Id;
        this.In_Id = In_Id;
        this.Concept = Concept;
        this.amount = amount;
        this.Out = Out;
        this.In = In;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;
import java.util.*;
/**
 *
 * @author macbook
 */
public class Expense {
    public int Id;
    public Date Date;
    public int Type_Id;
    public int Project_Id;
    public String Concept;
    public int Account_Id;
    public int Bill;
    public String BillNumber;
    public double IVA;
    public double Amount;
    public int User_Id;

    public String Type;
    public String Project;
    public String Account;

    public Expense(Date Date, int Type_Id, int Project_Id, String Concept, int Account_Id, String BillNumber, double IVA, double Amount) {
        this.Date = Date;
        this.Type_Id = Type_Id;
        this.Project_Id = Project_Id;
        this.Concept = Concept;
        this.Account_Id = Account_Id;
        this.BillNumber = BillNumber;
        this.IVA = IVA;
        this.Amount = Amount;
    }

    public Expense(int Id, Date Date, int Type_Id, int Project_Id, String Concept, int Account_Id, int Bill, String BillNumber, double IVA, double Amount, int User_Id) {
        this.Id = Id;
        this.Date = Date;
        this.Type_Id = Type_Id;
        this.Project_Id = Project_Id;
        this.Concept = Concept;
        this.Account_Id = Account_Id;
        this.Bill = Bill;
        this.BillNumber = BillNumber;
        this.IVA = IVA;
        this.Amount = Amount;
        this.User_Id = User_Id;
    }

    public Expense(int Id, Date Date, int Type_Id, int Project_Id, String Concept, int Account_Id, int Bill, String BillNumber, double IVA, double Amount, int User_Id, String Type, String Project, String Account) {
        this.Id = Id;
        this.Date = Date;
        this.Type_Id = Type_Id;
        this.Project_Id = Project_Id;
        this.Concept = Concept;
        this.Account_Id = Account_Id;
        this.Bill = Bill;
        this.BillNumber = BillNumber;
        this.IVA = IVA;
        this.Amount = Amount;
        this.User_Id = User_Id;
        this.Type = Type;
        this.Project = Project;
        this.Account = Account;
    }
    
   
    
}

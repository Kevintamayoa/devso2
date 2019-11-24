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
public class Expense_Type {
    public int Id;
    public String Description;
    public int Category_Id;
    public double Ppt;
    public String Category;

    public Expense_Type(String Description, int Category_Id, double Ppt) {
        this.Description = Description;
        this.Category_Id = Category_Id;
        this.Ppt = Ppt;
    }

    public Expense_Type(int Id, String Description, int Category_Id, double Ppt) {
        this.Id = Id;
        this.Description = Description;
        this.Category_Id = Category_Id;
        this.Ppt = Ppt;
    }
    
    

    public Expense_Type(int Id, String Description, int Category_Id, double Ppt, String Category) {
        this.Id = Id;
        this.Description = Description;
        this.Category_Id = Category_Id;
        this.Ppt = Ppt;
        this.Category = Category;
    }

    
    
}

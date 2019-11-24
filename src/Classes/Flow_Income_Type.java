/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author xchel
 */
public class Flow_Income_Type {
    public int Id;
    public String Description;
    public int Category_Id;
    public String Category;

    public Flow_Income_Type(String Description, int Category_Id) {
        this.Description = Description;
        this.Category_Id = Category_Id;
    }

    public Flow_Income_Type(int Id, String Description, int Category_Id) {
        this.Id = Id;
        this.Description = Description;
        this.Category_Id = Category_Id;
    }

    public Flow_Income_Type(int Id, String Description, int Category_Id, String Category) {
        this.Id = Id;
        this.Description = Description;
        this.Category_Id = Category_Id;
        this.Category = Category;
    }
    
    
}

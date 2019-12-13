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
public class Project_Flow_Expense_Container {
    public int Id;
    public int Type_Id;
    public int Project_Id;
    public String Type;
    public String Project;

    public Project_Flow_Expense_Container(int Type_Id, int Project_Id) {
        this.Type_Id = Type_Id;
        this.Project_Id = Project_Id;
    }

    public Project_Flow_Expense_Container(int Id, int Type_Id, int Project_Id) {
        this.Id = Id;
        this.Type_Id = Type_Id;
        this.Project_Id = Project_Id;
    }

    public Project_Flow_Expense_Container(int Id, int Type_Id, int Project_Id, String Type, String Project) {
        this.Id = Id;
        this.Type_Id = Type_Id;
        this.Project_Id = Project_Id;
        this.Type = Type;
        this.Project = Project;
    }
    
    
}

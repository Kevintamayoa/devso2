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
public class Project_Flow_Income_Container {
    public int Id;
    public int Type_Id;
    public int Project_Id;
    public String Project;
    public String Type;

    public Project_Flow_Income_Container(int Type_Id, int Project_Id) {
        this.Type_Id = Type_Id;
        this.Project_Id = Project_Id;
    }

    public Project_Flow_Income_Container(int Id, int Type_Id, int Project_Id) {
        this.Id = Id;
        this.Type_Id = Type_Id;
        this.Project_Id = Project_Id;
    }

    public Project_Flow_Income_Container(int Id, int Type_Id, int Project_Id, String Project, String Type) {
        this.Id = Id;
        this.Type_Id = Type_Id;
        this.Project_Id = Project_Id;
        this.Project = Project;
        this.Type = Type;
    }
    
    
}

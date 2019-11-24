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
public class project_personal {
    public int Id;
    public int Project_Id;
    public int Type_Id;
    public String Type;
    public String Project;

    public project_personal(int Project_Id, int Type_Id) {
        this.Project_Id = Project_Id;
        this.Type_Id = Type_Id;
    }

    public project_personal(int Id, int Project_Id, int Type_Id) {
        this.Id = Id;
        this.Project_Id = Project_Id;
        this.Type_Id = Type_Id;
    }
    
    

    public project_personal(int Id, int Project_Id, int Type_Id, String Type, String Project) {
        this.Id = Id;
        this.Project_Id = Project_Id;
        this.Type_Id = Type_Id;
        this.Type = Type;
        this.Project = Project;
    }
    
    
}

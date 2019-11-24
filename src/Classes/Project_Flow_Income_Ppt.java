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
public class Project_Flow_Income_Ppt {
    public int Id;
    public int Type_Id;
    public int Month;
    public int Project_Id;
    public int Ppt_Initial;
    public int Ppt_Final;
    
    public String Type;
    public String Project;

    public Project_Flow_Income_Ppt(int Type_Id, int Month, int Project_Id, int Ppt_Initial, int Ppt_Final) {
        this.Type_Id = Type_Id;
        this.Month = Month;
        this.Project_Id = Project_Id;
        this.Ppt_Initial = Ppt_Initial;
        this.Ppt_Final = Ppt_Final;
    }

    public Project_Flow_Income_Ppt(int Id, int Type_Id, int Month, int Project_Id, int Ppt_Initial, int Ppt_Final) {
        this.Id = Id;
        this.Type_Id = Type_Id;
        this.Month = Month;
        this.Project_Id = Project_Id;
        this.Ppt_Initial = Ppt_Initial;
        this.Ppt_Final = Ppt_Final;
    }

    public Project_Flow_Income_Ppt(int Id, int Type_Id, int Month, int Project_Id, int Ppt_Initial, int Ppt_Final, String Type, String Project) {
        this.Id = Id;
        this.Type_Id = Type_Id;
        this.Month = Month;
        this.Project_Id = Project_Id;
        this.Ppt_Initial = Ppt_Initial;
        this.Ppt_Final = Ppt_Final;
        this.Type = Type;
        this.Project = Project;
    }
    
    
}

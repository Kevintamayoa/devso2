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
public class Project_Credit {
    public int Id;
    public String Description;
    public int Project_Id;
    public double Amount;
    public double Performance;
    public double Annual_Rate;
    
    public String Project;

    public Project_Credit(String Description, int Project_Id, double Amount, double Performance, double Annual_Rate) {
        this.Description = Description;
        this.Project_Id = Project_Id;
        this.Amount = Amount;
        this.Performance = Performance;
        this.Annual_Rate = Annual_Rate;
    }

    public Project_Credit(int Id, String Description, int Project_Id, double Amount, double Performance, double Annual_Rate) {
        this.Id = Id;
        this.Description = Description;
        this.Project_Id = Project_Id;
        this.Amount = Amount;
        this.Performance = Performance;
        this.Annual_Rate = Annual_Rate;
    }

    public Project_Credit(int Id, String Description, int Project_Id, double Amount, double Performance, double Annual_Rate, String Project) {
        this.Id = Id;
        this.Description = Description;
        this.Project_Id = Project_Id;
        this.Amount = Amount;
        this.Performance = Performance;
        this.Annual_Rate = Annual_Rate;
        this.Project = Project;
    }
    
    
    
}

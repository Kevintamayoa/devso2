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
public class Project_Investment {
    public int Id;
    public int Project_Id;
    public String Investor_Id;
    public double Performance;
    public double Amount;
    
    public String Project;
    public String Investor;

    public Project_Investment(int Project_Id, String Investor_Id, double Performance, double Amount) {
        this.Project_Id = Project_Id;
        this.Investor_Id = Investor_Id;
        this.Performance = Performance;
        this.Amount = Amount;
    }

    public Project_Investment(int Id, int Project_Id, String Investor_Id, double Performance, double Amount) {
        this.Id = Id;
        this.Project_Id = Project_Id;
        this.Investor_Id = Investor_Id;
        this.Performance = Performance;
        this.Amount = Amount;
    }

    public Project_Investment(int Id, int Project_Id, String Investor_Id, double Performance, double Amount, String Project, String Investor) {
        this.Id = Id;
        this.Project_Id = Project_Id;
        this.Investor_Id = Investor_Id;
        this.Performance = Performance;
        this.Amount = Amount;
        this.Project = Project;
        this.Investor = Investor;
    }
    
    
}

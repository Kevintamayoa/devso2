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
public class Project_Zone_Container {
    public int Id;
    public int Project_Id;
    public int Catalog_Id;
    
    public String Project;
    public String Catalog;

    public Project_Zone_Container(int Project_Id, int Catalog_Id) {
        this.Project_Id = Project_Id;
        this.Catalog_Id = Catalog_Id;
    }

    public Project_Zone_Container(int Id, int Project_Id, int Catalog_Id) {
        this.Id = Id;
        this.Project_Id = Project_Id;
        this.Catalog_Id = Catalog_Id;
    }

    public Project_Zone_Container(int Id, int Project_Id, int Catalog_Id, String Project, String Catalog) {
        this.Id = Id;
        this.Project_Id = Project_Id;
        this.Catalog_Id = Catalog_Id;
        this.Project = Project;
        this.Catalog = Catalog;
    }
    
    
}

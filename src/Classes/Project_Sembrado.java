/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Date;

/**
 *
 * @author xchel
 */
public class Project_Sembrado {
    public int Id;
    public int Project_Id;
    public int Cliente_Id;
    public int Zone_Id;
    public int Lote_Id;
    public int Etapa_Id;
    public int Num;
    public String Nomenclatura;
    public double M2;
    public double Cost;
    public double Anticipo;
    public double Mensualidad;
    public double Saldo;
    public int Duration;
    public double Amount;
    public Date Date;
    
    public String Project;
    public String Cliente;
    public String Zone;
    public String Lote;
    public String Etapa;

    public Project_Sembrado(int Project_Id, int Cliente_Id, int Zone_Id, int Lote_Id, int Etapa_Id, int Num, String Nomenclatura, double M2, double Cost, double Anticipo, double Mensualidad, double Saldo, int Duration, double Amount, Date date) {
        this.Project_Id = Project_Id;
        this.Cliente_Id = Cliente_Id;
        this.Zone_Id = Zone_Id;
        this.Lote_Id = Lote_Id;
        this.Etapa_Id = Etapa_Id;
        this.Num = Num;
        this.Nomenclatura = Nomenclatura;
        this.M2 = M2;
        this.Cost = Cost;
        this.Anticipo = Anticipo;
        this.Mensualidad = Mensualidad;
        this.Saldo = Saldo;
        this.Duration = Duration;
        this.Amount = Amount;
        this.Date = Date;
    }

    public Project_Sembrado(int Id, int Project_Id, int Cliente_Id, int Zone_Id, int Lote_Id, int Etapa_Id, int Num, String Nomenclatura, double M2, double Cost, double Anticipo, double Mensualidad, double Saldo, int Duration, double Amount) {
        this.Id = Id;
        this.Project_Id = Project_Id;
        this.Cliente_Id = Cliente_Id;
        this.Zone_Id = Zone_Id;
        this.Lote_Id = Lote_Id;
        this.Etapa_Id = Etapa_Id;
        this.Num = Num;
        this.Nomenclatura = Nomenclatura;
        this.M2 = M2;
        this.Cost = Cost;
        this.Anticipo = Anticipo;
        this.Mensualidad = Mensualidad;
        this.Saldo = Saldo;
        this.Duration = Duration;
        this.Amount = Amount;
        this.Date = Date;
    }

    public Project_Sembrado(int Id, int Project_Id, int Cliente_Id, int Zone_Id, int Lote_Id, int Etapa_Id, int Num, String Nomenclatura, double M2, double Cost, double Anticipo, double Mensualidad, double Saldo, int Duration, double Amount, String Project, String Cliente, String Zone, String Lote, String Etapa) {
        this.Id = Id;
        this.Project_Id = Project_Id;
        this.Cliente_Id = Cliente_Id;
        this.Zone_Id = Zone_Id;
        this.Lote_Id = Lote_Id;
        this.Etapa_Id = Etapa_Id;
        this.Num = Num;
        this.Nomenclatura = Nomenclatura;
        this.M2 = M2;
        this.Cost = Cost;
        this.Anticipo = Anticipo;
        this.Mensualidad = Mensualidad;
        this.Saldo = Saldo;
        this.Duration = Duration;
        this.Amount = Amount;
        this.Project = Project;
        this.Cliente = Cliente;
        this.Zone = Zone;
        this.Lote = Lote;
        this.Etapa = Etapa;
        this.Date = Date;
    }
    
    
    
}

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
public class Financial_Catalog {
    public int Id;
    public String Description;
    public int Month;
    public double mensualdiad;
    public double Anticipo;
    public double Saldo;
    public double Descuento;

    public Financial_Catalog(int Id, String Description, int Month, double mensualdiad, double Anticipo, double Saldo, double Descuento) {
        this.Id = Id;
        this.Description = Description;
        this.Month = Month;
        this.mensualdiad = mensualdiad;
        this.Anticipo = Anticipo;
        this.Saldo = Saldo;
        this.Descuento = Descuento;
    }

    public Financial_Catalog(String Description, int Month, double mensualdiad, double Anticipo, double Saldo, double Descuento) {
        this.Description = Description;
        this.Month = Month;
        this.mensualdiad = mensualdiad;
        this.Anticipo = Anticipo;
        this.Saldo = Saldo;
        this.Descuento = Descuento;
    }
    
    
}

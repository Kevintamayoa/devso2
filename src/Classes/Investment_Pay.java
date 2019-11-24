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
public class Investment_Pay {
    public int Id;
    public int Inv_Id;
    public int In_eg;
    public int Aux_id;
    
    public String Inv;
    public String Aux;

    public Investment_Pay(int Inv_Id, int In_eg, int Aux_id) {
        this.Inv_Id = Inv_Id;
        this.In_eg = In_eg;
        this.Aux_id = Aux_id;
    }

    public Investment_Pay(int Id, int Inv_Id, int In_eg, int Aux_id) {
        this.Id = Id;
        this.Inv_Id = Inv_Id;
        this.In_eg = In_eg;
        this.Aux_id = Aux_id;
    }

    public Investment_Pay(int Id, int Inv_Id, int In_eg, int Aux_id, String Inv, String Aux) {
        this.Id = Id;
        this.Inv_Id = Inv_Id;
        this.In_eg = In_eg;
        this.Aux_id = Aux_id;
        this.Inv = Inv;
        this.Aux = Aux;
    }
    
    
}

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
public class Investor {
    public int Id;
    public String Description;
    public String Email;
    public String Phone;
    public String Reference;

    public Investor(int Id, String Description, String Email, String Phone, String Reference) {
        this.Id = Id;
        this.Description = Description;
        this.Email = Email;
        this.Phone = Phone;
        this.Reference = Reference;
    }
    
    
}

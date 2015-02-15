/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package appagendat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Joao
 */
public class Contato extends ContatoBasico
{
    protected Calendar dataNascimento;     
     public Contato(String nome,Calendar dataNascimento)
     {
         super(nome);
         this.dataNascimento= dataNascimento;
     }
     @Override
     public String getDados()
     {
         return super.getDados()+"Nascido em"+
            dataNascimento.get(Calendar.DATE)+"/"+
            dataNascimento.get(Calendar.MONTH)+"/"+
            dataNascimento.get(Calendar.YEAR)+"\nIdade:";
     }
     
     public int getIdade(){
         Calendar hoje = new GregorianCalendar();
         int idade = hoje.get(Calendar.YEAR)-dataNascimento.get(Calendar.YEAR);
         hoje.set(Calendar.YEAR,dataNascimento.get(Calendar.YEAR));
            if (hoje.before(dataNascimento)) 
                idade--;
                return idade;
            
     }     
}

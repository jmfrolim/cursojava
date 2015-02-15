/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package appagendat;
import java.util.Calendar;

/**
 *
 * @author Joao
 */
public class EContato extends Contato {
        protected String email,site;
        
        public EContato(String nome, Calendar dataNascimento, String email, String st)
        {
            super(nome, dataNascimento);
            this.email=email;
            site=st;
        }
        
        @Override
        public String getDados(){
            return super.getDados()+"email: "+email+"\nsite: "+site+"\nIdade: ";
        }
        
        public String getEmail(){
            return email;
        }
        
        public String getSite(){
            return site;
        }
}

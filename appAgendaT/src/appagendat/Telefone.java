/*
 * Classe Telefone com campos nome e telefone ambos são do tipo string e de visibilidade
 * private.
 *Com contrutor Telefone(string numero, string tipo) responsavel por criar novos objetos
 * E o metodo get que retornara os valores
 */

package appagendat;

/**
 *
 * @author Joao
 */
public class Telefone {
    private String numero;
    private String tipo;
    
    public Telefone(String numero, String tipo)
    {
        this.numero = numero;
        this.tipo=tipo;
    }
    
    public String getTelefone()
    {
        return numero+""+tipo;  
    }
} 

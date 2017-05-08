/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso4.capitulo17.exercicio2;

/**
 *
 * @author Marcos.Gomes
 */
public class Processador {

    public static void main(String[] args) {

        String [] nomes= {"Marcos","Gomes"};
        
        Mensagem msg = new Mensagem();
        MensagemAbutua msgAbutua = new MensagemAbutua();
        
        marketing(nomes, msg);
        marketing(nomes, msgAbutua);

    }

    public static void marketing(String[] destinatarios, Mensagem mensagem) {

        for (int i = 0; i < destinatarios.length; i++) {
            mensagem.setDestinatario(destinatarios[i]);
            mensagem.getMensagem();            
            System.out.println(mensagem.getMensagem()); 
            
        }

    }
}

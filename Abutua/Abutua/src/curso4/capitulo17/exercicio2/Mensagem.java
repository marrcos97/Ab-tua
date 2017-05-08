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
public class Mensagem {
    
    private String destinatario = "ninguem";
    private String mensagem = "<nome> seja bem vindo.";
    
    protected String processaMensagem(){
        String msg = "";
        msg = mensagem.replace("<nome>", getDestinatario());
        return msg;
    }

    /**
     * @return the destinatario
     */
    public String getDestinatario() {
        return destinatario;
    }

    /**
     * @param destinatario the destinatario to set
     */
    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    /**
     * @return the mensagem
     */
    public String getMensagem() {
        return processaMensagem();
    }

    /**
     * @param mensagem the mensagem to set
     */
    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}

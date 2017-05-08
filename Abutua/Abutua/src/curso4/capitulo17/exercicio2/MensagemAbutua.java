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
public class MensagemAbutua extends Mensagem {

    public MensagemAbutua() {
        setMensagem("<tratamento><nome>, seja bem vindo(a). Cordialmente, Abutua.");
    }

    @Override
    protected String processaMensagem() {
        String msg = super.processaMensagem();
        return msg.replace("<tratamento>", "Caro(a) ");
    }
}

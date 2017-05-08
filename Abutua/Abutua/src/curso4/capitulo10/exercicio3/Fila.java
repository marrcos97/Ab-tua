/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso4.capitulo10.exercicio3;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Marcos.Gomes
 */
public class Fila {

    

    private List pessoasSemPreferencia = new ArrayList();
    private List pessoasComPreferencia = new ArrayList();
    private int anterior = 5;

    public void addPessoa(int idade) {
        
        
        if (idade > 15) {
            

            if (idade >= 60 || (anterior >= 0 && anterior <= 4)) {
                pessoasComPreferencia.add(idade);
            } else {
                pessoasSemPreferencia.add(idade);
            }

        }
        anterior = idade;
    }

    public List getPessoasSemPreferencia() {
        return pessoasSemPreferencia;
    }

    public List getPessoasComPreferencia() {
        return pessoasComPreferencia;
    }

    public List getFila() {
        //Crie um ArrayList no método getFila() para retornar todos as pessoas.
        //Utilize o método addAll para preencher o ArrayList de retorno do método getFila().
        ArrayList todasPessoas = new ArrayList();
        todasPessoas.addAll(pessoasComPreferencia);
        todasPessoas.addAll(pessoasSemPreferencia);

        return todasPessoas;
    }

}

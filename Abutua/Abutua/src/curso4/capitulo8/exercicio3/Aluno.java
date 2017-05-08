/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso4.capitulo8.exercicio3;

/**
 *
 * @author marcos.gomes
 */
public class Aluno {

    private int matricula;
    private String nome;
    private double notaProva1;
    private double notaProva2;
    private double notaTrabalho1;
    private double notaTrabalho2;

    public Aluno() {
    }

    public Aluno(int matricula) {
        this.matricula = matricula;
    }

    public Aluno(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    /**
     * @return the matricula
     */
    public int getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the notaProva1
     */
    public double getNotaProva1() {
        return notaProva1;
    }

    /**
     * @param notaProva1 the notaProva1 to set
     */
    public void setNotaProva1(double notaProva1) {
        this.notaProva1 = notaProva1;
    }

    /**
     * @return the notaProva2
     */
    public double getNotaProva2() {
        return notaProva2;
    }

    /**
     * @param notaProva2 the notaProva2 to set
     */
    public void setNotaProva2(double notaProva2) {
        this.notaProva2 = notaProva2;
    }

    /**
     * @return the notaTrabalho1
     */
    public double getNotaTrabalho1() {
        return notaTrabalho1;
    }

    /**
     * @param notaTrabalho1 the notaTrabalho1 to set
     */
    public void setNotaTrabalho1(double notaTrabalho1) {
        this.notaTrabalho1 = notaTrabalho1;
    }

    /**
     * @return the notaTrabalho2
     */
    public double getNotaTrabalho2() {
        return notaTrabalho2;
    }

    /**
     * @param notaTrabalho2 the notaTrabalho2 to set
     */
    public void setNotaTrabalho2(double notaTrabalho2) {
        this.notaTrabalho2 = notaTrabalho2;
    }

    public double getMediaTrabalhos() {
        return (getNotaTrabalho1() * 4 + getNotaTrabalho2() * 6) / 10;
    }

    public double getMediaProvas() {
        return (((getNotaProva1() / 3) * 1) + ((getNotaProva2() / 3) * 2));
    }

    public double getMediaFinal() {

        double mediaFinal = 0;
        mediaFinal = ((getMediaProvas() * 7.5) + (getMediaTrabalhos() * 2.5)) / 10;

        double decimal = mediaFinal - (int) mediaFinal;

        if (decimal >= 0.01 && decimal <= 0.24) {
            mediaFinal = mediaFinal - decimal;
            decimal = 0.25;
            mediaFinal = mediaFinal + decimal;
        }
        if (decimal >= 0.26 && decimal <= 0.49) {
            mediaFinal = mediaFinal - decimal;
            decimal = 0.5;
            mediaFinal = mediaFinal + decimal;
        }
        if (decimal >= 0.51 && decimal <= 0.74) {
            mediaFinal = mediaFinal - decimal;
            decimal = 0.75;
            mediaFinal = mediaFinal + decimal;
        }
        if (decimal >= 0.76 && decimal < 1) {
            mediaFinal = mediaFinal - decimal;
            decimal = 1.0;
            mediaFinal = mediaFinal + decimal;
        }

        return mediaFinal;
    }

    public String getResultadoFinal() {

        if (getMediaFinal() >= 0 && getMediaFinal() < 4) 
            return "Reprovado";
         else if (getMediaFinal() >= 4 && getMediaFinal() < 7) 
            return "Recuperação";
            else if (getMediaFinal() >= 7 && getMediaFinal() < 9.5) 
                return "Aprovado";
                    else if (getMediaFinal() >= 9 && getMediaFinal() <= 10) 
                        return "Aprovado com Louvor";
        return "";

    }

    public String toString() {
        
        return "Matricula: "+matricula +" Nome: "+nome + " Media Final:" +getMediaFinal() + " Resultado Final: " +getResultadoFinal();

    }
}

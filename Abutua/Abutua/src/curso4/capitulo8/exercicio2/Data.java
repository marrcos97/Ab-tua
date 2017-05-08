/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso4.capitulo8.exercicio2;

/**
 *
 * @author Marcos.Gomes
 */
public class Data {
    private int dia = 1;
    private int mes = 1;
    private int ano = 1900;

    
    public boolean isValidDate(int dia, int mes, int ano) {
        if ((dia > 0 && dia <= 31) && (mes > 0 && mes <= 12) && (ano > 0)) {
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * @return the dia
     */
    public int getDia() {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(int dia) {
        this.dia = dia;
    }

    /**
     * @return the mes
     */
    public int getMes() {
        return mes;
    }

    /**
     * @param mes the mes to set
     */
    public void setMes(int mes) {
        this.mes = mes;
    }

    /**
     * @return the ano
     */
    public int getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public void setData(int dia, int mes, int ano) {
        if (isValidDate(dia, mes, ano) == true) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }

    }
}

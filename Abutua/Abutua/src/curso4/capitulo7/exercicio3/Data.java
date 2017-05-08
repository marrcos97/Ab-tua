/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso4.capitulo7.exercicio3;

/**
 *
 * @author Marcos.Gomes
 */
public class Data {

    public static void main(String[] args) {
        Data data = new Data(11, 11, 9000);
        System.out.println(data.getDiaSemana());
        System.out.println(data.getDataExtenso());
    }

    private int dia = 1;
    private int mes = 1;
    private int ano = 1900;

    public Data(int dia, int mes, int ano) {
        if (isValidDate(dia, mes, ano) == true) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }
    }

    public boolean isValidDate(int dia, int mes, int ano) {
        if ((dia > 0 && dia <= 31) && (mes > 0 && mes <= 12) && (ano > 0)) {
            return true;
        } else {
            return false;
        }
    }

    public String getDiaSemana() {

        int a = ((12 - mes) / 10);
        int b = ano - a;
        int c = mes + (12 * a);
        int d = b / 100;
        int e = d / 4;
        int f = 2 - d + e;
        int g = (int) (365.25 * b);
        int h = (int) (30.6001 * (c + 1));
        int i = (int) ((f + g) + (h + dia) + 5);
        int j = (int) (i % 7);
        switch (j) {
            case 0:
                return "Sábado";
            case 1:
                return "Domingo";
            case 2:
                return "Segunda-Feira";
            case 3:
                return "Terça-Feira";
            case 4:
                return "Quarta-Feira";
            case 5:
                return "Quinta-Feira";
            case 6:
                return "Sexta-Feira";

        }
        return "Segunda-Feira";

    }

    public String getDataExtenso() {

        if ((dia > 0 && dia <= 31) && (mes > 0 && mes <= 12) && (ano > 1900 && ano < 9999)) {

            String dias[] = {" ", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove"};
            String retorno = "";

            if (dia < 10) {
                retorno = dias[dia];
            } else if (dia < 20) {
                retorno = new String[]{
                    "dez", "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove"
                }[dia - 10];
            } else if (dia < 30) {
                if (dia == 20) {
                    retorno = "vinte";
                } else {
                    retorno = "vinte e " + dias[dia - 20];
                }
            } else {
                if (dia == 30) {
                    retorno = "trinta";
                } else {
                    retorno = "trinta e " + dias[dia - 30];
                }

            }
            String txtDia = retorno.substring(0, 1).toUpperCase() + retorno.substring(1);

            String txtMes = "";
            switch (mes) {

                case 1: {
                    txtMes = "Janeiro";
                    break;
                }
                case 2: {
                    txtMes = "Fevereiro";
                    break;
                }
                case 3: {
                    txtMes = "Março";
                    break;
                }
                case 4: {
                    txtMes = "Abril";
                    break;
                }
                case 5: {
                    txtMes = "Maio";
                    break;
                }
                case 6: {
                    txtMes = "Junho";
                    break;
                }
                case 7: {
                    txtMes = "Julho";
                    break;
                }
                case 8: {
                    txtMes = "Agosto";
                    break;
                }
                case 9: {
                    txtMes = "Setembro";
                    break;
                }
                case 10: {
                    txtMes = "Outubro";
                    break;
                }
                case 11: {
                    txtMes = "Novembro";
                    break;
                }
                case 12: {
                    txtMes = "Dezembro";
                    break;
                }

            }

            return txtDia + " de " + txtMes + " de ";
        }

        String[] unidades = {"Um", "Dois", "Três", "Quatro", "Cinco", "Seis", "Sete", "Oito", "Nove"};
        String[] Dezenas = {"Dez", "Onze", "Doze", "Treze", "Quatorze", "Quinze", "Dezesseis", "Dezessete", "Dezoito", "Dezenove", "Vinte", "Trinta", "Quarenta", "Cinquenta", "Sessenta", "Setenta", "Oitenta", "Noventa"};
        String[] Centenas = {"Cento", "Cem", "Duzentos", "Trezentos", "Quatrocentos", "Quinhentos", "Seiscentos", "Setecentos", "Oitocentos", "Novecentos"};
        return "";
    }

    public boolean isAnoBissexto(int ano) {
        if (ano % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void setDia(int dia) {
        if (isValidDate(dia, mes, ano) == true) {
            this.dia = dia;
        }

    }

    public void setMes(int mes) {
        if (isValidDate(dia, mes, ano) == true) {
            this.mes = mes;
        }
    }

    public void setAno(int ano) {
        if (isValidDate(dia, mes, ano) == true) {

            this.ano = ano;
        }
    }

    public void setData(int dia, int mes, int ano) {
        if (isValidDate(dia, mes, ano) == true) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }

    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso4.capitulo8.exercicio1;

/**
 *
 * @author marcos.gomes
 */
public class Relogio {

    private int horas = 0;
    private int minutos = 0;
    private int segundos = 0;

    public static void main(String[] args) {
        Relogio relogio = new Relogio(0, 0, 0);
        /* relogio.somarSegundos(0);
        relogio.somarMinutos(30);
        relogio.somarHoras(0);
        //relogio.somarRelogio(relogio);

        System.out.println(relogio.compararRelogio(relogio));*/
        System.out.println(relogio.toString());

        relogio.somarRelogio("02:02:02");
        
                System.out.println(relogio.toString());
        

    }

    public Relogio(int horas, int minutos, int segundos) {
        somarHoras(horas);
        somarMinutos(minutos);
        somarSegundos(segundos);

    }

    public Relogio(int horas, int minutos) {
        somarHoras(horas);
        somarMinutos(minutos);

    }

    public Relogio() {

    }

    public void somarMinutos(int minutos) {
        if (minutos > 0) {
            if ((this.minutos + minutos) > 59) {
                this.horas = this.horas + ((this.minutos + minutos) / 60);
                this.minutos = (this.minutos + minutos) % 60;

            } else {
                this.minutos = this.minutos + minutos;
            }
        }
    }

    public void somarSegundos(int segundos) {
        if (segundos > 0) {
            if ((this.segundos + segundos) > 59) {
                somarMinutos((this.segundos + segundos) / 60);
                this.segundos = (this.segundos + segundos) % 60;

            } else {
                this.segundos = this.segundos + segundos;
            }
        }
    }

    public void somarHoras(int horas) {
        if (horas > 0) {
            this.horas = this.horas + horas;
        }

    }

    public void somarRelogio(Relogio relogio) {
        somarHoras(relogio.horas);
        somarMinutos(relogio.minutos);
        somarSegundos(relogio.segundos);

    }

    public void somarRelogio(int horas, int minutos, int segundos) {
        somarHoras(horas);
        somarMinutos(minutos);
        somarSegundos(segundos);

    }

    public void somarRelogio(int horas, int minutos) {
        somarHoras(horas);
        somarMinutos(minutos);
    }

    public void somarRelogio(String hora) {
        //Falha:  O método public boolean somarRelogio(String) falhou para o caso: 01:01:01.
        int h;
        int m;
        int s;
        String[] time = hora.split(":");
        if(time.length  == 3){
        h = Integer.parseInt(time[0]);
        m = Integer.parseInt(time[1]);
        s = Integer.parseInt(time[2]);
    
        somarRelogio(h, m, s);
        }
    }

    public boolean compararRelogio(Relogio r1) {
        if ((this.horas == r1.horas) && (this.minutos == r1.minutos) && (this.segundos == r1.segundos)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean compararRelogio(int horas, int minutos, int segundos) {

        if ((this.horas == horas) && (this.minutos == minutos) && (this.segundos == segundos)) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        String saida = "";
        if (horas <= 9) {
            saida += "0" + horas;
        } else {
            saida += horas;
        }
        if (minutos <= 9) {
            saida += ":0" + minutos;
        } else {
            saida += ":" + minutos;
        }
        if (segundos <= 9) {
            saida += ":" + "0" + segundos;
        } else {
            saida += ":" + segundos;
        }

        return saida;
    }

    public int getHoras() {
        return horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }

}

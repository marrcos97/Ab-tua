/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso4.capitulo19.exercicio2;

/**
 *
 * @author Marcos.Gomes
 */
public class CambioApp {

    public static void main(String[] args) {

        CambioImpl cam = new CambioImpl();
        CambioTracaoImpl camImpl = new CambioTracaoImpl();

        imprimeMarchas(cam);

    }

    public static void imprimeMarchas(Cambio cambio) {

        if (cambio instanceof CambioTracao) {
            ((CambioTracao) cambio).setTracao4x4(true);
        }

        for (int i = 0; i < cambio.getMarchas().length; i++) {

            cambio.setMarcha(cambio.getMarchas()[i]);
            System.out.println(cambio.getMarcha());
        }

    }
}

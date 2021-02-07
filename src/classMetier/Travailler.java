/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classMetier;

/**
 *
 * @author noasillam
 */
public class Travailler {
     private Employe unEmploye;
        private int tempsPasse;

        public Travailler(Employe unEmploye, int unTemps)
        {
            this.unEmploye = unEmploye;
            tempsPasse = unTemps;
        }

        public Employe getUnEmploye() {
            return unEmploye;
        }

        public int getTempsPasse() {
            return tempsPasse;
        }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classMetier;

import java.util.ArrayList;

/**
 *
 * @author noasillam
 */
public class Rayon {
     private int idRayon;
        private String nomRayon;
        private ArrayList<Travailler> lesTravailler;

        public Rayon(int unId, String unNom)
        {
            idRayon = unId;
            nomRayon = unNom;
            lesTravailler = new ArrayList<Travailler>();
        }

        public int getIdRayon() {
            return idRayon;
        }

        public String getNomRayon() {
            return nomRayon;
        }

        public ArrayList<Travailler> getLesTravailler() {
            return lesTravailler;
        }
    
}

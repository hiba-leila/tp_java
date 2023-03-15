package model;

import lombok.*;

import java.util.List;

@Data @AllArgsConstructor @NoArgsConstructor
public class Etudiant {
    private Long hiba_id;
    private String nom ;
    private List<Double> note ;


    @Override
    public String toString(){
        var etudiantStr = "==================================================================== \n";
        etudiantStr+= "=> Crédit n°                  : " +getHiba_id()+ "                        \n";
        etudiantStr+= "=> Nom d etudiant : " + getNom() + "           \n";
        etudiantStr+= "-------------------------------------------------------------------- \n";

      return etudiantStr;


    }
}

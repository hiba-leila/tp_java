package dao;

import model.Etudiant;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import lombok.*;



@Data @AllArgsConstructor


public class EtudiantDao implements IDao<Etudiant, Long> {
    @Override
    public Etudiant trouverParID(Long id) {
        System.out.println("[DAO - DS volatile] trouver le credit n° : " + id);
        return BDEtudiant()
                .stream()
                .filter(credit -> credit.getHiba_id() == id)
                .findFirst()
                .get();
    }
    public static Set<Etudiant> BDEtudiant(){

        return new HashSet<Etudiant>(
                Arrays.asList(
                        new Etudiant(1l,"hiba",Arrays.asList(16.5, 19.0, 20.0, 15.75)),
                        new Etudiant(2l,"leila",Arrays.asList(14.5, 13.75, 18.0, 14.0))

                )
        );
    }

}
package presentation;

import lombok.*;
import metier.CreditMetier;
import metier.ICreditMetier;
import metier.IEtudiantMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Data @AllArgsConstructor @NoArgsConstructor
public class EtudiantControlleur implements IEtudiantControlleur{
    @Autowired
    @Qualifier("metier")
    IEtudiantMetier EtudiantMetier;
    @Override
    public void afficher_Moyenne(Long id) throws Exception {
        var creditAvecMensualite = EtudiantMetier.calculer_Moyenne(id);
        System.out.println(creditAvecMensualite);
    }
}

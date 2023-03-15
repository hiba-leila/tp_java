package metier;




import dao.IDao;
import lombok.*;
import model.Etudiant;

import java.util.List;


@Data @AllArgsConstructor @NoArgsConstructor
@Service("metier")

public class EtudiantMetier  implements IEtudiantMetier{
    @Autowired
    @Qualifier("dao")
    IDao<Etudiant,Long> EtudiantDao;
    @Override
    public double calculer_Moyenne(Long id) throws Exception{
        var Etudiant = EtudiantDao.trouverParID(id);

        if (Etudiant == null)
        {
            throw new Exception("L'id d etudiant est incorrecte :: [Etudiant non trouve]");
        }
        else {

                List<Double> note = Etudiant.getNote();
                double somme = 0;
                for (Double notes : note) {
                    somme += notes;
                }
                return somme / note.size();

            }
        }

    }



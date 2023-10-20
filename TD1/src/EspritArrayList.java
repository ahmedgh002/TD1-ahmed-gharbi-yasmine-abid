import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EspritArrayList implements University {
    private ArrayList<Etudiant> etudiant = new ArrayList<>();

    @Override
    public void ajouterEtudiant(Etudiant e) {
        etudiant.add(e);
    }

    @Override
    public boolean rechercherEtudiant(Etudiant e) {
        return etudiant.contains(e);
    }
    @Override
    public boolean rechercherEtudiant(String nom) {
        for (int i=0; i<etudiant.size();i++) {
            if (etudiant.get(i).getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }
    @Override
    public boolean rechercherEtudiant(String nom) {
        for (Etudiant e : etudiant) {
            if (e.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void supprimerEtudiant(Etudiant e) {
        etudiant.remove(e);
    }

    @Override
    public void trierEtudiantsParId() {
        Collections.sort(etudiant, new Comparator<Etudiant>() {
            @Override
            public int compare(Etudiant o1, Etudiant o2) {
                return Integer.compare(o1.getId(), o2.getId());
            }
        });
    }

    @Override
    public void trierEtudiantsParNom() {
        Collections.sort(etudiant, new Comparator<Etudiant>() {
            @Override
            public int compare(Etudiant o1, Etudiant o2) {
                return o1.getNom().compareTo(o2.getNom());
            }
        });
    }
}

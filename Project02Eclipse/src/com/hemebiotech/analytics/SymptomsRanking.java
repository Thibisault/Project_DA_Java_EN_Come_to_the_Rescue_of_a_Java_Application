import java.util.ArrayList;
import java.util.TreeMap;

/**
 * Permet de trier les symptômes par ordre alphabétique et les compter.
 */
public class SymptomsRanking implements ISymptomsRanking {

    /**
     * Mise en ordre alphabétique dans un dictionnaire.
     * calcul des ocurences par symptômes depuis initialList.
     * @param initialList liste non classé des symptômes.
     * @return Liste classée alphabétiquement des symptômes avec leur nombre d'occurence.
     */
    public ArrayList<String> rankList(ArrayList<String> initialList) {

        TreeMap<String, Integer> symptoms = new TreeMap<>();
        ArrayList<String> List = new ArrayList<>();

        for (String line : initialList) {
            if (symptoms.containsKey(line)) {
                int linevalue = symptoms.get(line);
                linevalue++;
                symptoms.put(line, linevalue);
            } else {
                symptoms.put(line, 1);
            }
        }
        for (String cle : symptoms.keySet()) {
            List.add(cle + "=" + symptoms.get(cle));
        }
        return List;
    }
}

package com.hemebiotech.analytics;

import java.io.*;
import java.util.ArrayList;

/**
 * Contient la méthode permettant de lire un fichier et de copier son contenu dans une liste.
 * contient la méthode permettant d'ecrire une liste dans un fichier.
 */
public class    ReadSymptomDataFromFile implements ISymptomReader, ISymptomWriter {

    /**
     * Lire chaque ligne d'un fichier pour les mettre dans une liste.
     *
     * @param fileName Fichier lu.
     * @return liste contenant les éléments de fileName.
     * @throws IOException retourne une exeption si fichier n'existe pas ou problème de lecture de ce fichier.
     */
    public ArrayList<String> getResult(String fileName) throws IOException {
        ArrayList<String> result = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line = reader.readLine();
        while (line != null) {
            result.add(line);
            line = reader.readLine();
        }
        reader.close();
        return result;
    }

    /**
     * écrire dans un fichier le contenu d'une liste.
     * @param finalList liste copié dans le fichier par cette méthode.
     * @param fileName fichier cible d'ecriture
     * @throws IOException
     */
    public void writeList(ArrayList<String> finalList, String fileName) throws IOException {

        FileWriter writer = new FileWriter(fileName);
        for (String cle : finalList) {
            writer.write(cle + "\n");
        }
        writer.close();
    }
}

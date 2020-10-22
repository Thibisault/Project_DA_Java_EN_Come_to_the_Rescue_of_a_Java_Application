package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeMap;

/**
 *
 */
public class AnalyticsCounter {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {


        ISymptomReader symptomsReader = new ReadSymptomDataFromFile();
        ISymptomWriter symptomsWriter = new ReadSymptomDataFromFile();
        ISymptomRanking symptomsRanking = new SymptomRanking();
        IShowClass showClass = new SymptomShow();

        try {
            ArrayList<String> initialList = symptomsReader.getResult("symptoms.txt");
            TreeMap<String, Integer> symptoms = symptomsRanking.rankList(initialList);
            ArrayList<String> finalList = showClass.showlist(symptoms);
            symptomsWriter.writeList(finalList, "result.out");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

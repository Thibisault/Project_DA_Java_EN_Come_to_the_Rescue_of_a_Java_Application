package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.ArrayList;

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

        try {
            ArrayList<String> initialList = symptomsReader.getResult("symptoms.txt");
            ArrayList<String> finalList = symptomsRanking.rankList(initialList);
            symptomsWriter.writeList(finalList, "result.out");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

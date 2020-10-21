package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 */
public class SymptomsMain {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {


        ISymptomsReader symptomsReader = new ReadSymptomsDataFromFile();
        ISymptomsWriter symptomsWriter = new ReadSymptomsDataFromFile();
        ISymptomsRanking symptomsRanking = new SymptomsRanking();

        try {
            ArrayList<String> initialList = symptomsReader.getResult("symptoms.txt");
            ArrayList<String> finalList = symptomsRanking.rankList(initialList);
            symptomsWriter.writeList(finalList, "result.out");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

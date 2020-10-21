package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.ArrayList;


/**
 * Interface donnant l'accés à la méthode writeList.
 */
public interface ISymptomWriter {
    public void writeList(ArrayList<String> finalList, String fileName) throws IOException;
}

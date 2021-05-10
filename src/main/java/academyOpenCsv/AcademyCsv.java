package academyOpenCsv;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Una Classe che legge un file csv e lo salva in una lista
 */
public class AcademyCsv {

    /** Il path del file **/
    private String filePath = "/home/jonathancortes/Documenti/csv/";

    /** Il file csv **/
    private String fileName;

    /** Lista dove salviamo il contenuto del csv **/
    protected List<String[]> list;

    /** Lettore del file **/
    FileReader fileReader;

    /** Accelera la lettura del file, leggendo un blocco (array) alla volta,
     *  invece di un char alla volta
     */
    BufferedReader bufferedReader;

    /** Dimensione del buff (default 8 kb) **/
    protected int buffSize = 8192;

    /** Lettore del CSV che utilizza la classe Reader di Java **/
    CSVReader csvReader;


    /** Costruttore privato **/
    private AcademyCsv() {}

    /**
     * Costruttore pubblico di AcademyCsv
     * che initializza la lista, il fileReader, il bufferedReader e il csvReader
     * @param fileName il file csv
     * @throws FileNotFoundException se non trova il file
     */
    public AcademyCsv(String fileName) throws FileNotFoundException {
        this.fileName = fileName;
        list = new ArrayList<>();
        fileReader = new FileReader(filePath + fileName);
        bufferedReader = new BufferedReader(fileReader, buffSize);
        csvReader = new CSVReader(bufferedReader);
    }

    /**
     * Metodo che legge il file CSV e lo salva in una lista
     * @throws IOException se non trova l'input
     * @throws CsvException se non trova il file csv
     */
    public void read() throws IOException, CsvException {
        list = csvReader.readAll();
    }

    /**
     * Metodo che ritorna il valore letto dal file CSV
     * @param i la posizione del valore
     * @return il valore in stringa
     */
    public String get(int i) {
        return Arrays.toString(list.get(i));
    }

}

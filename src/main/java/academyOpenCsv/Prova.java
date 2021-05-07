package academyOpenCsv;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Prova {

    public static void prova(String[] args) throws IOException, CsvException {
        String fileName = "/home/jonathancortes/Documenti/csv/username.csv";
        CSVReader reader = new CSVReader(new FileReader(fileName));
        List<String[]> r = reader.readAll();

        for (String[] x: r) {
            System.out.println(Arrays.toString(x));
        }

        System.out.println(Arrays.toString(r.get(1)));
    }


}

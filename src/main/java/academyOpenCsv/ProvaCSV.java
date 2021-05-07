package academyOpenCsv;

import com.opencsv.exceptions.CsvException;

import java.io.IOException;
import java.util.Arrays;

public class ProvaCSV {

    public static void main(String[] args) throws IOException, CsvException {
        AcademyCsv reader = new AcademyCsv("user.csv");

        reader.read();
        System.out.println(reader.get(2));
        System.out.println();
        for (String[] lista: reader.list) {
            System.out.println(Arrays.toString(lista));
        }
    }
}

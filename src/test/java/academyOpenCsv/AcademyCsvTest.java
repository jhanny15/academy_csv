package academyOpenCsv;

import com.opencsv.exceptions.CsvException;
import org.junit.jupiter.api.Test;


import java.io.FileNotFoundException;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class AcademyCsvTest {

    @Test // 1.) Da correggere
    void fileNotFound() throws IOException, CsvException{
        assertThrows(FileNotFoundException.class, () -> new AcademyCsv("uer.csv"));
    }

    @Test // 2.)
    void outOfBound() throws IOException, CsvException {
        AcademyCsv reader = new AcademyCsv("username.csv");
        reader.read();
        assertThrows(IndexOutOfBoundsException.class, () -> reader.get(10));
    }

    @Test // 3.)
    void get() throws IOException, CsvException {
        AcademyCsv reader = new AcademyCsv("username.csv");
        reader.read();
        reader.read();
        assertThrows(IndexOutOfBoundsException.class, () -> reader.get(0));
    }


}
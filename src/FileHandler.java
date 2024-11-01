import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {

    private final File file = new File ("CovidNoegletalCSV.csv");

    public ArrayList<Covid19Data> loadAllData() {
        ArrayList<Covid19Data> dataList = new ArrayList<>();


        try (Scanner sc = new Scanner(file)){
            while (sc.hasNext()) {
                String line = sc.nextLine();
                String[] attributes = line.split(";");

                if (attributes.length == 7) {
                    Covid19Data data = new Covid19Data(
                            attributes[0],  //Region
                            attributes[1],  //Aldersgruppe
                            Integer.parseInt(attributes[2]),    //Bekræftede tilfælde i alt
                            Integer.parseInt(attributes[3]),    //Døde
                            Integer.parseInt(attributes[4]),    //Indlagte på intensiv afdeling
                            Integer.parseInt(attributes[5]),    //Indlagte
                            attributes[6]    //Dato
                    );

                    dataList.add(data);
                } else {
                    System.out.println("Springer linje over " + line);
                }
            }
        } catch (FileNotFoundException fnfe) {
            throw new RuntimeException(fnfe);
        } catch (NumberFormatException nfe) {
            throw new RuntimeException(nfe);
        }

        return dataList;
    }

}

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FileHandler fh = new FileHandler();

        ArrayList<Covid19Data> dataList = fh.loadAllData();

        for(Covid19Data data : dataList) {
            System.out.println(data);
        }
        }
    }

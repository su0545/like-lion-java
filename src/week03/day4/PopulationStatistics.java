/*
package week03.day4;


import java.io.*;
import java.util.ArrayList;

public class PopulationStatistics{
    public void readByLine(String filename) throws  IOException{
    FileReader fileReader = new FileReader(address);

        BufferedReader reader = new BufferedReader(
                new FileReader("d:\\file.txt")
        );
        String str;
        while ((str = reader.readLine()) != null) {
            System.out.println(str);
        }
        reader.close();
    }

    public PopulationMove parse(String data) {
        return new PopulationMove(11,11);

    }
    public void createAFile(String filename){
        File file = new File(filename);
        try{
            file.createNewFile();
            throw new RuntimeException(e);
        }
    }

    public String fromToString(PopulationMove){
        return populationMove

    }

    public static void main(String[] args) throws IOException {
        String address ="C:\\Users\\asus\\Downloads\\2021_인구관련연간자료_20220927_66125.csv";
        FileReader fileReader = new FileReader(address);
        //파일을 읽지않는다

        String fileContents = "";
        while(fileContents.length() < 1_000_000){
            char c = (char)fileReader.read();
            fileContents += c;
            System.out.println(fileContents);
        }
        System.out.println(fileContents);

        List<String> strings = new ArrayList<>();
        strings.add("11","11");

        //1byte 읽기
        //1즐씩 읽는 기능을 추가하고싶다면?
    }
}
 */
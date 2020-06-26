package program;

import AirlinesData.Activity;
import AirlinesData.Card;
import AirlinesData.PointzAggregatorUsers;
import AirlinesData.User;
import BoardingData.BoardingData;
import FrequentFlyer.model.ForumProfiles;

import javax.xml.parsers.ParserConfigurationException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {

       /* try {
            String s = BoardingData.convertToXML(BoardingData.read("BoardingData.csv"));
            FileOutputStream outputStream = new FileOutputStream("neo.xml");
            outputStream.write(s.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }*/

        /*try {
            FileInputStream fileOutputStream = new FileInputStream("FrequentFlyerForum-Profiles.json");
            byte[] array = new byte[fileOutputStream.available()];
            fileOutputStream.read(array);
            ForumProfiles flight = ForumProfiles.fromJson(array);
            FileOutputStream f = new FileOutputStream("Json.csv");
            f.write(flight.toString().getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        PointzAggregatorUsers testXML = null;
        try {
            //PointzAggregator-AirlinesData.xml
            testXML = PointzAggregatorUsers.parse("testXML.xml");
            FileOutputStream fileOutputStream = new FileOutputStream("XML.csv");
            fileOutputStream.write(testXML.toString().getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

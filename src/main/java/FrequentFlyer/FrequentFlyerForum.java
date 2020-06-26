package FrequentFlyer;

import FrequentFlyer.model.Document;
import FrequentFlyer.model.Flight;
import FrequentFlyer.model.LoyalProgram;
import com.google.gson.annotations.SerializedName;

public class FrequentFlyerForum {
    @SerializedName(value = "Registered_Flights", alternate = "Registered Flights")
    private Flight[] Registered_Flights;
    private String NickName;
    @SerializedName(value = "Tavel", alternate = "Travel Documents")
    private Document[] Travel;
    private String Sex;
    @SerializedName(value = "Loyality_Programm", alternate = "Loyality Programm")
    private LoyalProgram[] Loyality_Programm;
    @SerializedName(value = "RealName", alternate = "Real Name")
    private FrequentFlyer.model.RealName RealName;


    @Override
    public String toString() {
        String s ="";
        for (int i = 0; i < Registered_Flights.length; i++) {
            s+=Registered_Flights[i];
        }
        s+=NickName+"\n";
        for (int i = 0; i < Travel.length; i++) {
            s+=Travel[i];
        }
        s+=Sex;
        for (int i = 0; i < Loyality_Programm.length; i++) {
            s+=Loyality_Programm[i];
        }
        s+=RealName;
        s+="\n";
        s+="------------------------------------------------------------------------------";
        s+="\n";
        return s;
    }
}

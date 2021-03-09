import com.threesixty.ezsafe.Hazard.SmokeDetector;

public class main{
    
public static void mian(String[] args){


SmokeDetector smoke = new SmokeDetector("123",true,"Low",12.1);
smoke.getDeviceID();
System.out.print(smoke.getDeviceID());
    
}



}
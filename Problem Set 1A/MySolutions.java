
/**
 * AP CSA Problem Set 1.1
 * Angela Chen
 * September 12th, 2023
 */
public class MySolutions {

    public void celsiusToFahrenheit() {
        double C, F;
        C = 30.0;
        F = C * 9/5 + 32;
        System.out.println(C + "°C = " + F + " °F");
    }
    
    public void elapsedTime() {
        int H = 10, M = 55;
        float S = 0, P;
        System.out.print("The current time is " +H+":"+M+":"+S);
        S = H * 3600 + M * 60;
        System.out.println(". It has been " + S + " seconds since the day began.");
        S = 86400 - S;
        System.out.println("There are " + S + " seconds left in the day.");
        P = (86400 - S)/86400 * 100;
        System.out.println("The day is " + P + "% done.");
    }
    
    public void secondsToHMS() {
        int s = 5000;
        int H, M, S;
        H = s/3600;
        M = (s - H*3600)/60;
        S = s - (H*3600 + M*60);
        System.out.print(s+" seconds = "+H+" hours, "+M+" minutes, "+S+" seconds.");
        
    }
    
}



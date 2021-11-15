import javax.swing.*;

public class MoodAnalayzer

{
    public String message;
    public MoodAnalayzer(){

    }
    public MoodAnalayzer(String message){
        this.message = message;
    }

    public String analyzeMood() {
        try {
            if (message.length() == 0)
                throw new NullPointerException();
            if (message.contains("sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch (NullPointerException e) {
            return "Happy";
        }
    }

}

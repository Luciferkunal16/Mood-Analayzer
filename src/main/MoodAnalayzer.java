public class MoodAnalayzer

{
    public String message;
    public MoodAnalayzer(){

    }
    public MoodAnalayzer(String message){
        this.message = message;
    }

    public String analyzeMood() {

        if(this.message.contains("Sad")) {
            return "SAD";
        }
        else {
            return "HAPPY";
        }
    }

}

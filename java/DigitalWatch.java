public class DigitalWatch {
    public boolean isOpened = false;
    public boolean istimerset = false;
    public float Timer = 0;
    public String TimerSetter(float time){
        if(isOpened){
            Timer = time;
            istimerset = true;
            return "Timer setted";
        }
        else{
            return "Watch is closed";
        }
    }
    public String TurnOn(){
        if(!isOpened){
            isOpened = true;
            return "Turned on";
        }
        else{
            return "turned on already ";
        }
    }
    public String Turnoff(){
        if(isOpened){
            isOpened = false;
            return "Turned off successfully";
        }
        else{
            return "turned off alreeady";
        }
    }
    public String doSomething(){
        if(istimerset){
            return "Timer not ended yet";
        }
        else{
            return "Done";
        }
    }

}

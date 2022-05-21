public class coffemachine {
    public boolean ispoweron = false;
    public boolean islightson = false;
    public boolean isbusy = false;
    public float Money;
    private final float Price = 10;
    public int amountofcoffe;
    public String Coffee_maker(int coffeeAmount){
        if(ispoweron) {
            int i= 0;
            if (Money >= Price) {
                while(Money >= Price && coffeeAmount > 0){
                    Money -= Price;
                    isbusy = true;
                    coffeeAmount --;
                    i++;
                }
            }
            else {
                return "Not enough money";
            }
            isbusy = false;
            return i+ " Cups of coffee Made!";
        }
        else{
            return "Machine Turned off";
        }
    }
    public String machine_opener(){
        if(!ispoweron) {
            ispoweron = true;
            islightson = true;
            return "Machine turned on";
        }
        else{
            return "machine opened already";
        }
    }
    public String moneyadder(float money){
        if(money<0){
            return "Money can't be negative";
        }
        if(ispoweron) {
            this.Money = money;
            return "money added successfully";
        }
        else{
            return "machine is not working";
        }
    }

    public String closeMachine(){
        if(ispoweron) {
            islightson = false;
            ispoweron = false;
            return "Machine closed";
        }
        else{
            return "Machine already closed";
        }
    }

}

public class ATM {
    public boolean isvalidcard = true;
    public boolean isvalidpass = true;
    public float Acc_Balance = 0;
    public boolean isauthenticated = false;
    public String Passwordenter(){
        if(isvalidcard){
            if(isvalidpass){
                isauthenticated = true;
                return "login done successfully";
            }
            else{
                return "Check passwrod enterd";
            }
        }
        else{
            return "Please enter card";
        }
    }
    public String Cardentering(){
        if(isvalidcard){
            return "card validated";
        }
        else{
            return "Card not valid";
        }
    }
    public String Withdrawer(float amount){
        if(isauthenticated){
            if(amount <= Acc_Balance){
                Acc_Balance -= amount;
                return "Withdrow done ";
            }
            else{
                return "not enough money in account";
            }
        }
        else{
            return "Not authenticated";
        }
    }
    public String Deposit(float money){
        if(isauthenticated){
            if(money >= 50 && money <=50000){
                Acc_Balance += money;
                return "Transaction done ";
            }
            else{
                return "Check amount restrictions";
            }
        }
        else{
            return "Not authenticated";
        }
    }
    public String Cardremover(){
        if(isvalidcard){
            return "Card removed successfully";
        }
        else{
            return "Not a valid card";
        }
    }

}
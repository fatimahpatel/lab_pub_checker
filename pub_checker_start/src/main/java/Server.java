import java.util.ArrayList;

public class Server {
    public boolean canServeGuest(Guest guest) {

        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Pina Colada");
        drinks.add("Mojito");
        drinks.add("Water");


        boolean ofAge = false;
        boolean hasEnoughMoney = false;
        boolean isSober = false;
        boolean canEnterPub = false;
        boolean correctCurrency = false;

        if (guest.getAge() >= 18) {
            ofAge = true;
        }

        if (guest.getWallet() >= 5){
            hasEnoughMoney = true;
        }

        if (guest.getSobriety() >= 50){
            isSober = true;
        }

        if (guest.getPubStatus() == "Not Banned"){
            canEnterPub = true;
        }

        if (guest.getCurrency() == '£'){
            correctCurrency = true;
        }


        if (ofAge == true && hasEnoughMoney == true && isSober == true && canEnterPub == true && correctCurrency == true) {
            return true;
        }

        return false;


    }



}

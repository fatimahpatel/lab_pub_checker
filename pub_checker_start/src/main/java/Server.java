import java.util.ArrayList;

public class Server {
    public boolean canServeGuest(Guest guest) {


        boolean ofAge = false;
        boolean hasEnoughMoney = false;
        boolean isSober = false;
        boolean canEnterPub = false;
        boolean correctCurrency = false;
        boolean serverCanMakeDrink = false;

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


        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Pina Colada");
        drinks.add("Mojito");
        drinks.add("Water");

        for (String drink:drinks){
            if (drink == guest.getFavDrink()){
                serverCanMakeDrink = true;
            }
        }


        if (ofAge == true && hasEnoughMoney == true && isSober == true && canEnterPub == true && correctCurrency == true && serverCanMakeDrink == true) {
            return true;
        }

        return false;


    }



}

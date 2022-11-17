public class Server {
    public boolean canServeGuest(Guest guest) {
        boolean ofAge = false;
        boolean hasEnoughMoney = false;
        boolean isSober = false;
        boolean canEnterPub = false;

        if (guest.getAge() >= 18) {
            ofAge = true;
        }

        if (guest.getWallet() >= 5){
            hasEnoughMoney = true;
        }

        if (guest.getSobriety() >= 50){
            isSober = true;
        }

        if (ofAge == true && hasEnoughMoney == true && isSober == true && canEnterPub == true) {
            return true;
        }

        return false;


    }


}

public class Server {
    public boolean canServeGuest(Guest guest) {
        boolean ofAge = false;
        boolean hasEnoughMoney = false;

        if (guest.getAge() <= 18) {
            ofAge = true;
        }

        if (ofAge = true && hasEnoughMoney == true) {
            return true;
        }

        return false;


    }


}

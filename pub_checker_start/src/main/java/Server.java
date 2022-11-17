public class Server {
    public boolean canServeGuest(Guest guest) {

        if (guest.getAge() >= 18 && guest.getWallet() > 5){
                return true;
            }
            return false;


}


}

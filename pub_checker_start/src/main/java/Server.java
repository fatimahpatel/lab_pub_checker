public class Server {
    public boolean canServeGuest(Guest guest) {
        boolean ofAge = false;

        if (guest.getAge() <= 18) {
            ofAge = true;
        }

        if (ofAge = true) {
            return true;
        }

        return false;


    }


}

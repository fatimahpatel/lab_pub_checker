import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class ServerTest {

    Server server;
    Guest guest;

    @BeforeEach
    public void setUp(){
        server = new Server();
        guest = new Guest("Bob", 27, 10, 70, "Not Banned");
    }

    // TODO: test that guest can only get served if over 18
    @Test
    public void serveIfOver18(){
        boolean overEighteen = server.canServeGuest(guest) ;
        assertThat(overEighteen).isEqualTo(true);
    }

    // TODO: test that guest can only get served if has enough money to buy a drink (every drink is £5)
    @Test
    public void serveIfGuestHasEnoughMoney(){
        boolean enoughMoney = server.canServeGuest(guest);
        assertThat(enoughMoney).isEqualTo(true);
    }

    // TODO: test that guest can only get served if sober enough (set sobriety level on guest)

    @Test
    public void serveIfGuestIsSober(){
        boolean guestIsSober = server.canServeGuest(guest);
        assertThat(guestIsSober).isEqualTo(true);
    }
    // TODO: test that guest can only get served if guest is not banned from the pub
    @Test
    public void serveIfGuestNotBannedFromPub(){
        boolean guestNotBanned = server.canServeGuest(guest);
        assertThat(guestNotBanned).isEqualTo(true);
    }

    // TODO: test that guest can only get served if guest can pay in local currency (add £ char as currency)

    @Test
    public void checkIfRightCurrency(){
        boolean rightCurrency = server.canServeGuest(guest);
        assertThat(rightCurrency).isEqualTo(true);
    }

    // EXTENSIONS

    // TODO: test that guest can only get served if server can make favourite drink
    //  (give server a list of drinks (strings) it can make)

}

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class ServerTest {

    Server server;
    Guest guest;

    @BeforeEach
    public void setUp(){
        server = new Server();
        guest = new Guest("Bob", 27, 10);
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


    // TODO: test that guest can only get served if guest is not banned from the pub

    // TODO: test that guest can only get served if guest can pay in local currency (add £ char as currency)

    // EXTENSIONS

    // TODO: test that guest can only get served if server can make favourite drink
    //  (give server a list of drinks (strings) it can make)

}

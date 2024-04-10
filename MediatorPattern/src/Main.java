import AirTraffic.ATCSystem;
import AirTraffic.AirTrafficControl;
import AirTraffic.Aircraft;
import AirTraffic.Airplane;
import Chat.ChatMediator;
import Chat.ChatServer;
import Chat.ChatUser;
import Chat.User;

public class Main {
    public static void main(String[] args) {
//        testChat();
        testACT();
    }

    private static void testACT() {
        AirTrafficControl atc = new ATCSystem();

        Aircraft aircraft1 = new Airplane(atc, "Flight1");
        Aircraft aircraft2 = new Airplane(atc, "Flight2");
        Aircraft aircraft3 = new Airplane(atc, "Flight3");

        atc.registerAircraft(aircraft1);
        atc.registerAircraft(aircraft2);
        atc.registerAircraft(aircraft3);

        aircraft1.send("Attention all aircraft, severe weather warning!");
    }

    private static void testChat() {
        ChatMediator mediator = new ChatServer();

        User user1 = new ChatUser(mediator, "User1");
        User user2 = new ChatUser(mediator, "User2");
        User user3 = new ChatUser(mediator, "User3");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);

        user1.sendMessage("Hello, everyone!");
    }


}
package decorator;

class Main {

    public static final String TYPE_K4 = "4K";

    public static void main(String[] args) {
        Room basicScheduleRoom = new ScheduleRoom.ScheduleRoomBuilder(2, 3)
                .addDrinkService()
                .addProjector(TYPE_K4)
                .build();

        Room partyRoom = new PartyRoomDecorator(basicScheduleRoom);
        Room escapeRoom = new EscapeRoomDecorator(basicScheduleRoom);

        Room partyEscapeRoom = new PartyRoomDecorator(escapeRoom);

        partyRoom.meeting();
        partyRoom.show();
        System.out.println("*******************************");
        escapeRoom.meeting();
        escapeRoom.show();

        System.out.println("*******************************");
        partyEscapeRoom.meeting();
        partyEscapeRoom.show();
    }
}
// TODO
/**
 * Twoim zadaniem jest stworzenie pokoju, który będzie przeznaczony na seminaria/wykłady.
 * Postępuj zgodnie z kompozycją dekoratora.
 */
////
/*
1  Dec - uzupełnienie wiadomości do 256 bit 7a .. .. .. 7c .. aa 11 bc
        1a Dec - logowal do pliku lub konsole
2  Dec - suma kontrolna dodawana do wiadomości
3  Dec - szyforowanie base64
4  Dec - odwrucenie kolejnosi bitow


*/

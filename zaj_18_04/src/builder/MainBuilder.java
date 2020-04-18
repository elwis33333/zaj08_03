package builder;

public class MainBuilder {
    public static void main(String[] args) {
        RoomReservation rr =
                new RoomReservation
                        .ReservationRoomBuilder(8, 16, 20)
                        .enableAirCondition()
                        .isTeleconference()
                        .build();

        System.out.println(rr);
    }
}

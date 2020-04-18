package builder;

public class BuilderMain {
    public static void main(String[] args) {
        RoomReservation rr =
                new RoomReservation
                        .ReservationRoomBuilder(8, 16, 20)
                        .enableAirCondition()
                        .addCoffeExpress()
                        .build();
        System.out.println(rr);

    }
}

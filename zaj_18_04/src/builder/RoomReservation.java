package builder;

public class RoomReservation {

    //mandatory
    private int startTime;
    private int endTime;
    private int seats;

    //optional
    private boolean flipBoard;
    private boolean coffeeExpress;
    private boolean airCondition;
    private boolean videoTerminal;

    private RoomReservation(ReservationRoomBuilder builder) {
        this.startTime = builder.startTime;
        this.endTime = builder.endTime;
        this.seats = builder.seats;

        this.airCondition = builder.airCondition;
        this.coffeeExpress = builder.coffeeExpress;
        this.flipBoard = builder.flipBoard;
        this.videoTerminal = builder.videoTerminal;
    }

    private RoomReservation() {
    }

    @Override
    public String toString() {
        return "RoomReservation{" +
                "startTime=" + startTime +
                ", endTime=" + endTime +
                ", seats=" + seats +
                ", flipBoard=" + flipBoard +
                ", coffeeExpress=" + coffeeExpress +
                ", airCondition=" + airCondition +
                ", videoTerminal=" + videoTerminal +
                '}';
    }

    public static class ReservationRoomBuilder {
        //mandatory
        private int startTime;
        private int endTime;
        private int seats;

        //optional
        private boolean flipBoard;
        private boolean coffeeExpress;
        private boolean airCondition;
        private boolean videoTerminal;

        public ReservationRoomBuilder(int startTime, int endTime, int seats) {
            this.startTime = startTime;
            this.endTime = endTime;
            this.seats = seats;
        }

        public ReservationRoomBuilder addFlipBoard() {
            this.flipBoard = true;
            return this;
        }

        public ReservationRoomBuilder enableAirCondition() {
            this.airCondition = true;
            return this;
        }

        public ReservationRoomBuilder serveCoffee() {
            this.coffeeExpress = true;
            return this;
        }

        public ReservationRoomBuilder isTeleconference() {
            this.videoTerminal = true;
            return this;
        }

        public RoomReservation build() {
            return new RoomReservation(this);
        }
    }

}

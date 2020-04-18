package builder;

public class RoomReservation {
    //mandatory - obowiązkowe
    private int startTime;
    private int endTime;
    private int seats;
    //optional
    private boolean flipBoard;
    private boolean coffeExpress;
    private boolean airCondition;
    private boolean videoTerminal;

    @Override
    public String toString() {
        return "RoomReservation{" +
                "startTime=" + startTime +
                ", endTime=" + endTime +
                ", seats=" + seats +
                ", flipBoard=" + flipBoard +
                ", coffeExpress=" + coffeExpress +
                ", airCondition=" + airCondition +
                ", videoTerminal=" + videoTerminal +
                '}';
    }

    private RoomReservation() {
    }

    private RoomReservation(ReservationRoomBuilder builder) {
        this.startTime = builder.startTime;
        this.endTime = builder.endTime;
        this.seats = builder.seats;
        this.airCondition=builder.airCondition;
        this.videoTerminal=builder.videoTerminal;
        this.coffeExpress=builder.coffeExpress;
    }

    public static class ReservationRoomBuilder {
        private int startTime;
        private int endTime;
        private int seats;
        //optional
        private boolean flipBoard;
        private boolean coffeExpress;
        private boolean airCondition;
        private boolean videoTerminal;

        public ReservationRoomBuilder(int startTime, int endTime, int seats) {
            this.startTime = startTime;
            this.endTime = endTime;
            this.seats = seats;
        }
        public ReservationRoomBuilder addFlipBoard(){
            this.flipBoard = true;
            return this;
        }
        public ReservationRoomBuilder enableAirCondition(){
            this.airCondition = true;
            return this;
        }
        public ReservationRoomBuilder addCoffeExpress(){
            this.coffeExpress = true;
            return this;
        }
        public ReservationRoomBuilder enableVideoTerminal(){
            this.videoTerminal = true;
            return this;
        }

        public RoomReservation build() {
            return new RoomReservation(this);
        }

    }

}

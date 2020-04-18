package decorator;

class ScheduleRoom implements Room {
    private int startTime;
    private int endTime;

    //optional
    private boolean drinkService;
    private boolean flipBoard;
    private boolean projector;
    private String projectorType;

    private ScheduleRoom(ScheduleRoomBuilder builder) {
        this.startTime = builder.startTime;
        this.endTime = builder.endTime;
        this.drinkService = builder.drinkService;
        this.flipBoard = builder.flipBoard;
        this.projector = builder.projector;
        this.projectorType = builder.projectorType;
    }

    public void meeting() {
        System.out.println("Perform meeting with standard equipment room");
    }

    @Override
    public void show() {
        System.out.println(String.format("Start at: %d to %d", startTime, endTime));
    }

    @Override
    public String toString() {
        return String.format("Start at: %d to %d", startTime, endTime);
    }

    public static class ScheduleRoomBuilder {
        private int startTime;
        private int endTime;

        //optional
        private boolean drinkService;
        private boolean flipBoard;
        private boolean projector;
        private String projectorType;

        public ScheduleRoomBuilder(int startAt, int endAt) {
            this.startTime = startAt;
            this.endTime = endAt;
        }

        public ScheduleRoom build() {
            return new ScheduleRoom(this);
        }

        public ScheduleRoomBuilder addDrinkService() {
            this.drinkService = true;
            return this;
        }

        public ScheduleRoomBuilder addFlipBoard() {
            this.flipBoard = true;
            return this;
        }

        public ScheduleRoomBuilder addProjector(String projectorType) {
            this.projector = true;
            this.projectorType = projectorType;
            return this;
        }

    }
}

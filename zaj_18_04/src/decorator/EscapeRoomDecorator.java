package decorator;

class EscapeRoomDecorator extends BasicRoomDecorator {
    private boolean DJ;

    public EscapeRoomDecorator(Room room) {
        super(room);
    }

    @Override
    public void meeting() {
        super.meeting();
        DJ = false;
        System.out.println("Room excluded doors and windows so you have to find escape.");
    }

    @Override
    public void show() {
        super.show();
        System.out.println("DJ " + DJ);
    }
}

package decorator;

class PartyRoomDecorator extends BasicRoomDecorator {
    private boolean DJ;

    public PartyRoomDecorator(Room room) {
        super(room);
    }

    @Override
    public void meeting() {
        super.meeting();
        DJ = true;
        System.out.println("Room included barman and alcohol shelf. Also dance area with DJ C-BooL");
    }

    @Override
    public void show() {
        super.show();
        System.out.println("DJ" + DJ);
    }
}

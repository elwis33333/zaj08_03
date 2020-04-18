package fluentAPI;

public class Arsalan implements IResturant{

    String name;

    String IMenu;

    public IResturant name(String name) {

		this.name=name;

		System.out.println("Enter to hotel :: " + name);

		return this;

    }

    public IMenu show() {

        ArsalanMenuHandler handler = new ArsalanMenuHandler();

        handler.showMenu();

        return handler;

    }

}
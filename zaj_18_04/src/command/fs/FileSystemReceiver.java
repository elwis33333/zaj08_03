package command.fs;

public interface FileSystemReceiver {

    void openFile();

    void writeFile();

    void closeFile();

    void readFile();

}

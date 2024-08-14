import java.util.Scanner;

public class MainMenu {


    public int entryPosition;
    private String menuEntry1;
    private String menuEntry2;
    private String menuEntry3;
    private Scanner scanner;

    public MainMenu() {
        scanner = new Scanner(System.in);
    }


    public void showMenu() {
        clearConsole();
        title();
        menuAccountData();
        menuCreateEntry();
        menuDeleteEntry();
        title();
        readInput();
    }

    public void title() {
        System.out.println("===========================");
    }

    public void getUserInput(){
        entryPosition = scanner.nextInt();
        showMenu();
    }

    public void menuAccountData() {
        menuEntry1 = "   Account Daten";
        if (entryPosition == 1) {
            System.out.println("===>" + menuEntry1);
        } else if (entryPosition != 1) {
            System.out.println(menuEntry1);
        }
    }
    public void readInput(){
        getUserInput();
        if(entryPosition == 1){

        }
    }
    public void checkScannerConfirm(){

    }

    public void menuCreateEntry() {
        menuEntry2 = "   Eintrag erstellen";
        if (entryPosition == 2) {
            System.out.println("===>" + menuEntry2);
        } else if (entryPosition != 2) {
            System.out.println(menuEntry2);
        }
    }

    public void menuDeleteEntry() {
        menuEntry3 = "   Eintrag löschen";
        if (entryPosition == 3) {
            System.out.println("===>" + menuEntry3);

        } else if (entryPosition != 3) {
            System.out.println(menuEntry3);
        }
    }

    public void clearConsole() {
        for (int i = 0; i < 10; i++) {
            System.out.println("");
        }
    }


}

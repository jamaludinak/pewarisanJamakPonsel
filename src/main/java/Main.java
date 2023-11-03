import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Xiaomi jamal = new Xiaomi();
        Iphone udin = new Iphone();
        Samsung abdul = new Samsung();
        Oppo karim = new Oppo();
        int selectedPhone = 0;

        while (true) {
            System.out.println("Main Menu :");
            System.out.println("1. Select Phone");
            System.out.println("2. Manipulate Phone Data");
            System.out.println("3. Exit");
            System.out.print("Enter your choice : ");
            int choice = scanner.nextInt();
            System.out.println();
            switch (choice) {
                case 1:
                    System.out.println("Select Phone :");
                    System.out.println("1. Xiaomi");
                    System.out.println("2. iPhone");
                    System.out.println("3. Samsung");
                    System.out.println("4. Oppo");
                    System.out.print("Phone : ");
                    int phoneChoice = scanner.nextInt();
                    switch (phoneChoice) {
                        case 1:
                            selectedPhone = 1;
                            break;
                        case 2:
                            selectedPhone = 2;
                            break;
                        case 3:
                            selectedPhone = 3;
                            break;
                        case 4:
                            selectedPhone = 4;
                            break;
                        default:
                            System.out.println("Invalid Choice");
                            break;
                    }
                    System.out.println();
                    break;
                case 2:
                    switch (selectedPhone) {
                        case 1:
                            jamal.subMenu();
                            choice = scanner.nextInt();
                            switch (choice) {
                                case 1:
                                    System.out.println("1. Power On");
                                    System.out.println("2. Power Off");
                                    System.out.print("Select : ");
                                    int powerChoice = scanner.nextInt();
                                    if (powerChoice == 1) {
                                        jamal.turnOnThePhone();
                                    } else if (powerChoice == 2) {
                                        jamal.turnOffThePhone();
                                    } else {
                                        System.out.println("Invalid Choice");
                                    }
                                    break;
                                case 2:
                                    if (jamal.isPowerOn()) {
                                        jamal.volumeUp();
                                        System.out.println("Volume increased. Current volume: " + jamal.getVolume());
                                        break;
                                    } else System.out.println("Please Turn On Phone");
                                    break;
                                case 3:
                                    if (jamal.isPowerOn()) {
                                        jamal.volumeDown();
                                        System.out.println("Volume decreased. Current volume: " + jamal.getVolume());
                                        break;
                                    } else System.out.println("Please Turn On Phone");
                                    break;
                                case 4:
                                    if (jamal.isPowerOn()) {
                                        System.out.println("Current Volume: " + jamal.getVolume());
                                        break;
                                    } else System.out.println("Please Turn On Phone");
                                    break;
                                case 5:
                                    if (jamal.isPowerOn()) {
                                        System.out.println("Power status: " + (jamal.isPowerOn() ? "On" : "Off"));
                                        break;
                                    } else System.out.println("Please Turn On Phone");
                                    break;
                                case 6:
                                    if (jamal.isPowerOn()) {
                                        jamal.makePhoneLouder();
                                        break;
                                    } else System.out.println("Please Turn On Phone");
                                    break;
                                case 7:
                                    if (jamal.isPowerOn()) {
                                        jamal.makePhoneSilent();
                                        break;
                                    } else System.out.println("Please Turn On Phone");
                                    break;
                                default:
                                    System.out.println("Invalid Choice");
                                    break;
                            }
                            break;
                        case 2:
                            udin.subMenu();
                            choice = scanner.nextInt();
                            switch (choice) {
                                case 1:
                                    System.out.println("1. Power On");
                                    System.out.println("2. Power Off");
                                    System.out.print("Select : ");
                                    int powerChoice = scanner.nextInt();
                                    if (powerChoice == 1) {
                                        udin.turnOnThePhone();
                                    } else if (powerChoice == 2) {
                                        udin.turnOffThePhone();
                                    } else {
                                        System.out.println("Invalid Choice");
                                    }
                                    break;
                                case 2:
                                    if (udin.isPowerOn()) {
                                        udin.volumeUp();
                                        System.out.println("Volume increased. Current volume: " + udin.getVolume());
                                        break;
                                    } else System.out.println("Please Turn On Phone");
                                    break;
                                case 3:
                                    if (udin.isPowerOn()) {
                                        udin.volumeDown();
                                        System.out.println("Volume decreased. Current volume: " + udin.getVolume());
                                        break;
                                    } else System.out.println("Please Turn On Phone");
                                    break;
                                case 4:
                                    if (udin.isPowerOn()) {
                                        System.out.println("Current Volume: " + udin.getVolume());
                                        break;
                                    } else System.out.println("Please Turn On Phone");
                                    break;
                                case 5:
                                    if (udin.isPowerOn()) {
                                        System.out.println("Power status: " + (udin.isPowerOn() ? "On" : "Off"));
                                        break;
                                    } else System.out.println("Please Turn On Phone");
                                    break;
                                case 6:
                                    if (udin.isPowerOn()) {
                                        udin.makePhoneLouder();
                                        break;
                                    } else System.out.println("Please Turn On Phone");
                                    break;
                                case 7:
                                    if (udin.isPowerOn()) {
                                        udin.makePhoneSilent();
                                        break;
                                    } else System.out.println("Please Turn On Phone");
                                    break;
                                default:
                                    System.out.println("Invalid Choice");
                                    break;
                            }
                            break;
                        case 3:
                            abdul.subMenu();
                            choice = scanner.nextInt();
                            switch (choice) {
                                case 1:
                                    System.out.println("1. Power On");
                                    System.out.println("2. Power Off");
                                    System.out.print("Select : ");
                                    int powerChoice = scanner.nextInt();
                                    if (powerChoice == 1) {
                                        abdul.turnOnThePhone();
                                    } else if (powerChoice == 2) {
                                        abdul.turnOffThePhone();
                                    } else {
                                        System.out.println("Invalid Choice");
                                    }
                                    break;
                                case 2:
                                    if (abdul.isPowerOn()) {
                                        abdul.volumeUp();
                                        System.out.println("Volume increased. Current volume: " + abdul.getVolume());
                                        break;
                                    } else System.out.println("Please Turn On Phone");
                                    break;
                                case 3:
                                    if (abdul.isPowerOn()) {
                                        abdul.volumeDown();
                                        System.out.println("Volume decreased. Current volume: " + abdul.getVolume());
                                        break;
                                    } else System.out.println("Please Turn On Phone");
                                    break;
                                case 4:
                                    if (abdul.isPowerOn()) {
                                        System.out.println("Current Volume: " + abdul.getVolume());
                                        break;
                                    } else System.out.println("Please Turn On Phone");
                                    break;
                                case 5:
                                    if (abdul.isPowerOn()) {
                                        System.out.println("Power status: " + (abdul.isPowerOn() ? "On" : "Off"));
                                        break;
                                    } else System.out.println("Please Turn On Phone");
                                    break;
                                case 6:
                                    if (abdul.isPowerOn()) {
                                        abdul.makePhoneLouder();
                                        break;
                                    } else System.out.println("Please Turn On Phone");
                                    break;
                                case 7:
                                    if (abdul.isPowerOn()) {
                                        abdul.makePhoneSilent();
                                        break;
                                    } else System.out.println("Please Turn On Phone");
                                    break;
                                default:
                                    System.out.println("Invalid Choice");
                                    break;
                            }
                            break;
                        case 4:
                            karim.subMenu();
                            choice = scanner.nextInt();
                            switch (choice) {
                                case 1:
                                    System.out.println("1. Power On");
                                    System.out.println("2. Power Off");
                                    System.out.print("Select : ");
                                    int powerChoice = scanner.nextInt();
                                    if (powerChoice == 1) {
                                        karim.turnOnThePhone();
                                    } else if (powerChoice == 2) {
                                        karim.turnOffThePhone();
                                    } else {
                                        System.out.println("Invalid Choice");
                                    }
                                    break;
                                case 2:
                                    if (karim.isPowerOn()) {
                                        karim.volumeUp();
                                        System.out.println("Volume increased. Current volume: " + karim.getVolume());
                                        break;
                                    } else System.out.println("Please Turn On Phone");
                                    break;
                                case 3:
                                    if (karim.isPowerOn()) {
                                        karim.volumeDown();
                                        System.out.println("Volume decreased. Current volume: " + karim.getVolume());
                                        break;
                                    } else System.out.println("Please Turn On Phone");
                                    break;
                                case 4:
                                    if (karim.isPowerOn()) {
                                        System.out.println("Current Volume: " + karim.getVolume());
                                        break;
                                    } else System.out.println("Please Turn On Phone");
                                    break;
                                case 5:
                                    if (karim.isPowerOn()) {
                                        System.out.println("Power status: " + (karim.isPowerOn() ? "On" : "Off"));
                                        break;
                                    } else System.out.println("Please Turn On Phone");
                                    break;
                                case 6:
                                    if (karim.isPowerOn()) {
                                        karim.makePhoneLouder();
                                        break;
                                    } else System.out.println("Please Turn On Phone");
                                    break;
                                case 7:
                                    if (karim.isPowerOn()) {
                                        karim.makePhoneSilent();
                                        break;
                                    } else System.out.println("Please Turn On Phone");
                                    break;
                                default:
                                    System.out.println("Invalid Choice");
                                    break;
                            }
                            break;
                        default:
                            System.out.println("Invalid Choice");
                            break;
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");
                    System.out.println();
                    break;
            }
        }
    }
}

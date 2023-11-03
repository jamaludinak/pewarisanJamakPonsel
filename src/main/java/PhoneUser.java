public class PhoneUser {
    private Phone phone;

    public PhoneUser(Phone phone) {
        this.phone = phone;
    }

    public void turnOnThePhone() {
    }

    public void turnOffThePhone() {
    }

    public void makePhoneLouder() {
    }

    public void makePhoneSilent() {
    }
    void subMenu(){
        System.out.println("Manipulate Phone Data :");
        System.out.println("1. Power On / Off");
        System.out.println("2. Increase Volume");
        System.out.println("3. Decrease Volume");
        System.out.println("4. Get Current Volume");
        System.out.println("5. Get Power Status");
        System.out.println("6. Set to Max Volume");
        System.out.println("7. Set to Silent Mode");
        System.out.print("Enter your choice : ");
    }
}

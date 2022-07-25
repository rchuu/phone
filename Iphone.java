public class Iphone extends Phone implements Ringable {
    public Iphone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }

    @Override
    public String ring() {
        return "iPhone is ringing";
    }

    @Override
    public String unlock() {
        return "iPhone is unlocked";
    }

    @Override
    public void displayInfo() {
        System.out.println("iPhone");
    }
}
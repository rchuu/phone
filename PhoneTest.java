public class PhoneTest {
    public static void main(String[] args) {
        Iphone iPhone8 = new Iphone("8", 100, "AT&T", "ring ring ring");
        Galaxy s6 = new Galaxy("6", 99, "T-Mobile", "beep beep beep");
        iPhone8.displayInfo();
        s6.displayInfo();
    }
}
public class BloodData {

    static String bloodType, rhFactor;
    
    public static void defaultPatient() {
        bloodType = "A";
        rhFactor = "-";
    }

    public static void setBlood(String newBloodType) {
        bloodType = newBloodType;
    }

    public static void setRH(String newRh) {
        rhFactor = newRh;
    }

    public static String getBlood() {
        return bloodType;
    }

    public static String getRH() {
        return rhFactor;
    }

    public static void displayBloodInfo() {
        
        System.out.println("Your blood type is : " + getBlood());
        System.out.println("Your Rh Factor is: " + getRH());

    }
}

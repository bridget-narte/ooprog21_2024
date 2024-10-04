public class BloodData {

    static String bloodType, rhFactor;
    
    public static void defaultPatient() {
        bloodType = "A";
        rhFactor = "-";
    }

    public static void setBloodtype(String newBloodType) {
        bloodType = newBloodType;
    }

    public static void setRHFACTOR(String newRh) {
        rhFactor = newRh;
    }

    public static String getBlood() {
        return bloodType;
    }

    public static String getRHFACTOR() {
        return rhFactor;
    }

    public static void displayBloodInfo() {
        
        System.out.println("Your blood type is : " + getBlood());
        System.out.println("Your Rh Factor is: " + getRHFACTOR());

    }
}

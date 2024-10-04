import java.util.Scanner;
public class TestBloodData {
    public static void main(String[] args) {
        
        BloodData.defaultPatient();
        System.out.println("Default Blood Type:");

        BloodData.displayBloodInfo();
        System.out.println();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter blood type: ");
        String bloodType = scan.nextLine();
        System.out.println("Enter RH Factor: ");
        String rhFactor = scan.nextLine();

        BloodData.setBloodtype(bloodType);
        BloodData.setRHFACTOR(rhFactor);
        BloodData.displayBloodInfo();
    }
}

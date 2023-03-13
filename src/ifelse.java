public class ifelse {
    public static void main(String[] args) {
//        int num =76;
//        if (num%5==0){
//            System.out.println("even number");
//        }
//        else {
//            System.out.println("odd number");
        int age = 25;
        int weight = 48;
        //applying condition on age and weight
        if (age >= 18) {
            if (weight > 50) {
                System.out.println("You are eligible to donate blood");
            } else {
                System.out.println("You are not eligible to donate blood");
            }
        } else {
            System.out.println("Age must be greater than 18");
        }
    }
}

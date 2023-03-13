public class loop {
    public static void main(String[] args) {
//        int i=1;
//        do{
//            System.out.println(i);
//            i++;
//        }while(i<=10);
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                //breaking the loop
                break;
            }
            System.out.println(i);
        }
    }
}


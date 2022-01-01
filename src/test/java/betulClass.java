public class betulClass {
    public static void main(String[] args) {
        System.out.println("Hello Friends!");

        int year= 2022;
        switch (year){
            case 2021:
                System.out.println("Good Bye 2021!");
                break;
            case 2022:
                System.out.println("Happy new year to all");
                break;
            default:
                if(year<2021){
                    System.out.println("Old years");
                    break;
                }else{
                    System.out.println("Future years");
                    break;
                }
        }
    }
}

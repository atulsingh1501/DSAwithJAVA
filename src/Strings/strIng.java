package Strings;

public class strIng {
    public static void main(String[] args) {
        String firstName = "Atul";
        String LastName = new String("Hina modhvadiya");
        System.out.println(firstName + " " + LastName);
//METHODS
        //PRINT THE LENGTH OF STRING
        System.out.println(firstName.length());
        //print charater at that particuler index
        System.out.println(firstName.charAt(1));

        for(int i = 0; i<firstName.length();i++){
            System.out.print(firstName.charAt(i));

        }

    }
}

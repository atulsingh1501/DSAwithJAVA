package week7QuestionsPractice;

public class q3_minElement {
    public static void main(String[] args) {
        int [] arr = {18,12,3,14,28};
        int min = 28;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]<min){
                min = arr[i];

            }
        }
        System.out.println("Minimum element is "+min);
    }
}

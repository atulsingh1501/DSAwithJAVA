package QuestionPractice.week5QuestionsPractice;

public class q2_maxItem {
    //MAXIMUM value of an array
    public static void main(String[] args) {
        int []arr = {1,5,77,33,62,546};
        System.out.println(max(arr));
    }
    static int max(int[] arr){
        int max = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}

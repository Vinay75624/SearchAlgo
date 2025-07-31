public class reversej {
    public static void reversingarr(int number[]){
        int first=0, last=number.length-1;
        while(first<last){
            int temp = number[last];
            number[last]=number[first];
            number[first]=temp;

            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int number[]={10,15,14,34,25};
        reversingarr(number);
        for(int i=0;i<number.length-1;i++){
            System.out.print(number[i]+" ");
            
        }
    }
}

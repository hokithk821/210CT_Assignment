import java.util.Scanner;  
public class Q1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please type in your question");
        System.out.println("The program will gress the answer 50 times");
        String question = input.nextLine();
        int i = 0;
        for(int o=0 ;o<51;o++){  
            String answer = Gress(question.length());
            System.out.println(o +" Times :" + "I gress the number is " + answer);
            if(Bull(question,answer)==question.length()){
                i++;
                System.out.println("Yes, He finally got the answer! ");
                System.out.println("The answer is " + question);
            }
            
            if(o==50 &&Bull(question,answer)!=question.length()){
                System.out.println("Oh No! He finally still can't get the answer!  ");
                System.out.println("The answer is " + question);
            }
        
        }
        
    }
    
    public static String Gress(int length){
        String gress ="";
        for(int i=0;i < length ;i++){
            int randomNum = (int)(Math.random()*10);
            gress += randomNum;
        }     
        return gress;
    }
    
    public static int Bull(String input,String answer){
        String[] inputEx = new String[input.length()];
        String[] answerEx = new String[answer.length()];
        int Bull=0;
        int Crow=0;
        for(int i=0; i<input.length();i++){         
            inputEx[i] = input.substring(i,i+1);
            answerEx[i] = answer.substring(i,i+1);
        }
        
        for(int i=0; i<input.length();i++){ 
            for(int s=0; s<input.length();s++){
                if(inputEx[i].equals(answerEx[s])&& i == s ){
                    if(checked(answerEx,s)){
                        Bull++;
                    }else{
                        Bull++;    
                        Crow--;
                    }
                }else if(inputEx[i].equals(answerEx[s])){
                   if(checked(inputEx,i)){
                   Crow++;
                }
                }   
            }
        }
        //if(Crow<0){
          //  Crow = 0;
        //}
        String GG = "Bull : "+ Bull + " Crow : " + Crow;
        System.out.println(GG);
        return Bull;
    }
    public static boolean checked(String[] answerEx,int s){
        boolean check = false;
       for(int i=0;i<answerEx.length;i++){
           if(answerEx[i].equals(answerEx[s])){
               if(i<=s){
                   check = true;
               }else{
                   check = false;
                }
           }
       }
       return check;
    }
    public static boolean Crowchecked(String[] answerEx,int s){
        boolean check = false;
       for(int i=0;i<answerEx.length;i++){
           if(answerEx[i].equals(answerEx[s])){
               if(i<=s){
                   check = true;
               }else{
                   check = false;
                }
           }
       }
       return check;
    }
    
}
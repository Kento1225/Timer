import java.util.Scanner;
public class Timer_set {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("時間を入力してください:");
        int k=sc.nextInt(); 
        if(k>=1440){
            System.out.print("時間を超過しています");
            System.exit(0);//以下の処理を強制終了
        } else{
        int minutes=00+k; 
        int hour=00;
        int pH=minutes/60;
        int reminutes=minutes%60;
        hour+=pH;
        if(hour<10&&reminutes<10){
           System.out.printf("%d分後は0%d:0%dです",minutes,hour,reminutes);
        }else if(hour<10&&reminutes>=10){
            System.out.printf("%d分後は0%d:%dです",minutes,hour,reminutes);
        } else if(hour>=10&&reminutes<10){
            System.out.printf("%d分後は%d:0%dです",minutes,hour,reminutes);
        } else{
            System.out.printf("%d分後は%d:%dです",minutes,hour,reminutes);
        }
        sc.close();
    }
}
}
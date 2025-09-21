import java.util.Scanner;
import java.time.LocalTime;
class Greeting{
    public void Greet(String Name){
        LocalTime currentTime = LocalTime.now();
        int hour = currentTime.getHour();
        System.out.println("hour :"+hour);
        if(hour >=5 && hour < 12){
            System.out.println("Hello, Good Morning "+ Name+"!");
        }
        else if (hour >= 12 && hour < 17 ){
            System.out.println("Hello, Good Afternoon "+Name+"!");
        }
        else{
            System.out.println("Hello, Good Evening "+Name+"!");
        }
    }
}
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        Greeting g1=new Greeting();
        g1.Greet(name);
    }
}
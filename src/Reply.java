import java.util.Scanner;

/**
 * Created by cameronoakley on 10/14/15.
 */
public class Reply {
        public String sport;
        public String player;
        public String position;
        public int age;
        public int yearOfRetire;

    public Reply(){

    }


        public Reply(String sport, String player, String position, int age, int yearOfRetire){
            this.sport = sport;
            this.player = player;
            this.position = position;
            this.age = age;
            this.yearOfRetire = yearOfRetire;
        }
    void questionReply () {
        System.out.println("Welcome to the sport questionnaire!");
        System.out.println("What is your favorite sport?");
        Scanner scanner = new Scanner(System.in);
        sport = scanner.nextLine();
        System.out.println("Who is your favorite player?");
        player = scanner.nextLine();
        System.out.println("What is your favorite player's position?");
        position = scanner.nextLine();
        System.out.println("What is that player's age?");
        String ageNum = scanner.nextLine();
        int age = Integer.valueOf(ageNum);
        System.out.println("What year did that player retire?");
        String retireNum = scanner.nextLine();
        yearOfRetire = Integer.valueOf(retireNum);

    }
}

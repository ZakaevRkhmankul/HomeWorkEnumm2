import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// Күндөргө enum түзүңүз (Monday, Tuesday ...)
//Консолдон бир күндү белгилеңиз. Эгер Monday болсо - анда
// "Дуйшөмбү куну жава окуйм" же Tuesday болсо - анда "Шейшемби
// күнү англис тили сабагын окуйм" деп күнгө жараша кайсы сабакты
// окуганыңызды консолго чыгарыңыз.
//Жуманын күндөрүн кыргыз тилинде көрсөтүңүз.

        Scanner scanner = new Scanner(System.in);
        String inputDay = scanner.nextLine().toUpperCase();

        Days day = Days.valueOf(inputDay);
        System.out.println(day.getDays());

    }
}
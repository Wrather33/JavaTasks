import java.util.Random;

class Month {
    public static void main(String[] args) {
        String months[] = {
            "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"
        };
        Random r = new Random();
        int rnd = r.nextInt(months.length);
        String month = months[rnd];
        String season;
        if(rnd == 11 || rnd < 2)
        season = "Winter";
        else if(rnd >= 2 && rnd <= 4)
        season = "Spring";
        else if(rnd >= 5 && rnd <= 7)
        season = "Summer";
        else if(rnd >= 8 && rnd <= 10)
        season = "Autumn";
        else season = "unknown";

        System.out.println(month + " is in the " + season + ".");

    }
}
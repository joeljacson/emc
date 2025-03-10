class Cricketer {
    String name;
    int age;
    String role;

    public Cricketer(String name, int age, String role) {
        this.name = name;
        this.age = age;
        this.role = role;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Role: " + role);
    }
}

class Dhoni extends Cricketer {
    int totalMatches;
    int runs;
    int dismissals;
    int trophiesWon;

    public Dhoni(int totalMatches, int runs, int dismissals, int trophiesWon) {
        super("MS Dhoni", 42, "Wicketkeeper-Batsman");
        this.totalMatches = totalMatches;
        this.runs = runs;
        this.dismissals = dismissals;
        this.trophiesWon = trophiesWon;
    }

    void showStats() {
        System.out.println("\nCricketing Stats:");
        System.out.println("Total Matches: " + totalMatches);
        System.out.println("Total Runs: " + runs);
        System.out.println("Total Dismissals: " + dismissals);
        System.out.println("Trophies Won: " + trophiesWon);
    }

    void legendaryMoments() {
        System.out.println("\nLegendary Moments of Dhoni:");
        System.out.println("1. 2007 T20 World Cup Victory 🏆");
        System.out.println("2. 2011 ICC World Cup - Iconic Winning Six 🏏💥");
        System.out.println("3. 2013 ICC Champions Trophy Triumph 🏆");
        System.out.println("4. CSK IPL Championships 🔥");
        System.out.println("5. Lightning Fast Stumpings ⚡");
    }
}

public class DhoniCricketLife {
    public static void main(String[] args) {
        Dhoni dhoni = new Dhoni(538, 17266, 829, 5);
        
        System.out.println("🏏 The Journey of MS Dhoni - A Cricketing Legend 🏏");
        dhoni.displayInfo();
        dhoni.showStats();
        dhoni.legendaryMoments();
        
        System.out.println("\n💛 'You don't play for the crowd, you play for the country' - MS Dhoni 💛");
    }
}

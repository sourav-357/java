package Section9_10_Arrays.IterativeList;

public class Traveler {
    private String travelerName;
    private int travelerAge;
    private static int numberVisitedCities;

    public Traveler(String travelerName, int travelerAge) {
        this.travelerName = travelerName;
        this.travelerAge = travelerAge;
    }

    public Traveler() {
    }

    public String getTravelerName() {
        return travelerName;
    }

    public int getTravelerAge() {
        return travelerAge;
    }

    public static int getNumberVisitedCities() {
        return numberVisitedCities;
    }

    public static void setNumberVisitedCities(int numberVisitedCities) {
        Traveler.numberVisitedCities = numberVisitedCities;
    }
}

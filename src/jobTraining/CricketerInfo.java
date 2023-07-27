package jobTraining;

public class CricketerInfo {

    private final String name;
    private int noOfRuns;
    private int matchesPlayed;
    private final String playerType;
    private int noOfWickets;

    public CricketerInfo(String name, String playerType, int matchesPlayed, int noOfRuns, int noOfWickets){
        this.name=name;
        this.playerType=playerType;
        this.matchesPlayed=matchesPlayed;
        this.noOfRuns=noOfRuns;
        this.noOfWickets=noOfWickets;

    }

    public String buildBio() {
        String basicInfo = name + " " +playerType;
        return basicInfo;
    }

    public String buildStats() {
        String stats = playerType + " " + matchesPlayed + " "+ noOfRuns + " " + noOfWickets;
        return stats;
    }

}

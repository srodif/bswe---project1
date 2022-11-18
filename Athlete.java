public class Athlete
{
    // Fields - instance variables 
    private String athleteName;
    private String birthday;
    private String sportName;
    private double record;
    private int ranking;
    private int olympicNo;
    
    //parameter constructor (q1)
    public Athlete(String athName, String bday, String spName) {
        this.athleteName = athName;
        this.birthday = bday;
        this.sportName = spName;
        this.record = 0.0;
        this.ranking = 0;
        this.olympicNo = 0;
    }
    
    //getters (q2)
    public String getAthleteName() {
        return this.athleteName;
    }
    public String getBirthday() {
        return this.birthday;
    }
    public String getSportName() {
        return this.sportName;
    }
    public double getRecord() {
        return this.record;
    }
    public int getRanking() {
        return this.ranking;
    }
    
    //setters (q3)
    public void setRecord(double rec) {
        this.record = rec;
    }
    public void setRanking(int rank) {
        this.ranking = rank;
    }
    //(q4)
    public void setOlympicNo() {
        this.olympicNo++;
    }

    //RecordLimit (q5) - assuming users always give 1 or -1 as needed
    public String participation(double RecordLimit, int lessMore) {
        if ((this.record - RecordLimit) * lessMore > 0) {
            return this.athleteName + " will participate in the sport event.";
        } else {
            return this.athleteName + " will not participate in the sport event.";
        }
        //more readable control: if ((lessMore == 1 && this.record > RecordLimit) || (lessMore == -1 && this.record < RecordLimit)) {}
        //less readable control: if ((this.record - RecordLimit) * lessMore > 0) {}
    }

    //WR (q6) - assuming users always give 1 or -1 as needed
    public String worldRecord(double WRecord, int lessMore) {
        if ((lessMore == 1 && this.record > WRecord) || (lessMore == -1 && this.record < WRecord)) {
            return this.athleteName + " made a new world record.";
        } else if (this.record == WRecord) {
            return "Performance equal to world record for " + this.athleteName + ".";
        } else {
            return this.athleteName + " has worse performance than the world record.";
        }
    }

    //Information (q7)
    public void info() {
        System.out.println(this.athleteName + ". Born: " + this.birthday + ". Sport: " + this.sportName);
        System.out.println("Personal performance: " + this.record + ". World ranking: " + this.ranking + ". " + this.olympicNo + " participations in Olympic Games.");
    }
}
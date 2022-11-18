public class Main
{
    public static void main(String[] args)
    {
        //objects creation (q8 and q9)
        Athlete lewis = new Athlete("Lewis", "01/07/1961", "100m");
        Athlete devetzi = new Athlete("Devetzi", "02/10/1975", "Triploun");

        //setRecords (q10)
        lewis.setRecord(9.92);
        devetzi.setRecord(15.32);

        //setRanks (q11)
        lewis.setRanking(1);
        devetzi.setRanking(3);

        //setOlympicParticipations (q12)
        lewis.setOlympicNo();
        lewis.setOlympicNo();
        lewis.setOlympicNo();
        lewis.setOlympicNo();
        devetzi.setOlympicNo();

        lewis.info();
        System.out.println(lewis.participation(10.0,-1));
        System.out.println(lewis.worldRecord(9.95,-1));
        
        devetzi.info();
        System.out.println(devetzi.participation(14.0,1));
        System.out.println(devetzi.worldRecord(15.50,1));
    }  
}
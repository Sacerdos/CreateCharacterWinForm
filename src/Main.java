/*public class Main {
    final static Random random = new Random();
    public static void main(String[] args){
        Character myChar=new Character();
        switch(random.nextInt(3)){
            case 0:
                myChar = new Character(new RaceDwarves(), new GenerateRandomStats(random.nextInt(4)));
                //myChar = new Character(new RaceDwarves(), new GenerateRandomStats(3));
                break;
            case 1:
                myChar = new Character(new RaceHumans(), new GenerateRandomStats(random.nextInt(4)));
                //myChar = new Character(new RaceDwarves(), new GenerateRandomStats(3));
                break;
            case 2:
                myChar = new Character(new RaceElves(), new GenerateRandomStats(random.nextInt(4)));
                //myChar = new Character(new RaceDwarves(), new GenerateRandomStats(3));
                break;
        }
        System.out.println(myChar.toString());
        Save a = new Save(myChar);
        Load b = new Load("D:\\MainProjects\\CreateCharacter\\characterHarsk.xml");
    }
}*/

import java.util.Random;

public class RaceElves extends Race{
    final static Random random = new Random();
    private static String[] maleNamePool = {"Caladrel", "Heldalel", "Lanliss", "Meirdrarel", "Seldlon", "Talathel", "Variel", "Zordlon"};
    private static String[] femaleNamePool = {"Amrunelara", "Dardlara", "Faunra", "Jathal", "Merisiel", "Oparal", "Soumral", "Tessara", "Yalandlara"};
    public String[] getMaleNamePool() {
        return maleNamePool;
    }
    public String[] getFemaleNamePool() {
        return femaleNamePool;
    }
    private static String[] classNamePool = {"Alchemist", "Barbarian", "Bard", "Rider", "Priest", "Druid", "Bruiser", "Shooter", "Inquisitor", "Magus", "Monk", "Ninja", "Oracle", "Paladin", "Ranger", "Rogue", "Samurai", "Summoner", "Magician", "Witch", "Wizard"  };
    public String[] getClassNamePool() { return classNamePool; }
    private int baseAge=110;
    private double baseHeight=162.56;
    private double baseMaleWeight=49.89;
    private double baseFemaleWeight=40.82;
    private int bonusStrength=0;
    private int bonusDexterity=2;
    private int bonusConstitution=-2;
    private int bonusIntelligence=2;
    private int bonusWisdom=0;
    private int bonusCharisma=0;
    public RaceElves() {
        super("Elves");
    }
    public int getAge(int randomChoice){
        int age=baseAge;
        switch (randomChoice){
            case 0:
                for (int i=0; i<4;i++){
                    age+=(random.nextInt(6)+1);
                }
                return age;
            case 1:
                for (int i=0; i<6;i++){
                    age+=(random.nextInt(6)+1);
                }
                return age;
            case 2:
                for (int i=0; i<10;i++){
                    age+=(random.nextInt(6)+1);
                }
                return age;
        }
        return 0;
    }
    public int getHeight(String gender){
        double height=baseHeight;
        switch (gender){
            case "Male":
                for (int i=0; i<2;i++){
                    height+=2.54*(random.nextInt(8)+1);
                }
                break;
            case "Female":
                for (int i=0; i<2;i++){
                    height+=2.54*(random.nextInt(6)+1);
                }
                break;
        }

        return (int)height;
    }
    public int getWeight(String gender){
        double weight=0;
        switch (gender){
            case "Male":
                weight=baseMaleWeight;
                for (int i=0; i<2;i++){
                    weight+=0.45*((random.nextInt(8)+1)*3);
                }
                break;
            case "Female":
                weight=baseFemaleWeight;
                for (int i=0; i<2;i++){
                    weight+=0.45*((random.nextInt(6)+1)*3);
                }
                break;
        }
        return (int)weight;
    }
    public int getBonusStrength() {
        return bonusStrength;
    }
    public int getBonusDexterity() {
        return bonusDexterity;
    }
    public int getBonusConstitution() {
        return bonusConstitution;
    }
    public int getBonusIntelligence() {
        return bonusIntelligence;
    }
    public int getBonusWisdom() {
        return bonusWisdom;
    }
    public int getBonusCharisma() {
        return bonusCharisma;
    }
}
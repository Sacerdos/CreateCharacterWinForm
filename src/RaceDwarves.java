import java.util.Random;

public class RaceDwarves extends Race{
    final static Random random = new Random();
    private static String[] maleNamePool = {"Dolgrin", "Grunyar", "Harsk", "Kazmuk", "Morgrym", "Rogar"};
    private static String[] femaleNamePool = {"Agna", "Bodill", "Ingra", "Kotri", "Rusilka", "Yangrit"};
    public String[] getMaleNamePool() {
        return maleNamePool;
    }
    public String[] getFemaleNamePool() {
        return femaleNamePool;
    }
    private static String[] classNamePool = {"Alchemist", "Barbarian", "Bard", "Rider", "Priest", "Druid", "Bruiser", "Shooter", "Inquisitor", "Magus", "Monk", "Ninja", "Oracle", "Paladin", "Ranger", "Rogue", "Samurai", "Summoner", "Magician", "Witch", "Wizard"  };
    public String[] getClassNamePool() { return classNamePool; }
    private int baseAge=40;
    private double baseMaleHeight=114.3;
    private double baseFemaleHeight=109.22;
    private double baseMaleWeight=68.03;
    private double baseFemaleWeight=54.43;
    private int bonusStrength=0;
    private int bonusDexterity=0;
    private int bonusConstitution=2;
    private int bonusIntelligence=0;
    private int bonusWisdom=2;
    private int bonusCharisma=-2;
    public RaceDwarves() {
        super("Dwarves");
    }
    public int getAge(int randomChoice){
        int age=baseAge;
        switch (randomChoice){
            case 0:
                for (int i=0; i<3;i++){
                    age+=(random.nextInt(6)+1);
                }
            case 1:
                for (int i=0; i<5;i++){
                    age+=(random.nextInt(6)+1);
                }
            case 2:
                for (int i=0; i<7;i++){
                    age+=(random.nextInt(6)+1);
                }
        }
        return age;
    }
    public int getHeight(String gender){
        double height=0;
        switch (gender){
            case "Male":
                height=baseMaleHeight;
                break;
            case "Female":
                height=baseFemaleHeight;
                break;
        }
        for (int i=0; i<2;i++){
            height+=2.54*(random.nextInt(4)+1);
        }
        return (int)height;
    }
    public int getWeight(String gender){
        double weight=0;
        switch (gender){
            case "Male":
                weight=baseMaleWeight;
                break;
            case "Female":
                weight=baseFemaleWeight;
                break;
        }
        for (int i=0; i<2;i++){
            weight+=0.45*((random.nextInt(4)+1)*7);
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
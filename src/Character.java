import java.util.Random;

public class Character {
    final static private Random random = new Random();
    public Character() {
    }
    public Character(Race race, GenerateRandomStats randomStats) {
        this.race = race;
        this.randomStats = randomStats;
        switch(random.nextInt(2)){
            case 0:
                this.name = this.race.getMaleNamePool()[random.nextInt(this.race.getMaleNamePool().length)];
                this.gender = "Male";
                break;
            case 1:
                this.name = this.race.getFemaleNamePool()[random.nextInt(this.race.getFemaleNamePool().length)];
                this.gender = "Female";
                break;
        } //выбор пола и имени
        this.className = this.race.getClassNamePool()[random.nextInt(this.race.getClassNamePool().length)];
        setAlignment(random.nextInt(9)+1); //мировозрение
        int tAge = random.nextInt(3); //возраст
        switch (tAge){
            case 0:
                age=race.getAge(tAge);
                typeAge="Intuitive";
                break;
            case 1:
                age=race.getAge(tAge);
                typeAge="Self-Taught";
                break;
            case 2:
                age=race.getAge(tAge);
                typeAge="Trained";
                break;
        }
        height=race.getHeight(gender);
        weight=race.getWeight(gender);
        setStartingMoney(className, random);
    }
    private String name;
    public String getName() {
        return name;
    }
    private Race race;
    public Race getRace() {
        return race;
    }
    private int startingMoney;
    public int getStartingMoney(){
        return startingMoney;
    }
    private String className;
    public String getClassName() { return className; }
    private String gender;
    public String getGender() {
        return gender;
    }
    private GenerateRandomStats randomStats;
    private String alignment;
    public String getAlignment() {
        return alignment;
    }
    private void setStartingMoney(String className, Random random) {
        switch(className){
            case "Monk":
                this.startingMoney = (random.nextInt(6)+1) * 10;
                break;
            case "Druid":
                this.startingMoney = (random.nextInt(6)+1) * 10 + (random.nextInt(6)+1) * 10;
            case "Magician":
                this.startingMoney = (random.nextInt(6)+1) * 10 + (random.nextInt(6)+1) * 10;
            case "Wizard":
                this.startingMoney = (random.nextInt(6)+1) * 10 + (random.nextInt(6)+1) * 10;
            case "Summoner":
                this.startingMoney = (random.nextInt(6)+1) * 10 + (random.nextInt(6)+1) * 10;
            case "Oracle":
                this.startingMoney = (random.nextInt(6)+1) * 10 + (random.nextInt(6)+1) * 10 + (random.nextInt(6)+1) * 10;
            case "Alchemist":
                this.startingMoney = (random.nextInt(6)+1) * 10 + (random.nextInt(6)+1) * 10 + (random.nextInt(6)+1) * 10;
            case "Barbarian":
                this.startingMoney = (random.nextInt(6)+1) * 10 + (random.nextInt(6)+1) * 10 + (random.nextInt(6)+1) * 10;
            case "Bard":
                this.startingMoney = (random.nextInt(6)+1) * 10 + (random.nextInt(6)+1) * 10 + (random.nextInt(6)+1) * 10;
            case "Samurai":
                this.startingMoney = (random.nextInt(6)+1) * 10 + (random.nextInt(6)+1) * 10 + (random.nextInt(6)+1) * 10;
            case "Witch":
                this.startingMoney = (random.nextInt(6)+1) * 10 + (random.nextInt(6)+1) * 10 + (random.nextInt(6)+1) * 10;
            case "Priest":
                this.startingMoney = (random.nextInt(6)+1) * 10 + (random.nextInt(6)+1) * 10 + (random.nextInt(6)+1) * 10 + (random.nextInt(6)+1) * 10;
            case "Inquisitor":
                this.startingMoney = (random.nextInt(6)+1) * 10 + (random.nextInt(6)+1) * 10 + (random.nextInt(6)+1) * 10 + (random.nextInt(6)+1) * 10;
            case "Magus":
                this.startingMoney = (random.nextInt(6)+1) * 10 + (random.nextInt(6)+1) * 10 + (random.nextInt(6)+1) * 10 + (random.nextInt(6)+1) * 10;
            case "Ninja":
                this.startingMoney = (random.nextInt(6)+1) * 10 + (random.nextInt(6)+1) * 10 + (random.nextInt(6)+1) * 10 + (random.nextInt(6)+1) * 10;
            case "Rogue":
                this.startingMoney = (random.nextInt(6)+1) * 10 + (random.nextInt(6)+1) * 10 + (random.nextInt(6)+1) * 10 + (random.nextInt(6)+1) * 10;
            case "Rider":
                this.startingMoney = (random.nextInt(6)+1) * 10 + (random.nextInt(6)+1) * 10 + (random.nextInt(6)+1) * 10 + (random.nextInt(6)+1) * 10 + (random.nextInt(6)+1) * 10;
            case "Bruiser":
                this.startingMoney = (random.nextInt(6)+1) * 10 + (random.nextInt(6)+1) * 10 + (random.nextInt(6)+1) * 10 + (random.nextInt(6)+1) * 10 + (random.nextInt(6)+1) * 10;
            case "Shooter":
                this.startingMoney = (random.nextInt(6)+1) * 10 + (random.nextInt(6)+1) * 10 + (random.nextInt(6)+1) * 10 + (random.nextInt(6)+1) * 10 + (random.nextInt(6)+1) * 10;
            case "Paladin":
                this.startingMoney = (random.nextInt(6)+1) * 10 + (random.nextInt(6)+1) * 10 + (random.nextInt(6)+1) * 10 + (random.nextInt(6)+1) * 10 + (random.nextInt(6)+1) * 10;
            case "Ranger":
                this.startingMoney = (random.nextInt(6)+1) * 10 + (random.nextInt(6)+1) * 10 + (random.nextInt(6)+1) * 10 + (random.nextInt(6)+1) * 10 + (random.nextInt(6)+1) * 10;
        }
    }
    private void setAlignment(int randomChoice) {
        switch(randomChoice){
            case 1:
                this.alignment = "Lawful Good";
                break;
            case 2:
                this.alignment = "Neutral Good";
                break;
            case 3:
                this.alignment = "Chaotic  Good";
                break;
            case 4:
                this.alignment = "Lawful Neutral";
                break;
            case 5:
                this.alignment = "True Neutral";
                break;
            case 6:
                this.alignment = "Chaotic Neutral";
                break;
            case 7:
                this.alignment = "Lawful Evil";
                break;
            case 8:
                this.alignment = "Neutral Evil";
                break;
            case 9:
                this.alignment = "Neutral Evil";
                break;
        }
    }
    private int age;
    public int getAge() {
        return age;
    }
    private String typeAge;
    public String getTypeAge() {
        return typeAge;
    }
    private int height;
    public int getHeight() {
        return height;
    }
    private int weight;
    public int getWeight() {
        return weight;
    }
    public String getStrength() {	return (randomStats.getStrength() + race.getBonusStrength() + " (" + race.getBonusStrength() + ")");	}
    public String getDexterity() { return randomStats.getDexterity()+race.getBonusDexterity() + " (" + race.getBonusDexterity() + ")"; }
    public String getConstitution() { return (randomStats.getConstitution()+race.getBonusConstitution()) + " (" + race.getBonusConstitution() + ")"; }
    public String getIntelligence() { return (randomStats.getIntelligence()+race.getBonusIntelligence()) + " (" + race.getBonusIntelligence() + ")"; }
    public String getWisdom() { return (randomStats.getWisdom()+race.getBonusWisdom()) + " (" + race.getBonusWisdom() + ")"; }
    public String getCharisma() { return (randomStats.getCharisma()+race.getBonusCharisma()) + " (" + race.getBonusCharisma() + ")"; }
    public String getTypeGenerate() {
        return randomStats.getTypeGenerate();
    }
    @Override
    public String toString() {
        return "Character:\n" +
                "Name: " + name +
                "\nRace: " + race.getRaceName() +
                "\nClass: " + className +
                "\nGender: " + gender +
                "\nAlignment: " + alignment +
                "\nStarting Money: " + startingMoney +
                "\nAge: " + age + " " + typeAge +
                "\nHeight: " + height + "sm  Weight: " + weight + "kg" +
                "\nStats (bonuses includes) " + randomStats.getTypeGenerate() +
                "\nStrength: " + (randomStats.getStrength()+race.getBonusStrength()) + " (" + race.getBonusStrength() + ")" +
                "\nDexterity: " + (randomStats.getDexterity()+race.getBonusDexterity()) + " (" + race.getBonusDexterity() + ")" +
                "\nConstitution: " + (randomStats.getConstitution()+race.getBonusConstitution()) + " (" + race.getBonusConstitution() + ")" +
                "\nIntelligence: " + (randomStats.getIntelligence()+race.getBonusIntelligence()) + " (" + race.getBonusIntelligence() + ")" +
                "\nWisdom: " + (randomStats.getWisdom()+race.getBonusWisdom()) + " (" + race.getBonusWisdom() + ")" +
                "\nCharisma: " + (randomStats.getCharisma()+race.getBonusCharisma()) + " (" + race.getBonusCharisma() + ")";
    }
}
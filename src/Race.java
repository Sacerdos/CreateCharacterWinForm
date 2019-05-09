import java.util.Random;

abstract class Race {
    final static Random random = new Random();
    public Race(String raceName) {
        this.raceName = raceName;
    }
    private String raceName;
    public String getRaceName() {
        return raceName;
    }
    abstract String[] getClassNamePool();
    abstract String[] getMaleNamePool();
    abstract String[] getFemaleNamePool();
    abstract int getAge(int randomChoice);
    abstract int getHeight(String gender);
    abstract int getWeight(String gender);
    abstract int getBonusStrength();
    abstract int getBonusDexterity();
    abstract int getBonusConstitution();
    abstract int getBonusIntelligence();
    abstract int getBonusWisdom();
    abstract int getBonusCharisma();
}
import java.util.*;
import java.util.Random;

public class GenerateRandomStats {
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;
    private String typeGenerate;
    public String getTypeGenerate() {
        return typeGenerate;
    }
    final static Random random = new Random();
    public GenerateRandomStats(int bound) {
        switch(bound) {
            case 0:
                generateStandard();
                typeGenerate="Random 0 to 15 + 3";
                break;
            case 1:
                generate5d6best3();
                typeGenerate="Random 5d6 best 3";
                break;
            case 2:
                typeGenerate="Random 2d6 + 6";
                generate2d6plus6();
                break;
            case 3:
                typeGenerate="Random 3d6";
                generate3d6();
                break;
        }
    }
    public int getStrength() {	return strength;	}
    public int getDexterity() { return dexterity; }
    public int getConstitution() { return constitution; }
    public int getIntelligence() { return intelligence; }
    public int getWisdom() { return wisdom; }
    public int getCharisma() { return charisma; }
    private void generateStandard() {
        this.strength = random.nextInt(16)+3;
        this.dexterity = random.nextInt(16)+3;
        this.constitution = random.nextInt(16)+3;
        this.intelligence = random.nextInt(16)+3;
        this.wisdom = random.nextInt(16)+3;
        this.charisma = random.nextInt(16)+3;
    }
    private void generate5d6best3() {
        for(int i=0; i<6; i++){
            cycleForGenerate5d6best3(i);
        }
    }
    private void cycleForGenerate5d6best3(int typeStat) {
        int roll[] = new int[5];
        for (int i = 0; i < 4; i++) {
            roll[i] = random.nextInt(6)+1;
        }
        Arrays.sort(roll);
        switch (typeStat){
            case 0:
                this.strength=roll[2] + roll[3] + roll[4];
                break;
            case 1:
                this.dexterity=roll[2] + roll[3] + roll[4];
                break;
            case 2:
                this.constitution=roll[2] + roll[3] + roll[4];
                break;
            case 3:
                this.intelligence=roll[2] + roll[3] + roll[4];
                break;
            case 4:
                this.wisdom=roll[2] + roll[3] + roll[4];
                break;
            case 5:
                this.charisma=roll[2] + roll[3] + roll[4];
                break;
        }
    }
    private void generate2d6plus6() {
        for(int i=0; i<6; i++){
            cycleForGenerate2d6plus6(i);
        }
    }
    private void cycleForGenerate2d6plus6(int typeStat) {
        int stat = 6;
        for (int i = 0; i < 2; i++) {
            stat += random.nextInt(6)+1;
        }
        switch (typeStat){
            case 0:
                this.strength=stat;
                break;
            case 1:
                this.dexterity=stat;
                break;
            case 2:
                this.constitution=stat;
                break;
            case 3:
                this.intelligence=stat;
                break;
            case 4:
                this.wisdom=stat;
                break;
            case 5:
                this.charisma=stat;
                break;
        }

    }
    private void generate3d6() {
        for(int i=0; i<6; i++){
            cycleForGenerate3d6(i);
        }
    }
    private void cycleForGenerate3d6(int typeStat) {
        int stat=0;
        for (int i = 0; i < 3; i++) {
            stat += random.nextInt(6)+1;
        }
        switch (typeStat){
            case 0:
                this.strength=stat;
                break;
            case 1:
                this.dexterity=stat;
                break;
            case 2:
                this.constitution=stat;
                break;
            case 3:
                this.intelligence=stat;
                break;
            case 4:
                this.wisdom=stat;
                break;
            case 5:
                this.charisma=stat;
                break;
        }
    }
}
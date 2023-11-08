package common;

public class Competitor {

    private String name;
    private int score = 0;
    private int deca100M = 0;
    private int deca110MHurdles = 0;
    private int deca400M = 0;
    private int deca1500M = 0;
    private int decaDiscusThrow = 0;
    private int decaHighJump = 0;
    private int decaJavelinThrow = 0;
    private int decaLongJump = 0;
    private int decaPoleVault = 0;
    private int decaShotPut = 0;

    private int hept100MHurdles = 0;
    private int hept200M = 0;
    private int hept800M = 0;
    private int heptHighJump = 0;
    private int heptJavelinThrow = 0;
    private int heptLongJump = 0;
    private int heptShotPut = 0;

    public Competitor(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getDeca100M() {
        return deca100M;
    }

    public void setDeca100M(int deca100M) {
        this.deca100M = deca100M;
    }

    public int getDeca110MHurdles() {
        return deca110MHurdles;
    }

    public void setDeca110MHurdles(int deca110MHurdles) {
        this.deca110MHurdles = deca110MHurdles;
    }

    public int getDeca400M() {
        return deca400M;
    }

    public void setDeca400M(int deca400M) {
        this.deca400M = deca400M;
    }

    public int getDeca1500M() {
        return deca1500M;
    }

    public void setDeca1500M(int deca1500M) {
        this.deca1500M = deca1500M;
    }

    public int getDecaDiscusThrow() {
        return decaDiscusThrow;
    }

    public void setDecaDiscusThrow(int decaDiscusThrow) {
        this.decaDiscusThrow = decaDiscusThrow;
    }

    public int getDecaHighJump() {
        return decaHighJump;
    }

    public void setDecaHighJump(int decaHighJump) {
        this.decaHighJump = decaHighJump;
    }

    public int getDecaJavelinThrow() {
        return decaJavelinThrow;
    }

    public void setDecaJavelinThrow(int decaJavelinThrow) {
        this.decaJavelinThrow = decaJavelinThrow;
    }

    public int getDecaLongJump() {
        return decaLongJump;
    }

    public void setDecaLongJump(int decaLongJump) {
        this.decaLongJump = decaLongJump;
    }

    public int getDecaPoleVault() {
        return decaPoleVault;
    }

    public void setDecaPoleVault(int decaPoleVault) {
        this.decaPoleVault = decaPoleVault;
    }

    public int getDecaShotPut() {
        return decaShotPut;
    }

    public void setDecaShotPut(int decaShotPut) {
        this.decaShotPut = decaShotPut;
    }

    public int getHept100MHurdles() {
        return hept100MHurdles;
    }

    public void setHept100MHurdles(int hept100MHurdles) {
        this.hept100MHurdles = hept100MHurdles;
    }

    public int getHept200M() {
        return hept200M;
    }

    public void setHept200M(int hept200M) {
        this.hept200M = hept200M;
    }

    public int getHept800M() {
        return hept800M;
    }

    public void setHept800M(int hept800M) {
        this.hept800M = hept800M;
    }

    public int getHeptHighJump() {
        return heptHighJump;
    }

    public void setHeptHighJump(int heptHighJump) {
        this.heptHighJump = heptHighJump;
    }

    public int getHeptJavelinThrow() {
        return heptJavelinThrow;
    }

    public void setHeptJavelinThrow(int heptJavelinThrow) {
        this.heptJavelinThrow = heptJavelinThrow;
    }

    public int getHeptLongJump() {
        return heptLongJump;
    }

    public void setHeptLongJump(int heptLongJump) {
        this.heptLongJump = heptLongJump;
    }

    public int getHeptShotPut() {
        return heptShotPut;
    }

    public void setHeptShotPut(int heptShotPut) {
        this.heptShotPut = heptShotPut;
    }

    public void printAllScores(){
        System.out.println("Competitor name: " + getName());
        System.out.println("Decathlon 100M: " + getDeca100M());
        System.out.println("Decathlon 110M Hurdles: " + getDeca110MHurdles());
        System.out.println("Decathlon 400M: " + getDeca400M());
        System.out.println("Decathlon 1500M: " + getDeca1500M());
        System.out.println("Decathlon Discus Throw: " + getDecaDiscusThrow());
        System.out.println("Decathlon High Jump: " + getDecaHighJump());
        System.out.println("Decathlon Javelin Throw: " + getDecaJavelinThrow());
        System.out.println("Decathlon Long Jump: " + getDecaLongJump());
        System.out.println("Decathlon Pole Vault: " + getDecaPoleVault());
        System.out.println("Decathlon Shot Put: " + getDecaShotPut());
        System.out.println("Hepathlon 100M Hurdles: " + getHept100MHurdles());
        System.out.println("Hepathlon 200M: " + getHept200M());
        System.out.println("Hepathlon 800M: " + getHept800M());
        System.out.println("Hepathlon High Jump: " + getHeptHighJump());
        System.out.println("Hepathlon Javelin Throw: " + getHeptJavelinThrow());
        System.out.println("Hepathlon Long Jump: " + getHeptLongJump());
        System.out.println("Hepathlon Shot Put: " + getHeptShotPut());


    }

}

package common;
import java.util.Arrays;
import java.util.Dictionary;
import java.util.Hashtable;
import decathlon.Deca100M;
import decathlon.Deca1500M;
import decathlon.Deca110MHurdles;
import decathlon.Deca400M;
import decathlon.DecaDiscusThrow;
import decathlon.DecaHighJump;
import decathlon.DecaJavelinThrow;
import decathlon.DecaLongJump;
import decathlon.DecaShotPut;
import decathlon.DecaPoleVault;

import heptathlon.Hep100MHurdles;
import heptathlon.Hep200M;
import heptathlon.Hep800M;
import heptathlon.HeptHightJump;
import heptathlon.HeptJavelinThrow;
import heptathlon.HeptLongJump;
import heptathlon.HeptShotPut;

public class Competitor {

    private String name;
    private int score = 0;
    private int deca100M = 0;
    private int deca110mHurdles = 0;
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

    public int getDeca110mHurdles() {
        return deca110mHurdles;
    }

    public void setDeca110mHurdles(int deca110mHurdles) {
        this.deca110mHurdles = deca110mHurdles;
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

    public void printInfo(){
    System.out.println("Competitor name: " + getName());
    System.out.println("Competitor total score: " + getScore());
    }

}

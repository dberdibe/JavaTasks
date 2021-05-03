package day11.task2;

public abstract class Hero implements PhysAttack{
    final int MIN_HEALTH = 0;
    int health;
    int physAttack;
    double physDef;
    double magicDef;

    public Hero(){
        health = 100;
    }

    @Override
    public void physAttack(Hero h) {
       double attackScore = physAttack * (1 - h.physDef);
        if (h.health - attackScore < 0) {
            h.health = MIN_HEALTH;
        } else {
            h.health -= attackScore;
        }
    }
}

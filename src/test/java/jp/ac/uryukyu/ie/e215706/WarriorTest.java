package jp.ac.uryukyu.ie.e215706;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WarriorTest {
    @Test
    void attackWithWeponSkillTest() {
        int defaultWarriorHp = 100;
        Warrior demoWarrior = new Warrior("デモ戦士", defaultWarriorHp, 100);
        Enemy slime = new Enemy("スライムもどき", 1000, 100);
        int skill = (int)(demoWarrior.attack * 1.5);
        int enemyHp;
        for(int i=0; i<3; i++){
            enemyHp = slime.hitPoint;
            demoWarrior.attackWithWeponSkill(slime);
            assertEquals(enemyHp - skill, slime.hitPoint);
        }
    }
}
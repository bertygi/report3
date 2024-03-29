package jp.ac.uryukyu.ie.e215706;

public class LivingThing {
    public String name;
    public int hitPoint;
    public int attack;
    public boolean dead;

    public LivingThing(String name, int hitPoint, int attack){
        this.name = name;
        this.hitPoint = hitPoint;
        this.attack = attack;
        this.dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, hitPoint, attack);
    }

    public boolean isDead(){
        return dead = true;
    }

    public String getName(){
        return name;
    }

    public void attack(LivingThing opponent){
        if ( !dead ){
            int damage = (int)(Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }

    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint <= 0 ) {
            dead = isDead();
            System.out.printf("%sは倒れた。\n", getName());
        }
    }
}

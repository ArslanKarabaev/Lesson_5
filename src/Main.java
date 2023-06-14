public class Main {
    public static void main(String[] args) {
    Boss boss = new Boss();
    boss.setBoosHealth(700);
    boss.setBossDamage(50);
    boss.setTypeOfDefence("Magical");
        System.out.println("Boss Statistic:");
        System.out.println("Health " + boss.getBoosHealth() + "; Damage " + boss.getBossDamage() + "; Type Of Defence " + boss.getTypeOfDefence());

        Hero[] heroes;
        heroes = createHeroes();
        for (int i = 0; i < 3; i++) {
            System.out.println("Hero's health " + heroes[i].getHealth() + " Hero's damage " + heroes[i].getDamage() + " Hero's SP " + heroes[i].getSuperPower());
        }
    }

    //дз на сообразительность
    public static  Hero[] createHeroes() {
        Hero hero1 = new Hero(250, 15, "Magical");
        Hero hero2 = new Hero(220, 10);
        Hero hero3 = new Hero(200, 20, "Mental");
        Hero[] heroes = {hero1, hero2, hero3};
        return heroes;

    }
}
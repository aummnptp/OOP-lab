
public abstract class Player {

    private double HP;
    private double MP;
    private double EXP;
    private double Money;
    private double ATK;

    public double getHP() {
        return HP;
    }

    public void setHP(double HP) {
        if (HP < 0.0) {
            System.out.println("Input must be positive integer");
        } else {
            this.HP = HP;
        }
    }

    public double getMP() {
        return MP;
    }

    public void setMP(double MP) {
        if (MP < 0.0) {
            System.out.println("Input must be positive integer");
        } else {
            this.MP = MP;
        }
    }

    public double getEXP() {
        return EXP;
    }

    public void setEXP(double EXP) {
        if (EXP < 0.0) {
            System.out.println("Input must be positive integer");
        } else {
            this.EXP = EXP;
        }
    }

    public double getMoney() {
        return Money;
    }

    public void setMoney(double Money) {
        if (Money < 0.0) {
            System.out.println("Input must be positive integer");
        } else {
            this.Money = Money;
        }
    }

    public double getATK() {
        return ATK;
    }

    public void setATK(double ATK) {
        if (ATK < 0.0) {
            System.out.println("Input must be positive integer");
        } else {
            this.ATK = ATK;
        }
    }

    public String toString() {
        return "HP :" + HP + " MP :" + MP + " ATK :" + ATK;
    }

    public abstract void attack(Player p);

    public abstract void attacked(double n);

}

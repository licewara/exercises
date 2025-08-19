package Personal;
import java.util.Random;
import java.util.Scanner;

public class Game{
   public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Personagem heroina = new Personagem();
        Personagem monstro = new Personagem();

        int movPointsH = 0;
        int movPointsM = 0;

        heroina.name = "Alice";
        System.out.print("Digite a quantidade HP da heroína: ");
        heroina.hp = sc.nextInt();
        System.out.print("Digite a quantidade de VEL da heroína: ");
        heroina.vel = sc.nextInt();

        monstro.name = "Slime";
        System.out.print("Digite a quantidade HP do monstro: ");
        monstro.hp = sc.nextInt();
        System.out.print("Digite a quantidade de VEL do monstro: ");
        monstro.vel = sc.nextInt();

        if (heroina.vel > monstro.vel){
            movPointsH += 1;
            monstro.hp -= heroina.attack();
            System.out.println("O HP do monstro agora é de " + monstro.hp + " pontos.");
        } else if (heroina.vel < monstro.vel){
            movPointsM += 1;
            heroina.hp -= monstro.attack();
            System.out.println("O HP da heroína agora é de " + heroina.hp + " pontos.");
        }

        do {
            if (movPointsH > movPointsM){
                heroina.hp -= monstro.attack();
                System.out.println("O HP da heroína agora é de " + heroina.hp + " pontos.");
                if (heroina.hp > 0 && monstro.hp > 0) {
                    monstro.hp -= heroina.attack();
                    System.out.println("O HP do monstro agora é de " + monstro.hp + " pontos.");
                }
            } else if (movPointsH < movPointsM){
                monstro.hp -= heroina.attack();
                System.out.println("O HP do monstro agora é de " + monstro.hp + " pontos.");
                if (heroina.hp > 0 && monstro.hp > 0){
                    heroina.hp -= monstro.attack();
                    System.out.println("O HP da heroína agora é de " + heroina.hp + " pontos.");
                }
            }

            if (heroina.hp <= 0) {
                System.out.println("A vitória é do monstro!");
            } else if (monstro.hp <= 0){
                System.out.println("A vitória é da heroína!");
            }
        } while (heroina.hp > 0 && monstro.hp > 0);
   }
}

class Personagem {

    public String name;
    public int hp;
    public int vel;


    int attack(){
        System.out.println("Ataque!");
        Random random = new Random();

        int min = 1;
        int max = 10;

        return random.nextInt((max - min) + 1) + min;
    }

}
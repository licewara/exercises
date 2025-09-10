package Personal;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Game{
   public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome da heroína: ");
        String nome_heroina = sc.nextLine();
        System.out.print("Digite a quantidade de HP da heroína: ");
        int hp_heroina = sc.nextInt();
        System.out.print("Digite a quantidade de VEL da heroína: ");
        int vel_heroina = sc.nextInt();


        sc.nextLine();
        System.out.print("Digite o nome do monstro: ");
        String nome_monstro = sc.nextLine();
        System.out.print("Digite a quantidade de HP do monstro: ");
        int hp_monstro = sc.nextInt();
        System.out.print("Digite a quantidade de VEL do monstro: ");
        int vel_monstro = sc.nextInt();

        Personagem heroina = new Heroi(nome_heroina, hp_heroina, vel_heroina);
        Personagem monstro = new Monstro(nome_monstro, hp_monstro, vel_monstro);

        int movPointsH = 0;
        int movPointsM = 0;

        if (heroina.vel > monstro.vel){
            System.out.println("===================================");
            System.out.println("A heroína começa atacando!");
            movPointsH += 1;
        } else if (heroina.vel < monstro.vel){
            System.out.println("===================================");
            System.out.println("O monstro começa atacando!");
            movPointsM += 1;
        }

        do {
            if (movPointsH > movPointsM){
                System.out.println("===================================");
                System.out.println("Escolha a ação da heroína [1 para ATACAR e 2 para CURAR]: ");
                int escolha = sc.nextInt();
                if (escolha == 1){
                    monstro.hp -= heroina.attack();
                    System.out.println("O HP do monstro agora é de " + monstro.hp + " pontos.");
                } else if (escolha == 2){
                    heroina.hp += heroina.heal();
                    System.out.println("O HP da heroína agora é de " + heroina.hp + " pontos.");
                }
                escolha = 0;
                movPointsM += 2;
                
            } else if (movPointsH < movPointsM){
                System.out.println("===================================");
                System.out.println("Escolha a ação do monstro [1 para ATACAR e 2 para CURAR]: ");
                int escolha = sc.nextInt();
                if (escolha == 1 ){
                    heroina.hp -= monstro.attack();
                    System.out.println("O HP da heroína agora é de " + heroina.hp + " pontos.");
                } else if (escolha == 2){
                    monstro.hp += monstro.heal();
                    System.out.println("O HP do monstro agora é de " + monstro.hp + " pontos.");
                }
                escolha = 0;
                movPointsH += 2;
            }

            if (heroina.hp <= 0) {
                System.out.println("===================================");
                System.out.println("A vitória é de " + monstro.name + "!");
                System.out.println("===================================");
                
            } else if (monstro.hp <= 0){
                System.out.println("===================================");
                System.out.println("A vitória é de " + heroina.name + "!");
                System.out.println("===================================");
                
            }
        } while (heroina.hp > 0 && monstro.hp > 0);

        sc.close();
   }
}

class Personagem {

    public String name;
    public int hp;
    public int vel;

    public Personagem(String name, int hp, int vel) {

        this.name = name;
        this.hp = hp;
        this.vel = vel;

    }

    int attack(){
        System.out.println("Ataque!");
        Random random = new Random();

        int min = 1;
        int max = 10;

        return random.nextInt((max - min) + 1) + min;
    }

    int heal(){
        System.out.println("Cura!");
        Random random = new Random();

        int min = 1;
        int max = 6;

        return random.nextInt((max - min) + 1 ) + min;
    }

}

class Monstro extends Personagem{

    public Monstro(String name, int hp, int vel) {

        super(name, hp, vel);
    }

    @Override
    int attack(){
        System.out.println("Ataque do Monstro!");
        Random random = new Random();

        int min = 1;
        int max = 10;

        return random.nextInt((max-min) + 1) + min;
    }

    @Override
    int heal(){
        System.out.println("Cura do Monstro!");
        Random random = new Random();

        int min = 1;
        int max = 6;

        return random.nextInt((max - min) + 1 ) + min;
    }
}

class Heroi extends Personagem {

    public ArrayList<String> inventario = new ArrayList<String>();

    public Heroi(String name, int hp, int vel) {
        super(name, hp, vel);
    }

    public void addItem(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do item a ser adicionado: ");
        String item = sc.nextLine();
        inventario.add(item);
        System.out.println("Item " + item + " adicionado ao inventário.");
        sc.close();
    }

    public void usarItem(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do item a ser usado: ");
        String item = sc.nextLine();
        if (inventario.contains(item)){
            inventario.remove(item);
            System.out.println(item + " usado.");
        } else {
            System.out.println(item + " não encontrado no inventário.");
        }
        sc.close();
    }

    @Override
    int attack(){
        System.out.println("Ataque do Herói!");
        Random random = new Random();

        int min = 1;
        int max = 10;

        return random.nextInt((max-min) + 1) + min;
    }

    @Override
    int heal(){
        System.out.println("Cura do Herói!");
        Random random = new Random();

        int min = 1;
        int max = 6;

        return random.nextInt((max - min) + 1 ) + min;
    }
}
import java.io.IOException;
import java.util.Scanner;

public class Animals {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        String animalType1 = sc.nextLine();
        String animalType2 = sc.nextLine();
        String animalType3 = sc.nextLine();
        String animal = "aaaaaaaa";

        animalType1 = animalType1.toLowerCase();
        animalType1 = animalType1.trim();

        animalType2 = animalType2.toLowerCase();
        animalType2 = animalType2.trim();

        animalType3 = animalType3.toLowerCase();
        animalType3 = animalType3.trim();

        if (animalType1.equals("vertebrado")){
            if (animalType2.equals("ave")){
                if (animalType3.equals("carnivoro")){
                    animal = "aguia";
                } else if (animalType3.equals("onivoro")){
                    animal = "pomba";
                }
            } else if (animalType2.equals("mamifero")){
                if (animalType3.equals("onivoro")){
                    animal = "homem";
                } else if (animalType3.equals("herbivoro")){
                    animal = "vaca";
                }
            }
        } else if (animalType1.equals("invertebrado")){
            if (animalType2.equals("inseto")){
                if (animalType3.equals("hematofago")){
                    animal = "pulga";
                } else if (animalType3.equals("herbivoro")){
                    animal = "lagarta";
                }
            } else if (animalType2.equals("anelideo")){
                if (animalType3.equals("hematofago")){
                    animal = "sanguessuga";
                } else if (animalType3.equals("onivoro")){
                    animal = "minhoca";
                }
            }
        }

        System.out.println(animal);

        sc.close();

    }

}
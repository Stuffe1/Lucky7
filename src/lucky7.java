import java.util.Random;


public class lucky7 {
    public static void main(String[] args) throws Exception {
        
        Random random = new Random();

        int luku1 = random.nextInt(10) + 1;
        int luku2 = random.nextInt(10) + 1;
        int luku3 = random.nextInt(10) + 1;
        System.out.println( luku1 + ", " + luku2 +  ", " +  luku3);   

        if (luku1 == 7 || luku2 == 7 || luku3 == 7){
            System.out.println("Onnittelut!");
    
        } else  {
        System.out.println("Hävisit!");

    }


    }
}

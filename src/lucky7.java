import java.util.Random;


public class lucky7 {
    public static void main(String[] args) throws Exception {
        
        Random random = new Random();
        int i = 5;
        while (i >0){
            System.out.println("sinulla on " + i + " Euroa");
            System.out.println("Maksoit 1 Euron");
            i --;
        
            int luku1 = random.nextInt(10) + 1;
            int luku2 = random.nextInt(10) + 1;
            int luku3 = random.nextInt(10) + 1;

            System.out.println( luku1 + ", " + luku2 +  ", " +  luku3);   
        
            int seiska = 0;
            if (luku1 == 7) seiska++;
            if (luku2 == 7) seiska++;
            if (luku3 == 7) seiska++;

            if (seiska == 1){
                i +=3;
                System.out.println("Voitit 3 Euroa");
            }else if(seiska == 2){
                i +=5;
                System.out.println("Voitit 5 Euroa");
            }else if(seiska == 3){
            i +=5;
            System.out.println("Voitit 10 Euroa");
            }else{
                System.out.println("Ei voittoa"); 
         }
        }
        System.out.println("Peli päättyi");{

        }
}
}

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kalle
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        String[]  numbers = scan.nextLine().split(" ");
        int nummer1 = Integer.parseInt(numbers[0]);
        int nummer2 = Integer.parseInt(numbers[1]);
        int nummer3 = Integer.parseInt(numbers[2]);
        
        int störstaNumret;
        
        if (nummer1>nummer2 && nummer1>nummer3){
            störstaNumret = nummer1;
            
        } else if (nummer2>nummer1 && nummer2>nummer3){
            störstaNumret = nummer2;
        }else{
            störstaNumret = nummer3;
        }
        
        int mellanNumret;
        if (nummer1>nummer2 && nummer1<nummer3){
            mellanNumret = nummer1;
        }else if (nummer1<nummer2 && nummer1>nummer3){
             mellanNumret = nummer1;
        }else if(nummer2>nummer1 && nummer2<nummer3){
            mellanNumret = nummer2;
        }else if (nummer2<nummer1 && nummer2>nummer3){
            mellanNumret = nummer2;
        }else{
            mellanNumret = nummer3;
        }
        
        int minstNumret;
        if (mellanNumret != nummer1 && störstaNumret != nummer1){
            minstNumret = nummer1;
        }else if (mellanNumret != nummer2 &&  störstaNumret != nummer2){
            minstNumret = nummer2;
        }else{
            minstNumret = nummer3;
        }
        
        
        
        String abc = scan.nextLine();
        
        if (abc.equals("ABC")){
            System.out.println(minstNumret + " "+ mellanNumret + " "+ störstaNumret);
        }else if (abc.equals("ACB")){
            System.out.println(minstNumret + " " + störstaNumret + " " + mellanNumret);
        }else if(abc.equals("CBA")){
            System.out.println(störstaNumret + " " + mellanNumret + " " + minstNumret);
        }else if(abc.equals("BAC")){
            System.out.println(mellanNumret + " " + minstNumret + " " + störstaNumret);
        }else if (abc.equals("CAB")){
            System.out.println(störstaNumret + " " + minstNumret + " " + mellanNumret);
        }else if (abc.equals("BCA")){
            System.out.println(mellanNumret + " " + minstNumret + " " + störstaNumret);
        }
        
        
        
    }
    
}

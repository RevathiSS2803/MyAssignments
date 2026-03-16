package orrg.study.org.week2;

public class Pime_number_check {
public static void main(String[] args) {
    int num = 10;
    while(num <= 100)
    {

    boolean isPrime = true;

        for(int i =2; i < num; i++)
        {
        if(num % i == 0) {
            isPrime = false;
            break;
        }
    
    }
    if(isPrime)
    {

    System.out.println( "GIVEN NUMBER IS PRRIME:" +num );
    }
    else
    {
       System.out.println( "given number is not prime:" +num ); 
    }
    num++;
}

}
    
    
}



   

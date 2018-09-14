package Mavenproject.project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App 
{
    public static void main( String[] args )
    {
        int a=4,b=5,c;
        c=a+b;
        System.out.println(c);
        WebDriver driver=new ChromeDriver();
        driver.get("http:/google.com");
        String s ;
       s= driver.getCurrentUrl();
        System.out.println(s);
        
        
        
        
    }
}

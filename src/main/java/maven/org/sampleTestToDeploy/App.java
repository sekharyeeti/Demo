package maven.org.sampleTestToDeploy;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    
         
    
     //   File pathToBinary = new File("C:\\Eclipse\\workspace\\w2\\sampleTestToDeploy\\target\\chromedriver.exe");
    	System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\workspace\\w2\\sampleTestToDeploy\\target\\chromedriver.exe");
    	WebDriver drv = null;
    	ChromeOptions ChromeOptions=new ChromeOptions();
    	ChromeOptions.addArguments("--headless");
    	drv= new ChromeDriver(ChromeOptions);
    	drv.get("https://facebook.com");

    
    }
}

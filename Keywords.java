import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	

	public class Keywords {
		static WebDriver driver;
		static FileInputStream file ;
		static Properties prop;
		
		
		
	public void openbrowser(String data )throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikesh.raikar\\Downloads\\chromedriver_win32\\chromedriver.exe");  
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 file=new FileInputStream("C:\\Users\\nikesh.raikar\\Desktop\\Java-dev-auto\\SeleniumAutomation\\ObjectRepository.properties");
		   prop= new Properties();
	   prop.load(file);
	   
		 
		
	}

		
	public void navigate(String data)
	{
			System.out.println(data);
			driver.get(data);
	}


	public void input(String objectname , String data  )
	{
		driver.findElement(By.xpath(prop.getProperty(objectname))).sendKeys(data);
	 
	}




	public void click(String objectname)

	{
		driver.findElement(By.xpath(prop.getProperty(objectname))).click();
	}

	 public String verifyTittle()
	 {
		 
		 String tittle = driver.getTitle();
		
		 return tittle;
		 
	 }




	}



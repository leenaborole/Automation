package dbConnection;

import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.io.InputStream;
	import java.io.OutputStream;
import java.util.Objects;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
	public class FreeSpins {
	
	public static void main(String[] args) throws IOException, InterruptedException
	{
	
		String driverPath = "E:/seleniumfiles/geckodriver-v0.16.1-win64/geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", driverPath);
		
		WebDriver webDrvr = new FirefoxDriver();
		String appUrl = "https://mobilewebserver9-mobiletesting02.installprogram.eu/MobileWebGames/game/mgs/9_3_1_6524?lobbyURL=https%3A%2F%2Fmobilewebserver9-mobiletesting02.installprogram.eu%2FLobby%2Fen%2FIslandParadise%2FGames%2F3ReelSlots&moduleID=10025&clientID=40300&gameName=thunderstruck&gameTitle=Thunderstruck&LanguageCode=en&clientTypeID=40&casinoID=5007&lobbyName=IslandParadise&loginType=PlayerService&bankingURL=https%3A%2F%2Fmobilewebserver9-mobiletesting02.installprogram.eu%2FLobby%2Fen%2FIslandParadise%2FBanking&xmanEndPoints=https%3A%2F%2Fmobilewebserver9-mobiletesting02.installprogram.eu%2FXMan%2Fx.x&routerEndPoints=&disablePoweredBy=false&currencyFormat=&isPracticePlay=false&logoutURL=https%3A%2F%2Fmobilewebserver9-mobiletesting02.installprogram.eu%2FLobby%2Fen%2FIslandParadise%2FLogout&host=Desktop&apiCommsEnabled=false&activityStatementURL=undefined&username=yuvrajk&password=test";
		webDrvr.get(appUrl);
		Thread.sleep(1000);
		
	
		
        webDrvr.findElement(By.xpath("//*[@.id='txtBalanceVal']")).click();
		 String CreditsBefore=webDrvr.findElement(By.xpath("//*[@id='txtBalanceVal']")).getText();
		 Thread.sleep(1000);
		 
		 webDrvr.findElement(By.xpath("//*[@id='txtSpin']")).click();
		 Thread.sleep(3000);
		 
		 WebDriverWait wait = new WebDriverWait(webDrvr, 60); 
		 
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='txtBalanceVal']")));
		
		if(webDrvr.findElement(By.xpath("//*[@id='txtBalanceVal']")).isDisplayed())
		{
			String CreditsAfter=webDrvr.findElement(By.xpath("//*[@id='txtBalanceVal']")).getText();
			
			System.out.println(Objects.equals(CreditsBefore, CreditsAfter));
		}
		else
		{
			System.out.println("credits not added");
		}
			
		 
	}

}
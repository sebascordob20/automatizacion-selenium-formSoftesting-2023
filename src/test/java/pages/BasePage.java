package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	private WebDriver driver;
	private WebDriverWait wait;
	/*Tanto para la variable tipo_driver y ruta_driver se asignan los valores de una vez en la declaración 
	 y se definen de tipo constantes con la palabra final para promover buenas practicas.
	*/
	private final String tipo_driver="webdriver.chrome.driver";
	private final String ruta_driver="src/test/resources/driver/chromedriver.exe";
	

public BasePage(WebDriver driver) {
this.driver = driver;
}
	
}

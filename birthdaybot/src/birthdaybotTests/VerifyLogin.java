/**
 * 
 */
package birthdaybotTests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
/**
 * @author mop
 *
 */
public class VerifyLogin {
	
	WebDriver driver;

	@Test
	public void verifyValidLogin() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/mop/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://birthdaybot.mop.ba/");

		Cookie ck1 = new Cookie.Builder("login-session.sig", "W_Qc4Waz2MsDK0INF1mn-cbFvKY").domain(".mop.ba").build();;
		Cookie ck2 = new Cookie.Builder("login-session", "eyJwYXNzcG9ydCI6eyJ1c2VyIjp7InByb3ZpZGVyIjoiZ29vZ2xlIiwic3ViIjoiMTA5NTc4NTM0OTE2OTc1MDkyNDIzIiwiaWQiOiIxMDk1Nzg1MzQ5MTY5NzUwOTI0MjMiLCJkaXNwbGF5TmFtZSI6IkZhcmlzIEJla3RhcyIsIm5hbWUiOnsiZ2l2ZW5OYW1lIjoiRmFyaXMgIiwiZmFtaWx5TmFtZSI6IkJla3RhcyJ9LCJnaXZlbl9uYW1lIjoiRmFyaXMgIiwiZmFtaWx5X25hbWUiOiJCZWt0YXMiLCJlbWFpbF92ZXJpZmllZCI6dHJ1ZSwidmVyaWZpZWQiOnRydWUsImxhbmd1YWdlIjoiZW4iLCJlbWFpbCI6ImZhcmlzLmJla3Rhc0BtaW5pc3RyeW9mcHJvZ3JhbW1pbmcuY29tIiwiZW1haWxzIjpbeyJ2YWx1ZSI6ImZhcmlzLmJla3Rhc0BtaW5pc3RyeW9mcHJvZ3JhbW1pbmcuY29tIiwidHlwZSI6ImFjY291bnQifV0sInBob3RvcyI6W3sidmFsdWUiOiJodHRwczovL2xoMy5nb29nbGV1c2VyY29udGVudC5jb20vYS9BQVRYQUp4UTZ0QkZrUXI3Rk53N1dYMmpvX3hEVWRMWm5ERDNDVm05R2RjTj1zOTYtYyIsInR5cGUiOiJkZWZhdWx0In1dLCJwaWN0dXJlIjoiaHR0cHM6Ly9saDMuZ29vZ2xldXNlcmNvbnRlbnQuY29tL2EvQUFUWEFKeFE2dEJGa1FyN0ZOdzdXWDJqb194RFVkTFpuREQzQ1ZtOUdkY049czk2LWMiLCJfcmF3Ijoie1xuICBcInN1YlwiOiBcIjEwOTU3ODUzNDkxNjk3NTA5MjQyM1wiLFxuICBcIm5hbWVcIjogXCJGYXJpcyBCZWt0YXNcIixcbiAgXCJnaXZlbl9uYW1lXCI6IFwiRmFyaXMgXCIsXG4gIFwiZmFtaWx5X25hbWVcIjogXCJCZWt0YXNcIixcbiAgXCJwaWN0dXJlXCI6IFwiaHR0cHM6Ly9saDMuZ29vZ2xldXNlcmNvbnRlbnQuY29tL2EvQUFUWEFKeFE2dEJGa1FyN0ZOdzdXWDJqb194RFVkTFpuREQzQ1ZtOUdkY05cXHUwMDNkczk2LWNcIixcbiAgXCJlbWFpbFwiOiBcImZhcmlzLmJla3Rhc0BtaW5pc3RyeW9mcHJvZ3JhbW1pbmcuY29tXCIsXG4gIFwiZW1haWxfdmVyaWZpZWRcIjogdHJ1ZSxcbiAgXCJsb2NhbGVcIjogXCJlblwiLFxuICBcImhkXCI6IFwibWluaXN0cnlvZnByb2dyYW1taW5nLmNvbVwiXG59IiwiX2pzb24iOnsic3ViIjoiMTA5NTc4NTM0OTE2OTc1MDkyNDIzIiwibmFtZSI6IkZhcmlzIEJla3RhcyIsImdpdmVuX25hbWUiOiJGYXJpcyAiLCJmYW1pbHlfbmFtZSI6IkJla3RhcyIsInBpY3R1cmUiOiJodHRwczovL2xoMy5nb29nbGV1c2VyY29udGVudC5jb20vYS9BQVRYQUp4UTZ0QkZrUXI3Rk53N1dYMmpvX3hEVWRMWm5ERDNDVm05R2RjTj1zOTYtYyIsImVtYWlsIjoiZmFyaXMuYmVrdGFzQG1pbmlzdHJ5b2Zwcm9ncmFtbWluZy5jb20iLCJlbWFpbF92ZXJpZmllZCI6dHJ1ZSwibG9jYWxlIjoiZW4iLCJoZCI6Im1pbmlzdHJ5b2Zwcm9ncmFtbWluZy5jb20iLCJkb21haW4iOiJtaW5pc3RyeW9mcHJvZ3JhbW1pbmcuY29tIn19fX0=").domain(".mop.ba").build();;
		Cookie ck3 = new Cookie.Builder("user", "109578534916975092423").domain(".mop.ba").build();
		driver.manage().addCookie(ck1);
		driver.manage().addCookie(ck2);
		driver.manage().addCookie(ck3);
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(3));
		driver.get("https://birthdaybot.mop.ba/happyboard");
		
		Set<Cookie> cookiesList =  driver.manage().getCookies();
		for(Cookie getcookies :cookiesList) {
		    System.out.println(getcookies );
		}
		
	}
	
	public VerifyLogin(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
}

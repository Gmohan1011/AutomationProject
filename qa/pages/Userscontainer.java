package com.actitime.qa.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.actitime.qa.Base.TestBase;

public class Userscontainer extends TestBase {
	@FindBy(xpath="//div[@class='pagetitle']")
	public WebElement userPagetitle;
	
	@FindBy(xpath="//div[@class='components_button withPlusIcon']")
	public WebElement newUser;
	
	@FindBy(xpath="(//div[@class='userName nameInfo ellipsis'])[2]")
	public WebElement newHeader;
	
    @FindBy(xpath="(//input[@class='firstNameField inputFieldWithPlaceholder'])[2]")
     public WebElement firstName;
    
    
    @FindBy(xpath="(//input[@class='lastNameField inputFieldWithPlaceholder'])[2]")
    public WebElement lastName;
    
    
    @FindBy(xpath="(//input[@placeholder='Email'])[3]")
    public WebElement Email;
    
    @FindBy(xpath="(//div[@class='selector'])[2]")
    public WebElement departMentButton;
    
    
    @FindBy(xpath="//div[@class='itemsContainer']/div")
    public List<WebElement> DepartmentList;
    
    @FindBy (xpath="(//div[@class='valueCell hireDateValueCell'])[3]")                                            //(xpath="//button[@id='ext-gen610']/../../../..//td/em/button")
    public WebElement hireDate;
    
    @FindBy(xpath="//div[@class='components_switcher small off animated']/../div")
    public WebElement timeTrakToggle;
    
    
    @FindBy(xpath="(//span[@class='checkmark '])[3]")
    public WebElement checkBoxUsecoporate;
    
    
    @FindBy(xpath="//button[@id='ext-gen463']/parent::em/button")
    public WebElement timeTrackDropDwn;
    
    
    @FindBy(xpath="(//a[@class='x-menu-focus']/../ul/li)")
    public List<WebElement> timetrackDD;
    
    
    @FindBy(xpath="(//div[@class='addRecordButton'])[3]")
    public WebElement addRate;
    
    @FindBy(xpath="(//div[@class='rateCell'])[1]")
    public WebElement regularRate;
    
    @FindBy(xpath="//div[text()='Save & Send Invitation']")
    public WebElement saveandsend;
    
    @FindBy(xpath="(//div[@class='closeLink'])[1]")
    public WebElement closebutton;
    
    @FindBy(xpath="(//span[@class='ui-button-text'])[7]")
    public WebElement ok;
    
    
    
    public Userscontainer()
    {
    	PageFactory.initElements(driver, this);
    }
    
    public void getHeaderTitle()
    {
    	userPagetitle.getText();
    }
    
    public String headerNewUser()
    {
    	return newHeader.getText();
    }
    
    public void addnewuser(String name,String intial,String email,String deptmnt)
    {
    	//newUser.click();
    	
    	firstName.sendKeys(name);
    	lastName.sendKeys(intial);
    	Email.sendKeys(email);
    	 
    	
    	departMentButton.click();
            for (WebElement list : DepartmentList) {
        	 if(list.getText().equals(deptmnt))
        	 {
        		 list.click();
        	 }
			
		      }
            
       try { 
            
            hireDate.click();
    	}
    	catch(StaleElementReferenceException e)
    	{
    		 hireDate.click();
    	}
          
            
          
            
          // WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(400));
     	  // wait.until(ExpectedConditions.visibilityOf(addRate));    
           
     	  
     	  
          Calanderhandle.calander(); 
        
         Actions as=new Actions(driver);
        as.scrollToElement(addRate).perform();
        
        timeTrakToggle.click();
        
        checkBoxUsecoporate.click();
        
        Actions ass=new Actions(driver);
        as.scrollToElement(addRate).perform();
       
        
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(400));
   	   wait.until(ExpectedConditions.elementToBeClickable( timeTrackDropDwn)).click(); 
   	 
   //WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(50));
   //wait1.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//table[@id='ext-comp-1552']")));
        
        //timeTrackDropDwn.click();
        for (WebElement timetrack : timetrackDD) {
        	
        	try{
        		if(timetrack.getText().equals("Calculate automatically,hidden from the user"))
        	    // WebDriverWait wait2=new WebDriverWait(driver,Duration.ofSeconds(150));
        		// wait2.until(ExpectedConditions.elementToBeClickable(timetrack)).click();
			   timetrack.click(); 
        	}
        	
        	catch(Exception e)
        	{
        		if(timetrack.getText().equals("Calculate automatically,hidden from the user"))
        		timetrack.click();
        	}
        }
        
        	
        
        	
        	// Actions ac=new Actns(driver);
            // as.scrollToElement(addRate).perform();
         
        	/* addRate.click(); 
        	 
        	 try {
        		 
        	 
        	 regularRate.sendKeys("8");
        	 }
        	 catch(Exception e)
        	 {
        		 regularRate.sendKeys("8"); 
        	 }*/
        	 
        	
         
        	 
        	 
        	 
        	 saveandsend.click();
        	 
        	 ok.click();
        	 
        	 closebutton.click();
         
         
    	
    
    	}
    	
    	
    }
   
     
    
	
	



package parameteriztion;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.comcast.genericLib.FileLib;

public class Amazon {
	@Test(dataProvider="setdataToCart")
	public void addToCart(String prdt,String qty) {
	System.out.println("add t cart==>"+prdt+","+qty);
	
	}
	
	
	
	
	
@DataProvider
public Object[][] setdataToCart() throws EncryptedDocumentException, IOException{
	FileLib fLib=new FileLib();
	int rowcount=fLib.getRowCount("Sheet2");
 Object[][] objarr=new Object[rowcount][2];
 for(int i=1;i<rowcount;i++) {
	 objarr[i][0]=fLib.getExcelData("Sheet2", i, 0);
	 objarr[i][1]=fLib.getExcelData("Sheet2", i, 1);
 }
	
	
	
	
	return objarr;
	
}
  
}

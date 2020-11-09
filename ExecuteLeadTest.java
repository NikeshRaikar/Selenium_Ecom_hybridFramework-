import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import junit.framework.Assert;



public class ExecuteLeadTest {
	
	@Test
	public void leadTestOLX ()throws Exception 
	{
		
		Keywords key = new Keywords();
		ArrayList arraydata = new ArrayList ();
		FileInputStream file = new FileInputStream("C:\\Users\\nikesh.raikar\\Desktop\\Java-dev-auto\\LeadTestSuite.xlsx");
		XSSFWorkbook wbks = new XSSFWorkbook(file);
		XSSFSheet s = wbks.getSheet("TestSteps");
		Iterator itr = s.iterator();
	
		
		while(itr.hasNext())
		{
			
			Row rowitr = (Row)itr.next();
			Iterator cellitr = rowitr.cellIterator();
			
			while (cellitr.hasNext())
			{
				
				
				Cell celldata = (Cell) cellitr.next();
				  switch(celldata.getCellType()) {
		            case STRING:
		            	arraydata.add(celldata.getStringCellValue());
		                break;
		            case NUMERIC:
		            	arraydata.add(celldata.getNumericCellValue());
		                break;
		            case BOOLEAN:
		            	arraydata.add(celldata.getBooleanCellValue());
		                break;
		            }
		        }
		    }

		    for (int i=0;i<arraydata.size();i++) {
		    	 
		    	if(arraydata.get(i).equals("openbrowser")) {
			        	String keyword=(String) (arraydata.get(i));
			            String data=(String)(arraydata.get(i+1));
			            String objectname=(String) (arraydata.get(i+2));
			            String runmode=(String) (arraydata.get(i+3)); 
			            System.out.println(keyword);
			            System.out.println(data);
			            System.out.println(objectname);
			            System.out.println(runmode);
			            key.openbrowser( data);
			        }
		        if(arraydata.get(i).equals("navigate")) {
		        	String keyword=(String) (arraydata.get(i));
		            String data=(String)(arraydata.get(i+1));
		            String objectname=(String) (arraydata.get(i+2));
		            String runmode=(String) (arraydata.get(i+3)); 
		            System.out.println(keyword);
		            System.out.println(data);
		            System.out.println(objectname);
		            System.out.println(runmode);
		            key.navigate(data);
		        }
		        if(arraydata.get(i).equals("click")) {
		        	String keyword=(String) (arraydata.get(i));
		            String data=(String)(arraydata.get(i+1));
		            String objectname=(String) (arraydata.get(i+2));
		            String runmode=(String) (arraydata.get(i+3)); 
		            System.out.println(keyword);
		            System.out.println(data);
		            System.out.println(objectname);
		            System.out.println(runmode);
		            key.click(objectname);
		          
		            
		        }
		        
		        
		        if(arraydata.get(i).equals("input")) {
		        	String keyword=(String) (arraydata.get(i));
		            String data=(String)(arraydata.get(i+1));
		            String objectname=(String) (arraydata.get(i+2));
		            String runmode=(String) (arraydata.get(i+3)); 
		            System.out.println(keyword);
		            System.out.println(data);
		            System.out.println(objectname);
		            System.out.println(runmode);
		            key.input(objectname, data);
		}
		       
		        if(arraydata.get(i).equals("verifyTittle")) {
		        	String keyword=(String) (arraydata.get(i));
		            String data=(String)(arraydata.get(i+1));
		            String objectname=(String) (arraydata.get(i+2));
		            String runmode=(String) (arraydata.get(i+3)); 
		            System.out.println(keyword);
		            System.out.println(data);
		            System.out.println(objectname);
		            System.out.println(runmode);
		           String actualValue = key.verifyTittle();
		           Assert.assertEquals(data, actualValue);
		}
		}       
		}
	

}



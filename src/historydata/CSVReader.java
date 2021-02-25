package historydata;

import java.util.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Paths;
import java.util.ArrayList;

import javax.swing.JFileChooser;

public class CSVReader {
	
	private File file;
	private BufferedReader bufferedReader;
	private boolean isFileFound = false;
	
	/**
	 * Get CSV/XLSX file for data
	 * Store file in buffer for future data extraction
	 */
	public CSVReader() {
		
		try {
			//file = getFile();
			//if(file.exists() || file.isFile()) {
			file = new File("/Users/figueroag/projects/courses/AI-master/Eclipse_Import/info.scce.addlib.mide.HistoryData/data/HistoryData_project.csv");
				isFileFound = true;
				bufferedReader = new BufferedReader(new FileReader(file));
			//}
		}catch(Exception e) {
			System.out.print("No file selected/found!!!");
		}
	}
	
	/**
	 * Choose csv/xlsx file for input
	 * 
	 * @return
	 */
	private File getFile() {
		String filePath = "";
		
		try {
			JFileChooser chooser = new JFileChooser(Paths.get(".").toAbsolutePath().normalize().toString()+"/data");
			
			// invoke the showsOpenDialog function to show the save dialog 
            int r = chooser.showOpenDialog(null); 
  
            // if the user selects a file, set path
            if (r == JFileChooser.APPROVE_OPTION) {
                filePath = chooser.getSelectedFile().getAbsolutePath();
                
                //Check extension
                String extension = filePath.substring(filePath.length()-4);
                System.out.println(extension);
                
                if(!extension.contains("csv") && !extension.contains("xls")){
                	System.out.println("Please choose the designated CSV/XLS file only.");
                	getFile();
                }        	
            }
      
		}catch(Exception e) {
			System.out.println(e.getStackTrace());
			return new File("");
		}		
		return new File(filePath);
	}
	
	
	/**
	 * Return boolean whether file was found for data
	 * @return
	 */
	public boolean isFileFound() {
		return isFileFound;
	}
	
	
	/**
	 * Put data from CSV file into arrays
	 * Add arrays of data to List
	 * return list
	 * @return
	 */
	public List<String[]> getData() {
		List<String[]> completeDataset = new ArrayList<String[]>();
		String[] data;
		String line;
		
		try {
			while ((line = bufferedReader.readLine()) != null) {
				if (line != null && (!line.trim().equals("") || !line.trim().equals("\n"))) {
					data = line.split(",");
					completeDataset.add(data);
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return completeDataset;
	}
	
	

}

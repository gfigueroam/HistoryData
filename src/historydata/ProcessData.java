package historydata;

import java.util.List;

public class ProcessData {

	private List<String[]> data;
	private int size;

	public ProcessData(List<String[]> data) {
		this.data = data;
		this.size = data.size();
	}

	public List<String[]> getData() {
		return data;
	}
	
	public int getSize() {
		return this.size;
	}

	public String[] getCurrentRow(int row) {
		return this.data.get(row);
	}
	
	/**
	 * TEMP-ANONYMISE DATA FOR HISTORY
	 * -------------------------------
	 * id number scramble
	 * first name - john/jane
	 * second name - doe
	 * name informant - john/jane doe
	 * residence of informant - abc lane
	 * name of registrar
	 */
	public void anonymoiseData() {
		
		String [] valueStrings;
		String id, firstName, secondName, informantName, informantResidence, registrarName;
		for(int i=1;i<size;i++) {
			valueStrings = getCurrentRow(i);
			id = valueStrings[0];
			String newIDString = "";
			
			 //ID Scramble
			if(!isNullEntry(id) && isNumeric(id)) {
				for(int j=0;j<id.length();j++) {
					int x = Integer.parseInt(id.substring(j,j+1));
					
					if(x == 0 || x == 9)
						x = 1;
					else
						x++;
					
					newIDString+=x;
					
				}
			valueStrings[0] = newIDString;	
			}
			
			//First Name
			
			//Second Name
			
			//Name of Informant
			
			//Residence of Informant
			
			//Name of Registrar
			
		}
		
	}
	
	
	/**
	 * Check if value is numeric 
	 * Set isNumeric boolean predicate
	 * 
	 * @param id
	 */
	public boolean isNumeric(String input) {
		if (isNullEntry(input))
				return false;
		try {
			Long.parseLong(input);
			return true;
		} catch (NumberFormatException nfe) {
			return false;
		}
	}
	
	/**
	 * Check if input is Null or Empty string
	 * @param text
	 * @return
	 */
	public boolean isNullEntry(String input) {
		if(input.equals(null)||input.equals(""))
			return true;
		return false;
	}

}

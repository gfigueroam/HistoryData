package historydata;

import java.text.ParseException;

import historydata.Predicates;

/**
 * Change Predicates
 * 
 * @author PC
 *
 */
public class HistoryData implements Predicates {

	private boolean isValidIDFormat, isNumeric, isMale, isFemale, isValidAge, isMarried, isBachelor, isWidower, isSingle, 
	isPresentAtDeath, isNotPresentAtDeath, isValidInformant,
	isQualifiedInformant, isValidInformantAddress, isRegistrationOutOfDate, 
	isValidForename, isValidSurname; //isCertified, isUncertified,isValidCauseOfDeath,
	private StringBuilder builder;

	public HistoryData() {
		builder = new StringBuilder();
		builder.append("\n---------------------\nHistory Input:\n");
		builder.append("1.Registration ID\n");
	}

	
	@Override
	public synchronized String toString() {
		//String nl = System.lineSeparator();
		return builder.toString();
	}

	/**
	 * Check if value is numeric 
	 * Set isNumeric boolean predicate
	 * 
	 * @param id
	 */
	public void setIsNumeric(String input) {
		if (isNullEntry(input))
				isNumeric = false;
		try {
			Long.parseLong(input);
			isNumeric = true;
		} catch (NumberFormatException nfe) {
			isNumeric = false;
		}
		
		builder.append("	isNumeric: " + isNumeric + "\n");
	}

	@Override
	public boolean isNumeric() {
		return isNumeric;
	}

	/**
	 * Set Valid Format boolean for IDs Currently only values less that 10 million
	 * are valid (removes student IDs)
	 * 
	 * @param id
	 */
	public void setIsValidIDFormat(String id) {
		setIsNumeric(id);
		if (isNumeric) {
			if (Long.parseLong(id.trim()) < 10000000)
				isValidIDFormat = true;
		}
		
		builder.append(" 	isValidIDFormat: " + isValidIDFormat + "  -> " + id + "\n");
	}

	@Override
	public boolean isValidIDFormat() {
		return isValidIDFormat;
	}

	
	/**
	 * Set the Sex of the Input
	 * @param text
	 */
	public void setIsValidSex(String input) {		
		if(!isNullEntry(input))
		{	
			if(input.trim().toLowerCase().equals("m"))
				isMale = true;
			
			if(input.trim().toLowerCase().equals("f"))
				isFemale = true;
		}
		builder.append("2.Sex\n 	isMale: " + isMale + "\n" + " 	isFemale: " + isFemale + "\n");
	}
	
	
	@Override
	public boolean isMale() {
		return isMale;
	}
		
	@Override
	public boolean isFemale() {
		return isFemale;
	}

	
	/**
	 * Check if Age value is valid
	 * Any age >=0 && <=130
	 * @param age
	 */
	public void setIsValidAge(String input) {
		builder.append("\n3.Deceased Age\n");
		setIsNumeric(input);
		if(isNumeric) {
			long age  = Long.parseLong(input.trim());
			if(age <= 130 && age >=0)
				isValidAge = true;
		}	
		builder.append(" 	isValidAge: " + isValidAge + "\n");
	}
	
	
	@Override
	public boolean isValidAge() {
		return isValidAge;
	}
	
	/**
	 * Check if Marital Status is valid
	 * {M,W,B,S}
	 * @param text
	 */
	public void setMaritalStatus(String input) {
		if(!isNullEntry(input))
		{	
			if(input.trim().toLowerCase().equals("m"))
				isMarried = true;
			
			if(input.trim().toLowerCase().equals("w"))
				isWidower = true;
			
			if(input.trim().toLowerCase().equals("b"))
				isBachelor = true;
			
			if(input.trim().toLowerCase().equals("s"))
				isSingle = true;
		}
		
		builder.append("\n4.Marital Status\n 	isMarried: " + isMarried + "\n" + " 	isWidower: " + isWidower + "\n" + " 	isBachelor: " + isBachelor + "\n" + " 	isSingle: " + isSingle + "\n");
	}

	@Override
	public boolean isMarried() {
		return isMarried;
	}

	@Override
	public boolean isWidower() {
		return isWidower;
	}

	@Override
	public boolean isSingle() {
		return isSingle;
	}

	@Override
	public boolean isBachelor() {
		return isBachelor;
	}
	

	
	/**
	 * Check if input if valid for Cause of Death
	 * @param text
	 *
	public void setCauseOfDeathInput(String input) {
		if(!isNullEntry(input))
			isValidCauseOfDeath = true;
		
		builder.append("\n5.Cause of Death\n 	isValidCauseOfDeath: " + isValidCauseOfDeath + "\n");
	}
	
	@Override
	public boolean isValidCauseOfDeath() {
		return isValidCauseOfDeath;
	}*/
	
	
	/**
	 * Check certification value
	 * @param text
	 *
	public void setCertification(String input) {
		if(!isNullEntry(input))
		{	
			if(input.trim().toLowerCase().equals("c"))
				isCertified = true;
			
			if(input.trim().toLowerCase().equals("u"))
				isUncertified = true;
		}
		
		builder.append("\n6.Certification\n 	isCertified: " + isCertified + "\n" + "	isUncertified: " + isUncertified + "\n");
	}

	@Override
	public boolean isUncertified() {
		return isUncertified;
	}

	@Override
	public boolean isCertified() {
		return isCertified;
	}*/
	
	/**
	 * Check if Informant is Valid
	 * @param text
	 */
	public void setIsValidInformant(String input) {
		if(!isNullEntry(input))	
			isValidInformant = true;
	}
	
	@Override
	public boolean isValidInformant() {
		return isValidInformant;
	}
	
	
	/**
	 * Check if Informant was present
	 * @param text
	 */
	public void setIsPresentAtDeathInput(String input) {
		if(!isNullEntry(input))
		{	
			if(input.trim().toLowerCase().equals("p"))
				isPresentAtDeath = true;
			
			if(input.trim().toLowerCase().equals("n"))
				isNotPresentAtDeath = true;
		}
		
		builder.append("\n6.Informant Present at Death\n 	isValidInformant: " + isValidInformant + "\n" + "	isPresentAtDeath: " + isPresentAtDeath + "\n"
				+ "	isNotPresentAtDeath: " + isNotPresentAtDeath + "\n");
	}
	

	@Override
	public boolean isPresentAtDeath() {
		return isPresentAtDeath;
	}
	
	@Override
	public boolean isNotPresentAtDeath() {
		return isNotPresentAtDeath;
	}


	/**
	 * Check if Informant has a value
	 */
	public void setIsQualifiedInformant(String input) {
		if(!isNullEntry(input))
			isQualifiedInformant = true;
		
		builder.append("\n7.Qualified or Address for Informant\n 	isQualifiedInformant: " + isQualifiedInformant + "\n");
	}
	
	@Override
	public boolean isQualifiedInformant() {
		return isQualifiedInformant;
	}
	
	/**
	 * Check if informant has a valid address
	 */
	public void setIsValidInformantAddress(String input) {
		if(!isNullEntry(input))
			isValidInformantAddress = true;
		
		builder.append("	isValidInformantAddress: " + isValidInformantAddress + "\n");
	}
	
	
	@Override
	public boolean isValidInformantAddress() {
		return isValidInformantAddress;
	}

	/**
	 * Retrieve date string
	 * Convert to correct format
	 * Check if numeric
	 * Check if within timeframe
	 * @param input
	 * @throws ParseException
	 */
	public void setIsRegistrationDateOutOfRange(String input) {
		builder.append("\n5.Registration Date\n");
		
		//Must prove registration date is within range 
		isRegistrationOutOfDate = true;
		String yearString = "";
		
		if(!isNullEntry(input))
		{
			//convertInput = new DateConverter();
			//input = convertInput.convertString(input);
			//yearString = input.trim().substring(input.length()-4);
			yearString = "19" + input.trim().substring(input.length()-2);
		}
		
		setIsNumeric(yearString);
		
		if(isNumeric) {
			long year = Long.parseLong(yearString);
			if(year > 1864 && year <= 1922)
				isRegistrationOutOfDate = false;
		}	
		builder.append(" 	isRegistrationOutOfDate: " + isRegistrationOutOfDate +"\n");
	}

	@Override
	public boolean isRegistrationDateOutOfRange() {
		return isRegistrationOutOfDate;
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


	/**
	 * Check if forename parameter is valid
	 * @param forename
	 */
	public void setIsValidForename(String forename) {
		this.isValidForename = !isNullEntry(forename);
	}
	
	@Override
	public boolean isValidForename() {
		return isValidForename;
	}
	
	/**
	 * Check if surname parameter is valid
	 * @param forename
	 */
	public void setIsValidSurname(String surname) {
		this.isValidSurname = !isNullEntry(surname);
	}
	
	@Override
	public boolean isValidSurname() {
		return isValidSurname;
	}
	
	



	




}

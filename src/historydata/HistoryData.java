package historydata;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

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
	//Gloria's predicates
	isValidForename, isValidSurname,
	//Ayo's predicates
	isValidCivilStatusOfDeceased, isValidIllnessDuration1, isValidIllnessDuration2, isValidCauseOfDeath1, isValidCauseOfDeath2,
	//AIDANS ADDITIONS
	isDistrictRecorded, isDateOfDeathInRange, isPlaceOfDeathRecorded, isDistrictAreaRecorded,
	isBaker, isFarmer, isHousekeeper, isLabourer, isLady, isTeacher, isUnknownRank,isCertified, 
	isUncertified, isRegistrarRecorded, isTiffFilePathRecorded; //isCertified, isUncertified,isValidCauseOfDeath,
	
	private StringBuilder builder;

	public HistoryData() {
		builder = new StringBuilder();
		builder.append("\n---------------------\nHistory Input:\n");
		builder.append("1.Registration ID\n");
	}

	@Override
	public String toString() {
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
			yearString = input.trim().substring(input.length()-4);
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
		if(input.equals(null)||input.isEmpty())
			return true;
		
		return false;
	}

	//Gloria's changes
	
	@Override
	public boolean isValidForename() {
		// TODO Auto-generated method stub
		return isValidForename;
	}

	@Override
	public boolean isValidSurname() {
		// TODO Auto-generated method stub
		return isValidSurname;
	}
	
	/**
	 * Check if forename parameter is valid
	 * @param forename
	 */
	public void setIsValidForename(String forename) {
		this.isValidForename = !isNullEntry(forename);
	}
	
	/**
	 * Check if surname parameter is valid
	 * @param forename
	 */
	public void setIsValidSurname(String surname) {
		this.isValidSurname = !isNullEntry(surname);
	}

	//Ayo's changes
	
	@Override
	public boolean isValidCivilStatusOfDeceased() {
		return isValidCivilStatusOfDeceased;
	}
	
	public void setValidCivilStatus(String cs, String sex) {
		builder.append("\n9.Civil Status of Deceased (M/W/S/B)\n");
		
		setMaritalStatus(cs);
		setIsValidSex(sex);
		 
		if (isBachelor && isMale) {
			isValidCivilStatusOfDeceased = true;
		}
		if (isMarried && (isFemale || isMale)) {
			isValidCivilStatusOfDeceased = true;
		}
		if (isSingle && isFemale) {
			isValidCivilStatusOfDeceased = true;
		}
		if (isWidower && (isMale || isFemale)) {
			isValidCivilStatusOfDeceased = true;
		}
		
		builder.append(" 	isValidCivilStatusOfDeceased: " + isValidCivilStatusOfDeceased +"\n");
		
	}
	
	@Override
	public boolean isValidIllnessDuration1() {
		return isValidIllnessDuration1;
	}
	
	public void setValidIllnessDuration1(String input) {
		builder.append("\n10.Duration of Illness 1\n");
		
		if(!isNullEntry(input))
		{
			if (regexMatch1(input) || regexMatch2(input) || stringContains(input)) 
			{
				isValidIllnessDuration1 = true;
			}
		}
		
		builder.append(" 	isValidIllnessDuration1: " + isValidIllnessDuration1 +"\n");
	}	

	@Override
	public boolean isValidIllnessDuration2() {
		return isValidIllnessDuration2;
	}
	
	public void setValidIllnessDuration2(String input) {
		builder.append("\n11.Duration of Illness 2\n");
		
		if(!isNullEntry(input))
		{
			if (regexMatch1(input) || regexMatch2(input) || stringContains(input)) 
			{
				isValidIllnessDuration2 = true;
			}
		}
		
		builder.append(" 	isValidIllnessDuration2: " + isValidIllnessDuration2 +"\n");
	}

	@Override
	public boolean isValidCauseOfDeath1() {
		return isValidCauseOfDeath1;
	}
	
	public void setValidCauseOfDeath1(String input) {
		builder.append("\n12.Cause of Death 1\n");
		
		if(!isNullEntry(input))
		{
			isValidCauseOfDeath1 = true;
		}
		
		builder.append(" 	isValidCauseOfDeath1: " + isValidCauseOfDeath1 +"\n");
	}
	
	@Override
	public boolean isValidCauseOfDeath2() {
		return isValidCauseOfDeath2;
	}
	
	public void setValidCauseOfDeath2(String input) {
		builder.append("\n12.Cause of Death 2\n");
		
		if(!isNullEntry(input))
		{
			isValidCauseOfDeath2 = true;
		}
		
		builder.append(" 	isValidCauseOfDeath2: " + isValidCauseOfDeath2 +"\n");
	}
	
	public boolean regexMatch1(String input) {
		return input.matches("\\d{4}-\\d{2}-\\d{2}"); 
	}
	
	public boolean regexMatch2(String input) {
		return input.toUpperCase().split("T")[0].matches("\\d{4}-\\d{2}-\\d{2}"); 
	}
	
	public boolean stringContains(String input) {
		return input.toUpperCase().contains("ABOUT") 
				|| input.toUpperCase().contains("MIN")
				|| input.toUpperCase().contains("DAY") 
				|| input.toUpperCase().contains("MONTH")
				|| input.toUpperCase().contains("YEAR");
	}

	//AIDANS ADDITIONS
	
	/**
	 * Check if District recorded
	 * @param text
	 */
	public void setDistrictRecorded(String input) {
		if(!isNullEntry(input))
			isDistrictRecorded = true;	
	
		builder.append("\n9.District Recorded\n 	isDistrictRecorded: " + isDistrictRecorded + "\n");
	}
	
	@Override
	public boolean isDistrictRecorded() {
		return isDistrictRecorded;
	}	
	
	/**
	 * Retrieve date string
	 * Convert to correct format
	 * Check if numeric
	 * Check if within timeframe
	 * @param input
	 * @throws ParseException
	 */
	public void setIsDateOfDeathInRange(String input) {
		builder.append("\n10.Date of Death\n");
		
		//Must prove registration date is within range 
		isDateOfDeathInRange = true;
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
				isDateOfDeathInRange = true;
		}	
		builder.append(" 	isDateOfDeathInRange: " + isDateOfDeathInRange +"\n");
	}

	@Override
	public boolean isDateOfDeathInRange() {
		return isDateOfDeathInRange;
	}
	
	/**
	 * Check if Place of Death recorded
	 * @param text
	 */
	public void setPlaceOfDeathRecorded(String input) {
		if(!isNullEntry(input))
			isPlaceOfDeathRecorded = true;	
	
		builder.append("\n11.Place of Death Recorded\n 	isPlaceOfDeathRecorded: " + isPlaceOfDeathRecorded + "\n");
	}
	
	@Override
	public boolean isPlaceOfDeathRecorded() {
		return isPlaceOfDeathRecorded;
	}	

//	/**
//	 * Examine Deceased Forname and Surname
//	 * @param text
//	 */
//	public void setDeceasedNameRecorded(String input1, String input2) {
//		if(!isNullEntry(input1))
//			isForenameRecorded = true;
//		
//		if (!isNullEntry(input2))
//			isSurnameRecorded = true;	
//	
//		builder.append("\n12.Deceased Name Recorded\n 	isForenameRecorded: " + isForenameRecorded + "\n" + " 	isSurnameRecorded: " + isSurnameRecorded + "\n");
//	}
	
	/**
	 * Check if District Area recorded
	 * @param text
	 */
	public void setDistrictAreaRecorded(String input) {
		if(!isNullEntry(input))
			isDistrictAreaRecorded = true;	
	
		builder.append("\n11.District Area Recorded\n 	isDistrictAreaRecorded: " + isDistrictAreaRecorded + "\n");
	}
	
	@Override
	public boolean isDistrictAreaRecorded() {
		return isDistrictAreaRecorded;
	}	
	
	/**
	 * Examine Rank
	 * 
	 * @param text
	 */
	public void setDeceasedRank(String input) {
		if(!isNullEntry(input))
		{			
			switch (input.trim().toLowerCase()) {
				case "baker":
					isBaker = true;
					break;
				case "farmer":
					isFarmer = true;
					break;
				case "housekeeper":
					isHousekeeper = true;
					break;
				case "labourer":
					isLabourer = true;
					break;
				case "lady":
					isLady = true;
					break;
				case "teacher":
					isTeacher = true;
					break;
				default:
					isUnknownRank = true;
					break;
			}			
		}
		else
			isUnknownRank = true;						
		
		builder.append("\n12.Deceased Rank\n 	isBaker: " + isBaker +
				       "\n" + " 	isFarmer: " + isFarmer + 
				       "\n" + " 	isHousekeeper: " + isHousekeeper + 
				       "\n" + " 	isLabourer: " + isLabourer + 
				       "\n" + " 	isLady: " + isLady + 
				       "\n" + " 	isTeacher: " + isTeacher + 
				       "\n" + " 	Rank Unknown: " + isUnknownRank + "\n");
	}

	@Override
	public boolean isBaker() {
		return isBaker;
	}

	@Override
	public boolean isFarmer() {
		return isFarmer;
	}

	@Override
	public boolean isHousekeeper() {
		return isHousekeeper;
	}

	@Override
	public boolean isLabourer() {
		return isLabourer;
	}	
	
	@Override
	public boolean isLady() {
		return isLady;
	}
	
	@Override
	public boolean isTeacher() {
		return isTeacher;
	}
	
	@Override
	public boolean isUnknownRank() {
		return isUnknownRank;
	}	
	
	/**
	 * Check if input if valid for Cause of Death
	 * @param text
	 */
	public void setCauseOfDeathInput(String input1, String input2) {
		if(!isNullEntry(input1))
			isValidCauseOfDeath1 = true;
		if (!isNullEntry(input2))
			isValidCauseOfDeath2 = true;	
	
		builder.append("\n13.Cause of Death\n 	isValidCauseOfDeath1: " + isValidCauseOfDeath1 + "\n" + " 	isValidCauseOfDeath2: " + isValidCauseOfDeath2 + "\n");
	}
	
	/**
	 * Check certification value
	 * @param text
	 */
	public void setCertification(String input) {
		if(!isNullEntry(input))
		{	
			if(input.trim().toLowerCase().equals("c"))
				isCertified = true;
			
			if(input.trim().toLowerCase().equals("u"))
				isUncertified = true;
		}
		
		builder.append("\n14.Certification\n 	isCertified: " + isCertified + "\n" + " 	isUncertified: " + isUncertified + "\n");
	}

	@Override
	public boolean isUncertified() {
		return isUncertified;
	}

	@Override
	public boolean isCertified() {
		return isCertified;
	}	
	
	/**
	 * Check if Name of Registrar recorded
	 * @param text
	 */
	public void setIsRegistrarRecorded(String input) {
		if(!isNullEntry(input))
			isRegistrarRecorded = true;	
	
		builder.append("\n15.Registrar Recorded\n 	isRegistrarRecorded: " + isRegistrarRecorded + "\n");
	}
	
	@Override
	public boolean isRegistrarRecorded() {
		return isRegistrarRecorded;
	}	
	
	/**
	 * Check if Tiff File Path recorded
	 * @param text
	 */
	public void setIsTiffFilePathRecorded(String input) {
		if(!isNullEntry(input))
			isTiffFilePathRecorded = true;	
	
		builder.append("\n16.TiffFilePath Recorded\n 	isTiffFilePathRecorded: " + isTiffFilePathRecorded + "\n");
	}
	
	@Override
	public boolean isTiffFilePathRecorded() {
		return isTiffFilePathRecorded;
	}

	//predicates not used but forced to implement
	@Override
	public boolean isSurnameRecorded() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isForenameRecorded() {
		// TODO Auto-generated method stub
		return false;
	}
}

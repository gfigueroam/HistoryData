package historybaseline;

import historydata.Predicates;

public class BaselineBooleanDDRules {
	
	
	/**
	 * RULES for isValidIDInput
	 * @param predicates
	 * @return
	 */
	public boolean isValidIDInput(Predicates predicates) {
        return eval973511904(predicates);
    }

    private boolean eval973511904(Predicates predicates) {
        if (predicates.isNumeric())
            return eval973511872(predicates);
        else
            return eval973511744(predicates);
    }

    private boolean eval973511872(Predicates predicates) {
        if (predicates.isValidIDFormat())
            return eval973511712(predicates);
        else
            return eval973511744(predicates);
    }

    private boolean eval973511744(Predicates predicates) {
        return false;
    }

    private boolean eval973511712(Predicates predicates) {
        return true;
    }
    
 
    
    /**
     * RULES; isValidSex
     * @param predicates
     * @return
     */
    public boolean isValidSex(Predicates predicates) {
        return eval574158624(predicates);
    }

    private boolean eval574158624(Predicates predicates) {
        if (predicates.isMale())
            return eval574158432(predicates);
        else
            return eval574158592(predicates);
    }

    private boolean eval574158592(Predicates predicates) {
        if (predicates.isFemale())
            return eval574158432(predicates);
        else
            return eval574158464(predicates);
    }

    private boolean eval574158464(Predicates predicates) {
        return false;
    }

    private boolean eval574158432(Predicates predicates) {
        return true;
    }
    

}

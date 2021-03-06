/* This file was generated with the ADD-Lib
 * http://add-lib.scce.info/ */

public class GeneratedDecisionService {

    public boolean checkIsValidID(Predicates predicates) {
        return eval1770189485568(predicates);
    }

    public boolean checkAge(Predicates predicates) {
        return eval1770189485696(predicates);
    }

    public boolean checkSex(Predicates predicates) {
        return eval1770189485888(predicates);
    }

    public boolean checkMaritalStatus(Predicates predicates) {
        return eval1770189486272(predicates);
    }

    public boolean checkIsRegistrationDateOutOfRange(Predicates predicates) {
        return eval1770189486400(predicates);
    }

    public boolean checkInformatIsPresent(Predicates predicates) {
        return eval1770189486720(predicates);
    }

    public boolean checkIsQualifiedInformant(Predicates predicates) {
        return eval1770189486688(predicates);
    }

    public boolean checkInformantAddress(Predicates predicates) {
        return eval1770189486752(predicates);
    }

    public boolean checkRank(Predicates predicates) {
        return eval1770189486848(predicates);
    }

    public boolean checkIllnessDuration1(Predicates predicates) {
        return eval1770189487040(predicates);
    }

    public boolean checkIllnessDuration2(Predicates predicates) {
        return eval1770189487232(predicates);
    }

    public boolean checkCivilStatus(Predicates predicates) {
        return eval1770189487328(predicates);
    }

    private boolean eval1770189485568(Predicates predicates) {
        if (predicates.isNumeric())
            return eval1770189485536(predicates);
        else
            return eval1770189485504(predicates);
    }

    private boolean eval1770189485536(Predicates predicates) {
        if (predicates.isValidIDFormat())
            return eval1770189485472(predicates);
        else
            return eval1770189485504(predicates);
    }

    private boolean eval1770189485696(Predicates predicates) {
        if (predicates.isNumeric())
            return eval1770189485664(predicates);
        else
            return eval1770189485504(predicates);
    }

    private boolean eval1770189485664(Predicates predicates) {
        if (predicates.isValidAge())
            return eval1770189485472(predicates);
        else
            return eval1770189485504(predicates);
    }

    private boolean eval1770189485888(Predicates predicates) {
        if (predicates.isMale())
            return eval1770189485472(predicates);
        else
            return eval1770189485856(predicates);
    }

    private boolean eval1770189485856(Predicates predicates) {
        if (predicates.isFemale())
            return eval1770189485472(predicates);
        else
            return eval1770189485504(predicates);
    }

    private boolean eval1770189486272(Predicates predicates) {
        if (predicates.isMarried())
            return eval1770189485472(predicates);
        else
            return eval1770189486240(predicates);
    }

    private boolean eval1770189486240(Predicates predicates) {
        if (predicates.isWidower())
            return eval1770189485472(predicates);
        else
            return eval1770189486208(predicates);
    }

    private boolean eval1770189486208(Predicates predicates) {
        if (predicates.isBachelor())
            return eval1770189485472(predicates);
        else
            return eval1770189486176(predicates);
    }

    private boolean eval1770189486176(Predicates predicates) {
        if (predicates.isSingle())
            return eval1770189485472(predicates);
        else
            return eval1770189485504(predicates);
    }

    private boolean eval1770189486400(Predicates predicates) {
        if (predicates.isNumeric())
            return eval1770189486368(predicates);
        else
            return eval1770189485504(predicates);
    }

    private boolean eval1770189486368(Predicates predicates) {
        if (predicates.isRegistrationDateOutOfRange())
            return eval1770189485472(predicates);
        else
            return eval1770189485504(predicates);
    }

    private boolean eval1770189486720(Predicates predicates) {
        if (predicates.isValidInformant())
            return eval1770189485504(predicates);
        else
            return eval1770189486688(predicates);
    }

    private boolean eval1770189486688(Predicates predicates) {
        if (predicates.isQualifiedInformant())
            return eval1770189485472(predicates);
        else
            return eval1770189485504(predicates);
    }

    private boolean eval1770189486752(Predicates predicates) {
        if (predicates.isValidInformantAddress())
            return eval1770189485472(predicates);
        else
            return eval1770189485504(predicates);
    }

    private boolean eval1770189486848(Predicates predicates) {
        if (predicates.isValidRank())
            return eval1770189485472(predicates);
        else
            return eval1770189485504(predicates);
    }

    private boolean eval1770189487040(Predicates predicates) {
        if (predicates.isValidCauseOfDeath1())
            return eval1770189487008(predicates);
        else
            return eval1770189485504(predicates);
    }

    private boolean eval1770189487008(Predicates predicates) {
        if (predicates.isValidIllnessDuration1())
            return eval1770189485472(predicates);
        else
            return eval1770189485504(predicates);
    }

    private boolean eval1770189487232(Predicates predicates) {
        if (predicates.isValidCauseOfDeath2())
            return eval1770189487200(predicates);
        else
            return eval1770189485504(predicates);
    }

    private boolean eval1770189487200(Predicates predicates) {
        if (predicates.isValidIllnessDuration2())
            return eval1770189485472(predicates);
        else
            return eval1770189485504(predicates);
    }

    private boolean eval1770189487328(Predicates predicates) {
        if (predicates.isValidCivilStatusOfDeceased())
            return eval1770189485472(predicates);
        else
            return eval1770189485504(predicates);
    }

    private boolean eval1770189485504(Predicates predicates) {
        return false;
    }

    private boolean eval1770189485472(Predicates predicates) {
        return true;
    }
}

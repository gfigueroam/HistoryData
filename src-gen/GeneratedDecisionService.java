/* This file was generated with the ADD-Lib
 * http://add-lib.scce.info/ */

public class GeneratedDecisionService {

    public boolean checkIsValidID(Predicates predicates) {
        return eval140517960563584(predicates);
    }

    public boolean checkAge(Predicates predicates) {
        return eval140517960563712(predicates);
    }

    public boolean checkSex(Predicates predicates) {
        return eval140517960563904(predicates);
    }

    public boolean checkMaritalStatus(Predicates predicates) {
        return eval140517960564288(predicates);
    }

    public boolean checkIsRegistrationDateOutOfRange(Predicates predicates) {
        return eval140517960564416(predicates);
    }

    public boolean checkInformatIsPresent(Predicates predicates) {
        return eval140517960564928(predicates);
    }

    private boolean eval140517960563584(Predicates predicates) {
        if (predicates.isNumeric())
            return eval140517960563552(predicates);
        else
            return eval140517960563520(predicates);
    }

    private boolean eval140517960563552(Predicates predicates) {
        if (predicates.isValidIDFormat())
            return eval140517960563488(predicates);
        else
            return eval140517960563520(predicates);
    }

    private boolean eval140517960563712(Predicates predicates) {
        if (predicates.isNumeric())
            return eval140517960563680(predicates);
        else
            return eval140517960563520(predicates);
    }

    private boolean eval140517960563680(Predicates predicates) {
        if (predicates.isValidAge())
            return eval140517960563488(predicates);
        else
            return eval140517960563520(predicates);
    }

    private boolean eval140517960563904(Predicates predicates) {
        if (predicates.isFemale())
            return eval140517960563488(predicates);
        else
            return eval140517960563872(predicates);
    }

    private boolean eval140517960563872(Predicates predicates) {
        if (predicates.isMale())
            return eval140517960563488(predicates);
        else
            return eval140517960563520(predicates);
    }

    private boolean eval140517960564288(Predicates predicates) {
        if (predicates.isMarried())
            return eval140517960563488(predicates);
        else
            return eval140517960564256(predicates);
    }

    private boolean eval140517960564256(Predicates predicates) {
        if (predicates.isWidower())
            return eval140517960563488(predicates);
        else
            return eval140517960564224(predicates);
    }

    private boolean eval140517960564224(Predicates predicates) {
        if (predicates.isBachelor())
            return eval140517960563488(predicates);
        else
            return eval140517960564192(predicates);
    }

    private boolean eval140517960564192(Predicates predicates) {
        if (predicates.isSingle())
            return eval140517960563488(predicates);
        else
            return eval140517960563520(predicates);
    }

    private boolean eval140517960564416(Predicates predicates) {
        if (predicates.isNumeric())
            return eval140517960564384(predicates);
        else
            return eval140517960563520(predicates);
    }

    private boolean eval140517960564384(Predicates predicates) {
        if (predicates.isRegistrationDateOutOfRange())
            return eval140517960563520(predicates);
        else
            return eval140517960563488(predicates);
    }

    private boolean eval140517960564928(Predicates predicates) {
        if (predicates.isValidInformant())
            return eval140517960564896(predicates);
        else
            return eval140517960563520(predicates);
    }

    private boolean eval140517960564896(Predicates predicates) {
        if (predicates.isPresentAtDeath())
            return eval140517960564832(predicates);
        else
            return eval140517960564864(predicates);
    }

    private boolean eval140517960564864(Predicates predicates) {
        if (predicates.isNotPresentAtDeath())
            return eval140517960564800(predicates);
        else
            return eval140517960563520(predicates);
    }

    private boolean eval140517960564800(Predicates predicates) {
        if (predicates.isQualifiedInformant())
            return eval140517960563488(predicates);
        else
            return eval140517960564768(predicates);
    }

    private boolean eval140517960564768(Predicates predicates) {
        if (predicates.isValidInformantAddress())
            return eval140517960563488(predicates);
        else
            return eval140517960563520(predicates);
    }

    private boolean eval140517960564832(Predicates predicates) {
        if (predicates.isNotPresentAtDeath())
            return eval140517960563520(predicates);
        else
            return eval140517960564800(predicates);
    }

    private boolean eval140517960563520(Predicates predicates) {
        return false;
    }

    private boolean eval140517960563488(Predicates predicates) {
        return true;
    }
}

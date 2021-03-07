/* This file was generated with the ADD-Lib
 * http://add-lib.scce.info/ */

public class GeneratedDecisionService {

    public boolean checkIsValidID(Predicates predicates) {
        return eval2630122198464(predicates);
    }

    public boolean checkAge(Predicates predicates) {
        return eval2630122198592(predicates);
    }

    public boolean checkSex(Predicates predicates) {
        return eval2630122198784(predicates);
    }

    public boolean checkMaritalStatus(Predicates predicates) {
        return eval2630122199168(predicates);
    }

    public boolean checkIsRegistrationDateOutOfRange(Predicates predicates) {
        return eval2630122199296(predicates);
    }

    public boolean checkInformatIsPresent(Predicates predicates) {
        return eval2630122199616(predicates);
    }

    public boolean checkIsQualifiedInformant(Predicates predicates) {
        return eval2630122199584(predicates);
    }

    public boolean checkInformantAddress(Predicates predicates) {
        return eval2630122199648(predicates);
    }

    public boolean checkIllnessDuration1(Predicates predicates) {
        return eval2630122199840(predicates);
    }

    public boolean checkIllnessDuration2(Predicates predicates) {
        return eval2630122200032(predicates);
    }

    public boolean checkCivilStatus(Predicates predicates) {
        return eval2630122200128(predicates);
    }

    public boolean checkFullNameIsValid(Predicates predicates) {
        return eval2630122200320(predicates);
    }

    public boolean checkIsDateOfDeathInRange(Predicates predicates) {
        return eval2630122200448(predicates);
    }

    public boolean checkIsTiffFilePathRecorded(Predicates predicates) {
        return eval2630122198400(predicates);
    }

    public boolean checkCertification(Predicates predicates) {
        return eval2630122200704(predicates);
    }

    public boolean checkRank(Predicates predicates) {
        return eval2630122201632(predicates);
    }

    public boolean checkRegistrar(Predicates predicates) {
        return eval2630122201728(predicates);
    }

    public boolean checkLocale(Predicates predicates) {
        return eval2630122202016(predicates);
    }

    public boolean checkCauseOfDeathRecorded(Predicates predicates) {
        return eval2630122202080(predicates);
    }

    private boolean eval2630122198464(Predicates predicates) {
        if (predicates.isNumeric())
            return eval2630122198432(predicates);
        else
            return eval2630122198400(predicates);
    }

    private boolean eval2630122198432(Predicates predicates) {
        if (predicates.isValidIDFormat())
            return eval2630122198368(predicates);
        else
            return eval2630122198400(predicates);
    }

    private boolean eval2630122198592(Predicates predicates) {
        if (predicates.isNumeric())
            return eval2630122198560(predicates);
        else
            return eval2630122198400(predicates);
    }

    private boolean eval2630122198560(Predicates predicates) {
        if (predicates.isValidAge())
            return eval2630122198368(predicates);
        else
            return eval2630122198400(predicates);
    }

    private boolean eval2630122198784(Predicates predicates) {
        if (predicates.isMale())
            return eval2630122198368(predicates);
        else
            return eval2630122198752(predicates);
    }

    private boolean eval2630122198752(Predicates predicates) {
        if (predicates.isFemale())
            return eval2630122198368(predicates);
        else
            return eval2630122198400(predicates);
    }

    private boolean eval2630122199168(Predicates predicates) {
        if (predicates.isMarried())
            return eval2630122198368(predicates);
        else
            return eval2630122199136(predicates);
    }

    private boolean eval2630122199136(Predicates predicates) {
        if (predicates.isWidower())
            return eval2630122198368(predicates);
        else
            return eval2630122199104(predicates);
    }

    private boolean eval2630122199104(Predicates predicates) {
        if (predicates.isBachelor())
            return eval2630122198368(predicates);
        else
            return eval2630122199072(predicates);
    }

    private boolean eval2630122199072(Predicates predicates) {
        if (predicates.isSingle())
            return eval2630122198368(predicates);
        else
            return eval2630122198400(predicates);
    }

    private boolean eval2630122199296(Predicates predicates) {
        if (predicates.isNumeric())
            return eval2630122199264(predicates);
        else
            return eval2630122198400(predicates);
    }

    private boolean eval2630122199264(Predicates predicates) {
        if (predicates.isRegistrationDateOutOfRange())
            return eval2630122198368(predicates);
        else
            return eval2630122198400(predicates);
    }

    private boolean eval2630122199616(Predicates predicates) {
        if (predicates.isValidInformant())
            return eval2630122198400(predicates);
        else
            return eval2630122199584(predicates);
    }

    private boolean eval2630122199584(Predicates predicates) {
        if (predicates.isQualifiedInformant())
            return eval2630122198368(predicates);
        else
            return eval2630122198400(predicates);
    }

    private boolean eval2630122199648(Predicates predicates) {
        if (predicates.isValidInformantAddress())
            return eval2630122198368(predicates);
        else
            return eval2630122198400(predicates);
    }

    private boolean eval2630122199840(Predicates predicates) {
        if (predicates.isValidCauseOfDeath1())
            return eval2630122199808(predicates);
        else
            return eval2630122198400(predicates);
    }

    private boolean eval2630122199808(Predicates predicates) {
        if (predicates.isValidIllnessDuration1())
            return eval2630122198368(predicates);
        else
            return eval2630122198400(predicates);
    }

    private boolean eval2630122200032(Predicates predicates) {
        if (predicates.isValidCauseOfDeath2())
            return eval2630122200000(predicates);
        else
            return eval2630122198400(predicates);
    }

    private boolean eval2630122200000(Predicates predicates) {
        if (predicates.isValidIllnessDuration2())
            return eval2630122198368(predicates);
        else
            return eval2630122198400(predicates);
    }

    private boolean eval2630122200128(Predicates predicates) {
        if (predicates.isValidCivilStatusOfDeceased())
            return eval2630122198368(predicates);
        else
            return eval2630122198400(predicates);
    }

    private boolean eval2630122200320(Predicates predicates) {
        if (predicates.isValidForename())
            return eval2630122200288(predicates);
        else
            return eval2630122198400(predicates);
    }

    private boolean eval2630122200288(Predicates predicates) {
        if (predicates.isValidSurname())
            return eval2630122198368(predicates);
        else
            return eval2630122198400(predicates);
    }

    private boolean eval2630122200448(Predicates predicates) {
        if (predicates.isNumeric())
            return eval2630122200416(predicates);
        else
            return eval2630122198400(predicates);
    }

    private boolean eval2630122200416(Predicates predicates) {
        if (predicates.isDateOfDeathInRange())
            return eval2630122198368(predicates);
        else
            return eval2630122198400(predicates);
    }

    private boolean eval2630122200704(Predicates predicates) {
        if (predicates.isCertified())
            return eval2630122198368(predicates);
        else
            return eval2630122200672(predicates);
    }

    private boolean eval2630122200672(Predicates predicates) {
        if (predicates.isUncertified())
            return eval2630122198368(predicates);
        else
            return eval2630122198400(predicates);
    }

    private boolean eval2630122201632(Predicates predicates) {
        if (predicates.isNumeric())
            return eval2630122198368(predicates);
        else
            return eval2630122201600(predicates);
    }

    private boolean eval2630122201600(Predicates predicates) {
        if (predicates.isUnknownRank())
            return eval2630122198368(predicates);
        else
            return eval2630122201536(predicates);
    }

    private boolean eval2630122201536(Predicates predicates) {
        if (predicates.isBaker())
            return eval2630122198368(predicates);
        else
            return eval2630122201472(predicates);
    }

    private boolean eval2630122201472(Predicates predicates) {
        if (predicates.isFarmer())
            return eval2630122198368(predicates);
        else
            return eval2630122201408(predicates);
    }

    private boolean eval2630122201408(Predicates predicates) {
        if (predicates.isHousekeeper())
            return eval2630122198368(predicates);
        else
            return eval2630122201344(predicates);
    }

    private boolean eval2630122201344(Predicates predicates) {
        if (predicates.isLabourer())
            return eval2630122198368(predicates);
        else
            return eval2630122201280(predicates);
    }

    private boolean eval2630122201280(Predicates predicates) {
        if (predicates.isLady())
            return eval2630122198368(predicates);
        else
            return eval2630122201216(predicates);
    }

    private boolean eval2630122201216(Predicates predicates) {
        if (predicates.isTeacher())
            return eval2630122198368(predicates);
        else
            return eval2630122198400(predicates);
    }

    private boolean eval2630122201728(Predicates predicates) {
        if (predicates.isRegistrarRecorded())
            return eval2630122198368(predicates);
        else
            return eval2630122198400(predicates);
    }

    private boolean eval2630122202016(Predicates predicates) {
        if (predicates.isPlaceOfDeathRecorded())
            return eval2630122201984(predicates);
        else
            return eval2630122198400(predicates);
    }

    private boolean eval2630122201984(Predicates predicates) {
        if (predicates.isDistrictRecorded())
            return eval2630122201952(predicates);
        else
            return eval2630122198400(predicates);
    }

    private boolean eval2630122201952(Predicates predicates) {
        if (predicates.isDistrictAreaRecorded())
            return eval2630122198368(predicates);
        else
            return eval2630122198400(predicates);
    }

    private boolean eval2630122202080(Predicates predicates) {
        if (predicates.isValidCauseOfDeath1())
            return eval2630122198368(predicates);
        else
            return eval2630122202048(predicates);
    }

    private boolean eval2630122202048(Predicates predicates) {
        if (predicates.isValidCauseOfDeath2())
            return eval2630122198368(predicates);
        else
            return eval2630122198400(predicates);
    }

    private boolean eval2630122198400(Predicates predicates) {
        return false;
    }

    private boolean eval2630122198368(Predicates predicates) {
        return true;
    }
}

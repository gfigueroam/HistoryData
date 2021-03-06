/* This file was generated with the ADD-Lib
 * http://add-lib.scce.info/ */

package historydata;

public class GeneratedDecisionService {

    public boolean isValidHistoricalInput(Predicates predicates) {
        return eval1804870928704(predicates);
    }

    private boolean eval1804870928704(Predicates predicates) {
        if (predicates.isValidCauseOfDeath2())
            return eval1804870928672(predicates);
        else
            return eval1804870928640(predicates);
    }

    private boolean eval1804870928640(Predicates predicates) {
        if (predicates.isValidCauseOfDeath1())
            return eval1804870928608(predicates);
        else
            return eval1804870923072(predicates);
    }

    private boolean eval1804870928608(Predicates predicates) {
        if (predicates.isValidIllnessDuration1())
            return eval1804870928576(predicates);
        else
            return eval1804870923072(predicates);
    }

    private boolean eval1804870928576(Predicates predicates) {
        if (predicates.isMale())
            return eval1804870928512(predicates);
        else
            return eval1804870928544(predicates);
    }

    private boolean eval1804870928544(Predicates predicates) {
        if (predicates.isFemale())
            return eval1804870928512(predicates);
        else
            return eval1804870923072(predicates);
    }

    private boolean eval1804870928512(Predicates predicates) {
        if (predicates.isValidCivilStatusOfDeceased())
            return eval1804870928480(predicates);
        else
            return eval1804870923072(predicates);
    }

    private boolean eval1804870928480(Predicates predicates) {
        if (predicates.isValidRank())
            return eval1804870928448(predicates);
        else
            return eval1804870923072(predicates);
    }

    private boolean eval1804870928448(Predicates predicates) {
        if (predicates.isMarried())
            return eval1804870928320(predicates);
        else
            return eval1804870928416(predicates);
    }

    private boolean eval1804870928416(Predicates predicates) {
        if (predicates.isWidower())
            return eval1804870928320(predicates);
        else
            return eval1804870928384(predicates);
    }

    private boolean eval1804870928384(Predicates predicates) {
        if (predicates.isBachelor())
            return eval1804870928320(predicates);
        else
            return eval1804870928352(predicates);
    }

    private boolean eval1804870928352(Predicates predicates) {
        if (predicates.isSingle())
            return eval1804870928320(predicates);
        else
            return eval1804870923072(predicates);
    }

    private boolean eval1804870928320(Predicates predicates) {
        if (predicates.isNumeric())
            return eval1804870928288(predicates);
        else
            return eval1804870923072(predicates);
    }

    private boolean eval1804870928288(Predicates predicates) {
        if (predicates.isValidIDFormat())
            return eval1804870928256(predicates);
        else
            return eval1804870923072(predicates);
    }

    private boolean eval1804870928256(Predicates predicates) {
        if (predicates.isRegistrationDateOutOfRange())
            return eval1804870928224(predicates);
        else
            return eval1804870923072(predicates);
    }

    private boolean eval1804870928224(Predicates predicates) {
        if (predicates.isQualifiedInformant())
            return eval1804870928192(predicates);
        else
            return eval1804870923072(predicates);
    }

    private boolean eval1804870928192(Predicates predicates) {
        if (predicates.isValidInformant())
            return eval1804870923072(predicates);
        else
            return eval1804870928160(predicates);
    }

    private boolean eval1804870928160(Predicates predicates) {
        if (predicates.isValidInformantAddress())
            return eval1804870928096(predicates);
        else
            return eval1804870923072(predicates);
    }

    private boolean eval1804870928096(Predicates predicates) {
        if (predicates.isValidAge())
            return eval1804870923040(predicates);
        else
            return eval1804870923072(predicates);
    }

    private boolean eval1804870928672(Predicates predicates) {
        if (predicates.isValidIllnessDuration2())
            return eval1804870928576(predicates);
        else
            return eval1804870928640(predicates);
    }

    private boolean eval1804870923072(Predicates predicates) {
        return false;
    }

    private boolean eval1804870923040(Predicates predicates) {
        return true;
    }
}

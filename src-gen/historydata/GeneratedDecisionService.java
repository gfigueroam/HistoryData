/* This file was generated with the ADD-Lib
 * http://add-lib.scce.info/ */

package historydata;

public class GeneratedDecisionService {

    public boolean isValidHistoricalInput(Predicates predicates) {
        return eval140199977152928(predicates);
    }

    private boolean eval140199977152928(Predicates predicates) {
        if (predicates.isValidInformant())
            return eval140199977152896(predicates);
        else
            return eval140199977150816(predicates);
    }

    private boolean eval140199977152896(Predicates predicates) {
        if (predicates.isPresentAtDeath())
            return eval140199977152832(predicates);
        else
            return eval140199977152864(predicates);
    }

    private boolean eval140199977152864(Predicates predicates) {
        if (predicates.isNotPresentAtDeath())
            return eval140199977152800(predicates);
        else
            return eval140199977150816(predicates);
    }

    private boolean eval140199977152800(Predicates predicates) {
        if (predicates.isQualifiedInformant())
            return eval140199977152736(predicates);
        else
            return eval140199977152768(predicates);
    }

    private boolean eval140199977152768(Predicates predicates) {
        if (predicates.isValidInformantAddress())
            return eval140199977152736(predicates);
        else
            return eval140199977150816(predicates);
    }

    private boolean eval140199977152736(Predicates predicates) {
        if (predicates.isNumeric())
            return eval140199977152704(predicates);
        else
            return eval140199977150816(predicates);
    }

    private boolean eval140199977152704(Predicates predicates) {
        if (predicates.isValidIDFormat())
            return eval140199977152640(predicates);
        else
            return eval140199977150816(predicates);
    }

    private boolean eval140199977152640(Predicates predicates) {
        if (predicates.isValidAge())
            return eval140199977152576(predicates);
        else
            return eval140199977150816(predicates);
    }

    private boolean eval140199977152576(Predicates predicates) {
        if (predicates.isFemale())
            return eval140199977152512(predicates);
        else
            return eval140199977152544(predicates);
    }

    private boolean eval140199977152544(Predicates predicates) {
        if (predicates.isMale())
            return eval140199977152512(predicates);
        else
            return eval140199977150816(predicates);
    }

    private boolean eval140199977152512(Predicates predicates) {
        if (predicates.isRegistrationDateOutOfRange())
            return eval140199977150816(predicates);
        else
            return eval140199977152480(predicates);
    }

    private boolean eval140199977152480(Predicates predicates) {
        if (predicates.isMarried())
            return eval140199977150912(predicates);
        else
            return eval140199977152448(predicates);
    }

    private boolean eval140199977152448(Predicates predicates) {
        if (predicates.isWidower())
            return eval140199977150912(predicates);
        else
            return eval140199977152416(predicates);
    }

    private boolean eval140199977152416(Predicates predicates) {
        if (predicates.isBachelor())
            return eval140199977150912(predicates);
        else
            return eval140199977152384(predicates);
    }

    private boolean eval140199977152384(Predicates predicates) {
        if (predicates.isSingle())
            return eval140199977150912(predicates);
        else
            return eval140199977150816(predicates);
    }

    private boolean eval140199977152832(Predicates predicates) {
        if (predicates.isNotPresentAtDeath())
            return eval140199977150816(predicates);
        else
            return eval140199977152800(predicates);
    }

    private boolean eval140199977150816(Predicates predicates) {
        return false;
    }

    private boolean eval140199977150912(Predicates predicates) {
        return true;
    }
}

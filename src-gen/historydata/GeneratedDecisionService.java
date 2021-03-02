/* This file was generated with the ADD-Lib
 * http://add-lib.scce.info/ */

package historydata;

public class GeneratedDecisionService {

    public boolean isValidHistoricalInput(Predicates predicates) {
        return eval140450215184288(predicates);
    }

    private boolean eval140450215184288(Predicates predicates) {
        if (predicates.isValidInformant())
            return eval140450215184256(predicates);
        else
            return eval140450215182176(predicates);
    }

    private boolean eval140450215184256(Predicates predicates) {
        if (predicates.isPresentAtDeath())
            return eval140450215184192(predicates);
        else
            return eval140450215184224(predicates);
    }

    private boolean eval140450215184224(Predicates predicates) {
        if (predicates.isNotPresentAtDeath())
            return eval140450215184160(predicates);
        else
            return eval140450215182176(predicates);
    }

    private boolean eval140450215184160(Predicates predicates) {
        if (predicates.isQualifiedInformant())
            return eval140450215184096(predicates);
        else
            return eval140450215184128(predicates);
    }

    private boolean eval140450215184128(Predicates predicates) {
        if (predicates.isValidInformantAddress())
            return eval140450215184096(predicates);
        else
            return eval140450215182176(predicates);
    }

    private boolean eval140450215184096(Predicates predicates) {
        if (predicates.isNumeric())
            return eval140450215184064(predicates);
        else
            return eval140450215182176(predicates);
    }

    private boolean eval140450215184064(Predicates predicates) {
        if (predicates.isValidIDFormat())
            return eval140450215184000(predicates);
        else
            return eval140450215182176(predicates);
    }

    private boolean eval140450215184000(Predicates predicates) {
        if (predicates.isValidAge())
            return eval140450215183936(predicates);
        else
            return eval140450215182176(predicates);
    }

    private boolean eval140450215183936(Predicates predicates) {
        if (predicates.isFemale())
            return eval140450215183872(predicates);
        else
            return eval140450215183904(predicates);
    }

    private boolean eval140450215183904(Predicates predicates) {
        if (predicates.isMale())
            return eval140450215183872(predicates);
        else
            return eval140450215182176(predicates);
    }

    private boolean eval140450215183872(Predicates predicates) {
        if (predicates.isRegistrationDateOutOfRange())
            return eval140450215182176(predicates);
        else
            return eval140450215183840(predicates);
    }

    private boolean eval140450215183840(Predicates predicates) {
        if (predicates.isMarried())
            return eval140450215182272(predicates);
        else
            return eval140450215183808(predicates);
    }

    private boolean eval140450215183808(Predicates predicates) {
        if (predicates.isWidower())
            return eval140450215182272(predicates);
        else
            return eval140450215183776(predicates);
    }

    private boolean eval140450215183776(Predicates predicates) {
        if (predicates.isBachelor())
            return eval140450215182272(predicates);
        else
            return eval140450215183744(predicates);
    }

    private boolean eval140450215183744(Predicates predicates) {
        if (predicates.isSingle())
            return eval140450215182272(predicates);
        else
            return eval140450215182176(predicates);
    }

    private boolean eval140450215184192(Predicates predicates) {
        if (predicates.isNotPresentAtDeath())
            return eval140450215182176(predicates);
        else
            return eval140450215184160(predicates);
    }

    private boolean eval140450215182176(Predicates predicates) {
        return false;
    }

    private boolean eval140450215182272(Predicates predicates) {
        return true;
    }
}

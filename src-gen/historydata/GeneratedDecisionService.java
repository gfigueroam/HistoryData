/* This file was generated with the ADD-Lib
 * http://add-lib.scce.info/ */

package historydata;

public class GeneratedDecisionService {

    public boolean isValidHistoricalInput(Predicates predicates) {
        return eval140518177769376(predicates);
    }

    private boolean eval140518177769376(Predicates predicates) {
        if (predicates.isValidInformant())
            return eval140518177769344(predicates);
        else
            return eval140518177767264(predicates);
    }

    private boolean eval140518177769344(Predicates predicates) {
        if (predicates.isPresentAtDeath())
            return eval140518177769280(predicates);
        else
            return eval140518177769312(predicates);
    }

    private boolean eval140518177769312(Predicates predicates) {
        if (predicates.isNotPresentAtDeath())
            return eval140518177769248(predicates);
        else
            return eval140518177767264(predicates);
    }

    private boolean eval140518177769248(Predicates predicates) {
        if (predicates.isQualifiedInformant())
            return eval140518177769184(predicates);
        else
            return eval140518177769216(predicates);
    }

    private boolean eval140518177769216(Predicates predicates) {
        if (predicates.isValidInformantAddress())
            return eval140518177769184(predicates);
        else
            return eval140518177767264(predicates);
    }

    private boolean eval140518177769184(Predicates predicates) {
        if (predicates.isNumeric())
            return eval140518177769152(predicates);
        else
            return eval140518177767264(predicates);
    }

    private boolean eval140518177769152(Predicates predicates) {
        if (predicates.isValidIDFormat())
            return eval140518177769088(predicates);
        else
            return eval140518177767264(predicates);
    }

    private boolean eval140518177769088(Predicates predicates) {
        if (predicates.isValidAge())
            return eval140518177769024(predicates);
        else
            return eval140518177767264(predicates);
    }

    private boolean eval140518177769024(Predicates predicates) {
        if (predicates.isFemale())
            return eval140518177768960(predicates);
        else
            return eval140518177768992(predicates);
    }

    private boolean eval140518177768992(Predicates predicates) {
        if (predicates.isMale())
            return eval140518177768960(predicates);
        else
            return eval140518177767264(predicates);
    }

    private boolean eval140518177768960(Predicates predicates) {
        if (predicates.isRegistrationDateOutOfRange())
            return eval140518177767264(predicates);
        else
            return eval140518177768928(predicates);
    }

    private boolean eval140518177768928(Predicates predicates) {
        if (predicates.isMarried())
            return eval140518177767360(predicates);
        else
            return eval140518177768896(predicates);
    }

    private boolean eval140518177768896(Predicates predicates) {
        if (predicates.isWidower())
            return eval140518177767360(predicates);
        else
            return eval140518177768864(predicates);
    }

    private boolean eval140518177768864(Predicates predicates) {
        if (predicates.isBachelor())
            return eval140518177767360(predicates);
        else
            return eval140518177768832(predicates);
    }

    private boolean eval140518177768832(Predicates predicates) {
        if (predicates.isSingle())
            return eval140518177767360(predicates);
        else
            return eval140518177767264(predicates);
    }

    private boolean eval140518177769280(Predicates predicates) {
        if (predicates.isNotPresentAtDeath())
            return eval140518177767264(predicates);
        else
            return eval140518177769248(predicates);
    }

    private boolean eval140518177767264(Predicates predicates) {
        return false;
    }

    private boolean eval140518177767360(Predicates predicates) {
        return true;
    }
}

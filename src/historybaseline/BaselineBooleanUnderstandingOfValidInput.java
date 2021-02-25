package historybaseline;

import historydata.Predicates;


//Baseline Canonical Decision Diagram
public class BaselineBooleanUnderstandingOfValidInput {
	
	public boolean isValidHistoricalInput(Predicates predicates) {
        return eval926803456(predicates);
    }

    private boolean eval926803456(Predicates predicates) {
        if (predicates.isNumeric())
            return eval926803424(predicates);
        else
            return eval926801184(predicates);
    }

    private boolean eval926803424(Predicates predicates) {
        if (predicates.isValidIDFormat())
            return eval926803392(predicates);
        else
            return eval926801184(predicates);
    }

    private boolean eval926803392(Predicates predicates) {
        if (predicates.isMarried())
            return eval926803264(predicates);
        else
            return eval926803360(predicates);
    }

    private boolean eval926803360(Predicates predicates) {
        if (predicates.isBachelor())
            return eval926803264(predicates);
        else
            return eval926803328(predicates);
    }

    private boolean eval926803328(Predicates predicates) {
        if (predicates.isWidower())
            return eval926803264(predicates);
        else
            return eval926803296(predicates);
    }

    private boolean eval926803296(Predicates predicates) {
        if (predicates.isSingle())
            return eval926803264(predicates);
        else
            return eval926801184(predicates);
    }

    private boolean eval926803264(Predicates predicates) {
        if (predicates.isRegistrationDateOutOfRange())
            return eval926801184(predicates);
        else
            return eval926803200(predicates);
    }

    private boolean eval926803200(Predicates predicates) {
        if (predicates.isFemale())
            return eval926803136(predicates);
        else
            return eval926803168(predicates);
    }

    private boolean eval926803168(Predicates predicates) {
        if (predicates.isMale())
            return eval926803136(predicates);
        else
            return eval926801184(predicates);
    }

    private boolean eval926803136(Predicates predicates) {
        if (predicates.isValidAge())
            return eval926803104(predicates);
        else
            return eval926801184(predicates);
    }

    private boolean eval926803104(Predicates predicates) {
        if (predicates.isValidInformant())
            return eval926803072(predicates);
        else
            return eval926801184(predicates);
    }

    private boolean eval926803072(Predicates predicates) {
        if (predicates.isPresentAtDeath())
            return eval926803008(predicates);
        else
            return eval926803040(predicates);
    }

    private boolean eval926803040(Predicates predicates) {
        if (predicates.isNotPresentAtDeath())
            return eval926803008(predicates);
        else
            return eval926801184(predicates);
    }

    private boolean eval926803008(Predicates predicates) {
        if (predicates.isQualifiedInformant())
            return eval926801152(predicates);
        else
            return eval926802976(predicates);
    }

    private boolean eval926802976(Predicates predicates) {
        if (predicates.isValidInformantAddress())
            return eval926801152(predicates);
        else
            return eval926801184(predicates);
    }

    private boolean eval926801184(Predicates predicates) {
        return false;
    }

    private boolean eval926801152(Predicates predicates) {
        return true;
    }
}

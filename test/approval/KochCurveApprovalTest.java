package approval;

import lsystem.kochcurve.KochCurve;

public class KochCurveApprovalTest extends LSystemTextOutputApprovalTest {
    @Override
    String approvalFileUri() {
        return "testfiles/kochcurve4Recursions.txt";
    }

    @Override
    String createOutput() {
        return new KochCurve().draw(4);
    }

    @Override
    boolean createNewApproval() {
        return false;
    }
}

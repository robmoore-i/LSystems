package approval;

import org.junit.Test;

import java.io.IOException;

public interface LSystemApprovalTest {
    void approve() throws IOException;

    @Test
    void verifyApproval() throws IOException;
}

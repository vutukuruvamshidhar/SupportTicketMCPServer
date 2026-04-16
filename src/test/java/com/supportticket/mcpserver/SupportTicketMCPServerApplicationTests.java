package com.supportticket.mcpserver;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Integration smoke test for the Support Ticket MCP Server application context.
 *
 * <p>Verifies that the full Spring application context starts successfully,
 * including the auto-registration of all MCP prompts, resources, and tools.</p>
 */
@SpringBootTest
class SupportTicketMCPServerApplicationTests {

    /**
     * Asserts that the Spring application context loads without errors.
     */
    @Test
    void contextLoads() {
    }

}
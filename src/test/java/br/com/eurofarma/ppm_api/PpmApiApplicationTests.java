package br.com.eurofarma.ppm_api;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource; 

@SpringBootTest
@ActiveProfiles("test") 
@TestPropertySource(properties = {
    
    "JWT_SECRET=dummy-secret-key-for-testing-purposes-only-1234567890"
}) 
class PpmApiApplicationTests {

    @Test
    void contextLoads() {
        
    }

}
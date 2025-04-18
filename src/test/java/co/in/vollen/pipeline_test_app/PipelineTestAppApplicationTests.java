package co.in.vollen.pipeline_test_app;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
class PipelineTestAppApplicationTests {

	@Value("${pipeline.fail-flag}")
	private Boolean pipelineFails;

	@Test
	void contextLoads() {
	}

	@Test
	void main() {
		PipelineTestAppApplication.main(new String[] {});
	}

	@Test
	void pipeline() {
		if (pipelineFails)
			fail("Test failed!");
	}
}

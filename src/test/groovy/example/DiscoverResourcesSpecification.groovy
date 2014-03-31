package example

import static com.jayway.restassured.RestAssured.*

import org.springframework.boot.test.IntegrationTest
import org.springframework.boot.test.SpringApplicationContextLoader
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.web.WebAppConfiguration

import spock.lang.Specification

@ContextConfiguration (classes = Application, loader = SpringApplicationContextLoader)
@WebAppConfiguration
@IntegrationTest
class DiscoverResourcesSpecification extends Specification {

	def "Discover Resources"() {
		given: "foo"
		
		when: "bar"
			def response = given().auth().basic("user", "password").get("/")
		
		then: "abc"
			response.statusCode() == 200			
	}
}

package example

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.SpringApplicationContextLoader
import org.springframework.test.context.ContextConfiguration

import spock.lang.Specification

@ContextConfiguration (classes = Application, loader = SpringApplicationContextLoader)
class IndividualTest extends Specification {

	@Autowired
	DataSource individualRepository

	def "maximum of two numbers"() {
		println individualRepository
		
		expect:
		// exercise math method for a few different inputs
		Math.max(1, 3) == 3
		Math.max(7, 4) == 7
		Math.max(0, 0) == 0
	}
}

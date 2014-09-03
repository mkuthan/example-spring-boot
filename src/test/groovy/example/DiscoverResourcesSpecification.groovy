package example

import com.jayway.restassured.builder.RequestSpecBuilder
import com.jayway.restassured.response.Response
import com.jayway.restassured.specification.RequestSpecification
import groovy.json.JsonSlurper
import org.springframework.boot.test.IntegrationTest
import org.springframework.boot.test.SpringApplicationContextLoader
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.web.WebAppConfiguration
import spock.lang.Specification

import static com.jayway.restassured.RestAssured.given
import static com.jayway.restassured.RestAssured.preemptive

@ContextConfiguration(classes = Application, loader = SpringApplicationContextLoader)
@WebAppConfiguration
@IntegrationTest
class DiscoverResourcesSpecification extends Specification {

  RequestSpecification requestSpec

  def setup() {
    requestSpec = new RequestSpecBuilder()
        .setAuth(preemptive().basic("user", "password"))
        .build()
  }

  def "Health"() {
    when: "health page requested"
    Response response = given().spec(requestSpec).get("/health")
    def body = new JsonSlurper().parse(response.body().asInputStream())

    then: "page status is OK"
    response.statusCode() == 200

    then: "application status is UP"
    body.status == "UP"
  }

  def "Discover resources"() {
    when: "main page requested"
    Response response = given().spec(requestSpec).get("/")

    then: "page status is OK"
    response.statusCode() == 200
  }
}

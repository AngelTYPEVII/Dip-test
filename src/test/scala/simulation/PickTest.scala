package simulation

import com.typesafe.config.ConfigFactory
import helpers.Curves.burstsGenerator
import io.gatling.core.Predef._
import io.gatling.http.Predef.http
import scenarios.Simulation.createOrder

class PickTest extends Simulation {

  val testConfig = ConfigFactory.parseResources("test.conf")
  val numberOfBursts = testConfig.getString("numberOfBursts")
  val startRPS = testConfig.getString("startRPS")
  val lowRPS = testConfig.getString("lowRPS")
  val rampTime = testConfig.getString("rampTime")
  val constantTime = testConfig.getString("constantTime")
  val highRPS = testConfig.getString("highRPS")
  val spikeRampTime = testConfig.getString("spikeRampTime")
  val relaxTime = testConfig.getString("relaxTime")

  val httpConf = http.baseUrl(sys.props("WFStand").trim)

  setUp(
    createOrder.inject(
      burstsGenerator(numberOfBursts.toInt, startRPS.toInt, lowRPS.toInt,
        rampTime.toInt, constantTime.toInt, highRPS.toInt,
        spikeRampTime.toInt, relaxTime.toInt)
    ).protocols(httpConf)
  )
}

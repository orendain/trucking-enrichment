package com.hortonworks.orendainx.trucking.enrichment

import scala.util.Random

/**
  * @author Edgar Orendain <edgar@orendainx.com>
  */
object WeatherAPI {

  lazy val apply = new WeatherAPI()
}

class WeatherAPI {

  /** Queries the weatherAPI for fog status.
    *
    * @param eventStatus The status of a driving event (e.g. "normal", "speeding", etc.)
    * @return true if the weather is foggy, false otherwise
    */
  def isFoggy(eventStatus: String): Boolean =
    if (eventStatus == "normal") Random.nextInt(100) < 15 else Random.nextInt(100) < 75

  /** Queries the weatherAPI for rain status.
    *
    * @param eventStatus The status of a driving event (e.g. "normal", "speeding", etc.)
    * @return true if the weather is rainy, false otherwise
    */
  def isRainy(eventStatus: String): Boolean =
    if (eventStatus == "normal") Random.nextInt(100) < 15 else Random.nextInt(100) < 60

  /** Queries the weatherAPI for wind status.
    *
    * @param eventStatus The status of a driving event (e.g. "normal", "speeding", etc.)
    * @return true if the weather is windy, false otherwise
    */
  def isWindy(eventStatus: String): Boolean =
    if (eventStatus == "normal") Random.nextInt(100) < 27 else Random.nextInt(100) < 30

}

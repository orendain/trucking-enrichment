package com.hortonworks.orendainx.trucking.enrichment

import scala.util.Random

/**
  * @author Edgar Orendain <edgar@orendainx.com>
  */
object WeatherAPI {

  lazy val apply = new WeatherAPI()
}

class WeatherAPI {

  // TODO: Use trucking-shared for finding eventType's "normal" string value
  // TODO: Export random number parameters to config file.

  /** Queries the weatherAPI for fog status.
    *
    * @param eventType The type of a driving event (e.g. "normal", "speeding", etc.)
    * @return true if the weather is foggy, false otherwise
    */
  def isFoggy(eventType: String): Boolean =
    if (eventType == "normal") Random.nextInt(100) < 15 else Random.nextInt(100) < 75

  /** Queries the weatherAPI for rain status.
    *
    * @param eventType The type of a driving event (e.g. "normal", "speeding", etc.)
    * @return true if the weather is rainy, false otherwise
    */
  def isRainy(eventType: String): Boolean =
    if (eventType == "normal") Random.nextInt(100) < 15 else Random.nextInt(100) < 60

  /** Queries the weatherAPI for wind status.
    *
    * @param eventType The type of a driving event (e.g. "normal", "speeding", etc.)
    * @return true if the weather is windy, false otherwise
    */
  def isWindy(eventType: String): Boolean =
    if (eventType == "normal") Random.nextInt(100) < 27 else Random.nextInt(100) < 30
}

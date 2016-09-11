package akka.first.app.mapreduce

import scala.collection.mutable.ArrayBuffer

/**
  * Created by Akshay Mhetre on 9/11/2016.
  */
sealed trait MapReduceMessage
case class WordCount(word: String, count: Int) extends MapReduceMessage // pair of word and count
case class MapData(dataList: ArrayBuffer[WordCount]) extends MapReduceMessage // array of all above pairs
case class ReduceData(reduceDataMap: Map[String, Int]) extends MapReduceMessage // reduce by key (here word) to map
case class Result() extends MapReduceMessage

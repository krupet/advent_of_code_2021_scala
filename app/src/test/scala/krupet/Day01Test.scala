package krupet

import krupet.Day01.{part1, part2}
import org.scalatest.flatspec.AnyFlatSpec

import scala.io.{BufferedSource, Source}
import scala.util.Using

class Day01Test extends AnyFlatSpec {

  "Count " should "be 7 for first part and sample data" in {
    val input = readFileAsInts("Day01_pt1_sample")
    assert(part1(input) === 7)
  }

  it should "be 1766 for first part and real data" in {
    val input = readFileAsInts("Day01_pt1")
    assert(part1(input) === 1766)
  }

  it should "be 5 for second part and sample data" in {
    val input = readFileAsInts("Day01_pt1_sample")
    assert(part2(input) === 5)
  }

  it should "be 1797 for second part and real data" in {
    val input = readFileAsInts("Day01_pt2")
    assert(part2(input) === 1797)
  }

  val sourceToListInts: BufferedSource => List[Int] = (source: BufferedSource) => source.getLines().map(_.toInt).toList
  def readFileAsInts(fileName: String): List[Int] = Using(Source.fromFile(s"app/src/test/resources/$fileName.txt")) { sourceToListInts } .get
}

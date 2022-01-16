package krupet

object Day01 {
  def part1(input: List[Int]): Int = input.sliding(2,1).count((l: List[Int]) => l.head < l.last)
  def part2(input: List[Int]): Int = input.sliding(4,1).count((l: List[Int]) => l.head < l.last)
}

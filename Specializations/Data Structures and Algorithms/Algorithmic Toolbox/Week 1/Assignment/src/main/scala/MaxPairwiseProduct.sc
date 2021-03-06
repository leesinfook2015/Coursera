val l1 = 10
val l2 = List(7, 5, 14, 2, 8, 8, 10, 1, 2, 3)

val l3 = List(0, 1)

val l4 = List(1)

val l5 = List(100000L, 90000L)


def remove(num: Long, list: List[Long]) = list diff List(num)

def findTwoMax(l: List[Long]) : List[Long] = {
  def findTwoMaxInner(l: List[Long], product: List[Long]) : List[Long] = product match {
    case _ if l.isEmpty => product
    case List(x1, x2) => product
    case p => val m = l.max; findTwoMaxInner (remove(m, l), product ::: List(m))
  }
  findTwoMaxInner(l, List())
}

val twoMax = findTwoMax(l5)
twoMax.product
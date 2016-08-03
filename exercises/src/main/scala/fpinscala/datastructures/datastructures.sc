import fpinscala.datastructures._

List.x

assert(List.tail(List(1, 2, 3, 4, 5)) == List(2, 3, 4, 5))

assert(List.setHead(List(1, 2, 3, 4, 5), 9) == List(9, 2, 3, 4, 5))

assert(List.drop(List(1, 2, 3, 4, 5), 3) == List(4, 5))

assert(List.dropWhile(List(1, 2, 3, 4, 5))(_ <= 3) == List(4, 5))

assert(List.init(List(1, 2, 3, 4, 5)) == List(1, 2, 3, 4))

assert(List.length(List(1, 2, 3, 4, 5)) == 5)

package backjoon.`if`

import java.io.BufferedReader
import java.io.InputStreamReader

/**
 * 문제
 * 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
 *
 * 출력
 * 시험 성적을 출력한다.
 *
 * 제한
 * 없음
 *
 * 예제 입력
 * 100
 *
 * 예제 출력
 * A
 */

//fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
//    val a: Int = readLine().toInt()
//
//
//}

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val a: Int = readLine().toInt()

    print(
        when(a) {
            in 90..100 -> "A"
            in 80..89 -> "B"
            in 70..79 -> "C"
            in 60..69 -> "D"
            else -> "F"
        }
    )

//    print(
//        when {
//            90 <= a -> "A"
//            80 <= a -> "B"
//            70 <= a -> "C"
//            60 <= a -> "D"
//            else -> "F"
//        }
//    )
}

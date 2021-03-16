package `for`

import java.io.BufferedReader
import java.io.InputStreamReader

/**
 * 문제
 * n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.
 *
 * 출력
 * 1부터 n까지 합을 출력한다.
 *
 * 제한
 * 없음.
 *
 * 예제 입력
 * 3
 *
 * 예제 출력
 * 6
 */

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n:Int = readLine().toInt()

    var r:Int = 0
    for( i in 1..n ) {
        r += i
    }

    print("${r}")
}

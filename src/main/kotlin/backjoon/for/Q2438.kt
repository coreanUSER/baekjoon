package backjoon.`for`

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

/**
 * 문제
 * 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
 *
 * 입력
 * 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
 *
 * 출력
 * 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
 *
 * 제한
 * 없음.
 *
 * 예제 입력
 * 5
 *
 * 예제 출력
 * *
 * **
 * ***
 * ****
 * *****
 */

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t:Int = br.readLine().toInt()

    for(i in 1..t ) {
        for(i in 1..i) {
            bw.write("*")
        }
        bw.newLine()
    }

    bw.flush()
}

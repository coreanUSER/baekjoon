package backjoon.one_dimension_array

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

/**
 * 문제
 * N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다.
 * 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다.
 * 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
 *
 * 출력
 * 첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
 *
 * 제한
 * 없음.
 *
 * 예제 입력
 * 5
 * 20 10 35 30 7
 *
 * 예제 출력
 * 7 35
 */

fun main(args: Array<String>) {
    var br = BufferedReader(InputStreamReader(System.`in`))
    var bw = BufferedWriter(OutputStreamWriter(System.out))

    val n:Int = br.readLine().toInt()
    val array: List<Int> = br.readLine().split(" ").map { it.toInt() }

    var min = 0
    var max = 0

    for(i in 0 until n) {
        if(i == 0) {
            min = array[i]
            max = array[i]
        } else {
            if (array[i] < min) min = array[i]
            if (array[i] > max) max = array[i]
        }
    }

    bw.write("${min} ${max}")
    bw.flush()
}
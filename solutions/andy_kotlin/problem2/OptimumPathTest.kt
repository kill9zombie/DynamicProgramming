package problem2

import org.junit.Test

import org.junit.Assert.*

/**
 * Created by Andy on 01/05/2016.
 */
class OptimumPathTest {

    @Test
    fun testFindPath() {
        val matrix = arrayListOf(listOf(8, 7, 4, 2, 3, 5),
                listOf(3, 2, 1, 2, 5, 2),
                listOf(2, 4, 5, 3, 3, 6),
                listOf(6, 4, 5, 4, 3, 2),
                listOf(1, 3, 4, 5, 6, 3),
                listOf(7, 3, 2, 1, 3, 5))
        val optPath = findPath(matrix)
        assertEquals(35, optPath.first)
        assertEquals(listOf(8, 3, 2, 1, 2, 3, 3, 3, 2, 3, 5),optPath.second)
    }

    @Test
    fun testFindPath2() {
        val matrix = listOf(listOf(2,5,17,13,1,11,10,6,19,20,10,17,14,15,11,2,4,8,13,11),
                listOf(10,13,11,14,3,12,14,16,9,14,2,20,12,4,12,8,3,6,5,4),
                listOf(8,8,12,10,3,6,1,3,9,10,6,3,16,3,4,8,11,16,19,8),
                listOf(13,14,6,18,11,17,5,18,9,20,4,12,18,16,15,19,11,1,17,10),
                listOf(8,16,10,1,3,9,3,14,5,8,8,17,7,13,14,3,18,4,5,4),
                listOf(8,15,18,7,17,7,10,20,2,14,2,15,8,9,8,19,8,1,20,17),
                listOf(12,6,11,14,17,15,14,7,5,19,4,15,20,14,14,6,4,8,8,14),
                listOf(10,8,17,2,3,4,17,19,17,18,12,16,1,1,6,10,14,16,5,4),
                listOf(15,20,4,16,12,7,13,3,19,9,15,12,8,20,4,20,10,13,20,16),
                listOf(20,19,10,7,17,9,1,18,16,19,20,2,9,1,7,8,20,19,18,19))

        val optPath = findPath(matrix)
        assertEquals(201, optPath.first)
        assertEquals(listOf(2,5,17,13,1,3,3,6,1,3,9,10,6,3,16,3,4,8,11,11,1,4,1,8,8,5,4,16,19),optPath.second)
    }

}
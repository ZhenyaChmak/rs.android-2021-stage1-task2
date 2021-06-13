package subtask3

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*
import kotlin.reflect.KClass

class Blocks {
    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {
        var formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy")
        return when (blockB){
            String::class -> {
                blockA.filterIsInstance<String>().joinToString("")
            }
            Int::class -> {
                blockA.filterIsInstance<Int>().sum()
            }
            LocalDate::class -> {
                blockA.filterIsInstance<LocalDate>().max()?.format(formatter)!!
            }
            else -> " "
        }
    }
}

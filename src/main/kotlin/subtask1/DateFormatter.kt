package subtask1


import java.lang.Exception
import java.time.DateTimeException
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

class DateFormatter {
    fun toTextDay(day: String, month: String, year: String): String {
        return try{
            var outDate = LocalDate.of(year.toInt(),month.toInt(),day.toInt())
            var formatter = DateTimeFormatter.ofPattern("dd MMMM, EEEE", Locale("ru"))
            outDate.format(formatter)
        }
        catch (e:Exception) {
            return "Такого дня не существует"
        }
    }
}

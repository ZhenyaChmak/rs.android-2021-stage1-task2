package subtask2

class Abbreviation {
    fun abbreviationFromA(a: String, b: String): String {
        var a = a.toLowerCase()
        var b = b.toLowerCase()
        var sizeB = b.length
        var i = 0
        b.forEachIndexed { indexB, b ->
            a.forEachIndexed { indexA, a ->
            if (b==a && indexA>i) {
                sizeB--
                i = indexA
            }
            }
        }


    return if(sizeB==0)"YES" else "NO"
    }
}


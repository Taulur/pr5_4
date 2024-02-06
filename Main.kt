fun main() {
//    2.10

//    try {
//        println("Введите трехзначное число")
//        var number = readLine()!!.toInt()
//        var lastnumber = number % 100
//        when {
//            (number < 99 || number > 999) -> println("Введенное число неверно")
//            (lastnumber % 2 == 0) -> println("Четное")
//            else -> println("Нечетное")
//        }
//    }
//    catch (e:Exception)
//    {
//        println("Введенное число неверно")
//    }

// 3.10

//    try {
//        println("Введите среднюю температуру в Норвегии")
//        var norverg = readLine()!!.toInt()
//        println("Введите среднюю температуру в Швеции")
//        var shvec = readLine()!!.toInt()
//        println("Введите среднюю температуру в Финляндии")
//        var finland = readLine()!!.toInt()
//        val chelyaba = -13
//        when {
//            (norverg < -40 || norverg > 40) -> println("Наглая ложь!")
//            (chelyaba > norverg) -> println("В Норвегии меньше средняя температура чем в челябинске")
//        }
//        when {
//            (shvec < -40 || shvec > 40) -> println("Наглая ложь!")
//            (chelyaba > shvec) -> println("В Швеции меньше средняя температура чем в челябинске")
//        }
//        when {
//            (finland < -40 || finland > 40) -> println("Наглая ложь!")
//            (chelyaba > finland) -> println("В Финляндии меньше средняя температура чем в челябинске")
//        }
//    }
//    catch (e:Exception)
//    {
//        println("Введенная температура неверна")
//    }
}
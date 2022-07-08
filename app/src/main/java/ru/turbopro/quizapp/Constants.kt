package ru.turbopro.quizapp

object Constants {
    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val question1 = Question(
            1,
            "Какой из приведенных видов не является интеллектуальным видом спорта?",
            "Бридж",
            "Шахматы",
            "Петанк",
            "Спидкубинг",
            3
        )
        questionsList.add(question1)

        val question2 = Question(
            1,
            "Какой из видов спорта является командной игрой с мячом и битой?",
            "Бейсбол",
            "Трекбол",
            "Слэмбол",
            "Волейбол",
            1
        )
        questionsList.add(question2)

        val question3 = Question(
            1,
            "Какой из видов спорта связан с управлением воздушным змеем?",
            "Карвинг",
            "Скейтбординг",
            "Кайтсёрфинг",
            "Прыжки с парашютом",
            3
        )
        questionsList.add(question3)

        val question4 = Question(
            1,
            "С чего начинается игра в баскетболе?",
            "со времени, указанного в расписании игр",
            "с начала разминки",
            "с приветствия команд",
            "спорным броском в центральном круге",
            4
        )
        questionsList.add(question4)

        val question5 = Question(
            1,
            "Сколько игроков баскетбольной команды может одновременно находиться на площадке",
            "5",
            "6",
            "7",
            "4",
            1
        )
        questionsList.add(question5)

        val question6 = Question(
            1,
            "С какого расстояния футболисты пробивают «пенальти»?",
            "9",
            "10",
            "11",
            "12",
            3
        )
        questionsList.add(question6)

        val question7 = Question(
            1,
            "Как звучит аббревиатура Международной федерации футбола?",
            "УЕФА",
            "ФИФА",
            "ФИБА",
            "ФИЛА",
            2
        )
        questionsList.add(question7)

        val question8 = Question(
            1,
            "Что в легкой атлетике делают с ядром?",
            "метают",
            "бросают",
            "толкают",
            "запускают",
            3
        )
        questionsList.add(question8)

        val question9 = Question(
            1,
            "Где и когда впервые в нашей стране состоялись Олимпийские игры?",
            "планировались в 1944 году, но были отменены",
            "пока еще не проводились",
            "в 1976 году в Сочи",
            "в 1980 году в Москве",
            4
        )
        questionsList.add(question9)

        val question10 = Question(
            1,
            "Что является древнейшей формой организации физической культуры?",
            "бег",
            "единоборство",
            "игры",
            "соревнования на колесницах",
            3
        )
        questionsList.add(question10)
        return questionsList
    }
}
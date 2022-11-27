package com.example.quizapptutorial

const val USER_NAME: String = "user_name"
const val TOTAL_QUESTIONS: String = "total_questions"
const val CORRECT_ANSWERS: String = "correct_answers"

object Constants {
    fun getQuestions():ArrayList<Question> {
        val questionsList = ArrayList<Question>()
        val que1 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_falg_of_japan,
            "Brazil","China","Canada",
            "Japan",
            4
        )
        questionsList.add(que1)
        val que2 = Question(
            2, "What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Brazil","Argentina","Canada",
            "india",
            2
        )
        questionsList.add(que2)
        val que3 = Question(
            3, "What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Brazil","mexico","Sudan",
            "india",
            1
        )
        questionsList.add(que3)
        val que4 = Question(
            4, "What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Australia","UK","Norway",
            "Newzealand",
            1
        )
        questionsList.add(que4)
        val que5 = Question(
            5, "What country does this flag belong to?",
            R.drawable.ic_flag_of_bangladesh,
            "Pakistan","Bangladesh","Srilanka",
            "Nepal",
            2
        )
        questionsList.add(que5)
        val que6 = Question(
            6, "What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Holland","Germany","Belgium",
            "Spain",
            3
        )
        questionsList.add(que6)
        val que7= Question(
            7, "What country does this flag belong to?",
            R.drawable.ic_flag_of_canada,
            "USA","Austria","Canada",
            "Mexico",
            3
        )
        questionsList.add(que7)
        val que8= Question(
            8, "What country does this flag belong to?",
            R.drawable.ic_flag_of_china,
            "Cambodia","Tailand","Vietnam",
            "China",
            4
        )
        questionsList.add(que8)
        val que9= Question(
            9, "What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Norway","Denmark","Finland",
            "Sweden",
            2
        )
        questionsList.add(que9)

        // 10
        val que10= Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "Fiji","Wales","Newzealand",
            "Panama",
            1
        )
        questionsList.add(que10)

        // 11
        val que11= Question(
            11, "What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "Belgium","holland","Germany",
            "ukraine",
            3
        )
        questionsList.add(que11)

        // 12
        val que12= Question(
            12, "What country does this flag belong to?",
            R.drawable.ic_flag_of_holland,
            "Belgium","holland","Germany",
            "ukraine",
            2
        )
        questionsList.add(que12)

        // 13
        val que13= Question(
            13, "What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "India","Indonesia","Malaysia",
            "Thailand",
            1
        )
        questionsList.add(que13)

        // 14
        val que14= Question(
            14, "What country does this flag belong to?",
            R.drawable.ic_flag_of_jamaica,
            "Morocco","Jamaica","Madagascar",
            "Kenya",
            2
        )
        questionsList.add(que14)

        // 15
        val que15= Question(
            15, "What country does this flag belong to?",
            R.drawable.ic_flag_of_katar,
            "United arab emirates","Egypt","Katar",
            "Saudi arabia",
            3
        )
        questionsList.add(que15)

        // 16
        val que16= Question(
            16, "What country does this flag belong to?",
            R.drawable.ic_flag_of_korea,
            "South Korea","North Korea","China",
            "Japan",
            1
        )
        questionsList.add(que16)

        // 17
        val que17= Question(
            17, "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Jordan","United arab emirates","Lebanon",
            "Kuwait",
            4
        )
        questionsList.add(que17)

        // 18
        val que18= Question(
            18, "What country does this flag belong to?",
            R.drawable.ic_flag_of_mexico,
            "Mexico","USA","Brazil",
            "Argentina",
            1
        )
        questionsList.add(que18)

        // 19
        val que19= Question(
            19, "What country does this flag belong to?",
            R.drawable.ic_flag_of_morocco,
            "Libya","Morocco","Algeria",
            "Tunisia",
            2
        )
        questionsList.add(que19)

        // 20
        val que20= Question(
            20, "What country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "UK","Australia","Newzealand",
            "Canada",
            3
        )
        questionsList.add(que20)

        // 21
        val que21= Question(
            21, "What country does this flag belong to?",
            R.drawable.ic_flag_of_norway,
            "Norway","Denmark","Greenland",
            "Iceland",
            1
        )
        questionsList.add(que21)
        val que22= Question(
            22,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_panama,
            "Fiji","Panama",
            "Alaska",
            "Faroe islands",
            2
        )
        questionsList.add(que22)
        val que23= Question(
            23, "What country does this flag belong to?",
            R.drawable.ic_flag_of_poland,
            "Lithuania","Indonesia","Poland",
            "Estonia",
            3
        )
        questionsList.add(que23)
        val que24= Question(
            24, "What country does this flag belong to?",
            R.drawable.ic_flag_of_ukraine,
            "Lithuania","Latvia","Estonia",
            "Ukraine",
            4
        )
        questionsList.add(que24)
        val que25= Question(
            25, "What country does this flag belong to?",
            R.drawable.ic_flag_of_usa,
            "USA","Canada","Estonia",
            "Russia",
            1
        )
        questionsList.add(que25)
        val que26= Question(
            26, "What country does this flag belong to?",
            R.drawable.ic_flag_of_estonia,
            "Panama","Estonia","Moldova",
            "Latvia",
            2
        )
        questionsList.add(que26)
        val que27= Question(
            27, "What country does this flag belong to?",
            R.drawable.ic_flag_of_moldova,
            "Montenegro","Lithuania","Moldova",
            "Latvia",
            3
        )
        questionsList.add(que27)
        val que28= Question(
            28, "What country does this flag belong to?",
            R.drawable.ic_flag_of_slovenia,
            "Slovakia","Czech","Hungary",
            "Slovenia",
            4
        )
        questionsList.add(que28)
        val que29= Question(
            29, "What country does this flag belong to?",
            R.drawable.ic_flag_of_latvia,
            "Latvia","Bulgaria","Serbia",
            "Romania",
            1
        )
        questionsList.add(que29)
        return questionsList
    }
}

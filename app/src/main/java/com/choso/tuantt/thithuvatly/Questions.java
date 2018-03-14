package com.choso.tuantt.thithuvatly;

/**
 * Created by admin on 3/4/2018.
 */

public class Questions {

    public String mQuestions[] = {
            "Số một là số nào trong các số sau?",
            "Số hai là số nào trong các số sau?",
            "Số ba là số nào trong các số sau?",
            "Số bốn là số nào trong các số sau?",
            "Số năm là số nào trong các số sau?",
            "Số sáu là số nào trong các số sau?",
            "Số bảy là số nào trong các số sau?",
            "Số tám là số nào trong các số sau?",
            "Số chín là số nào trong các số sau?",
            "Số mười là số nào trong các số sau?"
    };

    private String mChoices[][] = {
            { "1", "2", "3", "4" },
            { "1", "2", "3", "4" },
            { "1", "2", "3", "4" },
            { "1", "2", "3", "4" },
            { "1", "5", "3", "4" },
            { "6", "2", "3", "4" },
            { "1", "7", "3", "4" },
            { "1", "2", "8", "4" },
            { "1", "2", "9", "4" },
            { "1", "10", "3", "4" }
    };

    private String mCorrectAnswers[] = {
            "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"
    };

    public String getQuestion(int a){ return mQuestions[a]; }
    public String getChoice1(int a){ return mChoices[a][0]; }
    public String getChoice2(int a){ return mChoices[a][1]; }
    public String getChoice3(int a){ return mChoices[a][2]; }
    public String getChoice4(int a){ return mChoices[a][3]; }
    public String getCorrectAnswer(int a){ return mCorrectAnswers[a]; }

}

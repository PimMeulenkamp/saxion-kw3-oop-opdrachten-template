package nl.saxion.oop.week5;

import nl.saxion.app.SaxionApp;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;

public class Application implements Runnable {
    public static void main(String[] args) {
        SaxionApp.start(new Application(), 1024, 768);
    }

    public void run() {

//        ArrayList<Question> listOfQuestions = loadDummyData();
//
//        int questionCounter = 1;
//        int nrOfCorrectAnswers = 0;
//
//        for(Question q : listOfQuestions) {
//            SaxionApp.clear();
//
//            SaxionApp.printLine("****** Question " + questionCounter + " ******");
//            q.showQuestion();
//            SaxionApp.printLine();
//
//            int result = q.promptForAnswer();
//
//            if(q.checkAnswer(result)) {
//                SaxionApp.printLine("That answer is correct!", Color.GREEN);
//                nrOfCorrectAnswers++;
//            } else {
//                SaxionApp.printLine("That answer is INCORRECT!", Color.RED);
//            }
//
//            questionCounter++;
//
//            SaxionApp.saveImage("Exercise1/sample_output" + (questionCounter-1) + ".png");
//            SaxionApp.pause();
//        }
//
//        SaxionApp.printLine("Your total score is " + nrOfCorrectAnswers + " out of " + listOfQuestions.size() + " questions.");
//        SaxionApp.saveImage("Exercise1/sample_output" + (questionCounter-1) + ".png");
//

    }

//    public ArrayList<Question> loadDummyData() {
//        ArrayList<Question> result = new ArrayList<>();
//
//        TrueFalseQuestion q1 = new TrueFalseQuestion("Sometimes the questions in this course might be a little hard", true);
//        TrueFalseQuestion q2 = new TrueFalseQuestion("Abstract classes can be instantiated into objects", false);
//        TrueFalseQuestion q3 = new TrueFalseQuestion("Making a method final means that it is the latest version of that part of the program", false);
//
//        NumericalQuestion q4 = new NumericalQuestion("What is the value of 2+2?", 4);
//        NumericalQuestion q5 = new NumericalQuestion("What is the value of 5+4?", 9);
//        NumericalQuestion q6 = new NumericalQuestion("What is the value of 3458234+24687234?", 28145468);
//
//        ChoiceQuestion q7 = new ChoiceQuestion("What programming language do we use in this course?");
//        q7.addChoice("C++", false);
//        q7.addChoice("Java", true);
//        q7.addChoice("PHP", false);
//        q7.addChoice("Fortran", false);
//        //q7.shuffleOptions(); // If you want a little more challenge..
//
//        ChoiceQuestion q8 = new ChoiceQuestion("What is your favorite course (this quartile)?");
//        q8.addChoice("Object Oriented Programming", true);
//        q8.addChoice("Something else", false);
//        q8.addChoice("Some weird course", false);
//        q8.addChoice("I can't think of any more options :-)", false);
//        //q8.shuffleOptions(); // If you want a little more challenge..
//
//        result.add(q1);
//        result.add(q2);
//        result.add(q3);
//        result.add(q4);
//        result.add(q5);
//        result.add(q6);
//        result.add(q7);
//        result.add(q8);
//
//        Collections.shuffle(result);
//
//        return result;
//    }
}

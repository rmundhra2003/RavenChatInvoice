package com.company;

/*
    Program that simulates Raven, aka chat therapist Eliza's emo cousin.

    Raven will ask how you your day was much like Eliza, but she will rejoice and share in your dismay, rather than try
    and comfort you.

    Raven should start by asking,
    "Good morning, how are you feeling today?"
    (or any other emo equivalent)

    She should then scan the user's reply for a match on feeling words, which you need to preset when you design Raven.
    You would neeed to scan for both sets of feeling words.

    Feeling words can be stored in an array or arraylist:
    String [ ] positive = {"good", "glad", "happy", "relaxed", "accomplished", "alert", "creative"};

    String [ ] negative = {"bad", "sad", "tired", "angry", "anxious", "hungry", "moody", "afraid"};

    Depending on the number of matches, if there are more positive words then negative ones, Raven will reply as you
    imagine an emo person may reply,
    "I am so happy for you...Yay..."

    But if she picks up on your bad day, Raven will be delighted and say something like,
    "Really! Why, tell me more!"

    If the number of positive and the number negative words cancel each other out, she can simply say,
    "Meh."

    Give the user the option to continue talking with Raven until they decided they've had enough of Raven, and press
     "Q" to quit. Then display the chat history once the session is over.
    DO this using OOP.
    Make Raven your own and get creative!
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<String> chatHistory = new ArrayList<String>();
    static Raven raven = new Raven();
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
	    // prompt user for input
        promptUserInput();

        //display the chat history
        displayChatHistory();

    }
    static void promptUserInput() {
        System.out.print("Good morning, how are you feeling today?");
        chatHistory.add("Good morning, how are you feeling today?");
        String input = keyboard.nextLine();

        while(true) {
            String retString = new String("");
            chatHistory.add(input);
            //call scanner in raven
            if(raven.scanMessage(input).equalsIgnoreCase("positive")) {
                //Get positive reply
                retString = raven.getPositiveReply();
            } else if(raven.scanMessage(input).equalsIgnoreCase("negative")) {
                //Get negative reply
                retString = raven.getNegativeReply();
            } else {
                retString = raven.getNeutralReply();
            }
            chatHistory.add(retString);
            System.out.println(""+retString);
            System.out.print("Do you want to continue(Y|N): ");
            chatHistory.add("Do you want to continue(Y|N): ");
            retString = keyboard.nextLine();
            chatHistory.add(retString);
            if(retString.equalsIgnoreCase("N"))
                break;
            retString = "Okay!";
            System.out.println(retString);
            chatHistory.add(retString);
            input = keyboard.nextLine();
        }
    }
    static void displayChatHistory() {
        System.out.println();
        System.out.println();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Log of chat.....");
        for(String s:chatHistory) {
            System.out.println("" +s);
        }
        System.out.println("End of Log    >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

    }
}

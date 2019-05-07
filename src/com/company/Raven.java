package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Raven {

    public ArrayList<String> getPositive() {
        return positive;
    }


    ArrayList<String> positive = new ArrayList<String>();
    ArrayList<String> negative = new ArrayList<String>();


    ArrayList<String> positiveInput = new ArrayList<String>();
    ArrayList<String> negativeInput = new ArrayList<String>();
    ArrayList<String> positiveReply = new ArrayList<String>();
    ArrayList<String> negativeReply = new ArrayList<String>();
    ArrayList<String> neutralReply = new ArrayList<String>();

    public Raven() {

        buildPositive();
        buildNegative();

        buildNegativeReply();
        buildPositiveReply();
        buildNeutralReply();

    }

    public void setPositive(ArrayList<String> positive) {
        this.positive = positive;
    }

    public ArrayList<String> getNegative() {
        return negative;
    }

    public void setNegative(ArrayList<String> negative) {
        this.negative = negative;
    }

    public ArrayList<String> getPositiveInput() {
        return positiveInput;
    }

    public void setPositiveInput(ArrayList<String> positiveInput) {
        this.positiveInput = positiveInput;
    }

    public ArrayList<String> getNegativeInput() {
        return negativeInput;
    }

    public void setNegativeInput(ArrayList<String> negativeInput) {
        this.negativeInput = negativeInput;
    }

    void buildPositive() {

        positive.add("good");
        positive.add("glad");
        positive.add("happy");
        positive.add("relaxed");
        positive.add("accomplished");
        positive.add("alert");
        positive.add("creative");
        positive.add("fine");
        positive.add("finally");
        positive.add("found");
        positive.add("started");
        positive.add("starting");
        positive.add("starts");
        positive.add("start");
        positive.add("first");
        positive.add("awesome");
        positive.add("easy");
        positive.add("easily");
        positive.add("delighted");
        positive.add("delight");
        positive.add("delights");
        positive.add("fun");
    }
    void buildNegative() {
        negative.add("bad");
        negative.add("sad");
        negative.add("tired");
        negative.add("angry");
        negative.add("anxious");
        negative.add("hungry");
        negative.add("moody");
        negative.add("afraid");
        negative.add("ended");
        negative.add("end");
        negative.add("lost");
        negative.add("lonely");
        negative.add("no");
        negative.add("not");
        negative.add("last");
        negative.add("but");
        negative.add("hard");
        negative.add("hardly");
        negative.add("nothing");
        negative.add("cannot");
        negative.add("can't");
    }
    //Takes the input message and populates the positive input and negative input array list
    String scanMessage(String msg) {
        StringTokenizer st = new StringTokenizer(msg);
        //Have to clear the positive and negative input array lists
        positiveInput.clear();
        negativeInput.clear();

        // get how many tokens are inside st object
        // iterate st object to get more tokens from it
        while (st.hasMoreElements()) {
            String token = st.nextElement().toString();
            token.toLowerCase();
            if(positive.contains(token)) {
                positiveInput.add(token);
            } else if(negative.contains(token)) {
                negativeInput.add(token);
            }
        }
        if(positiveInput.size() > negativeInput.size())
            return "positive";
        else if(negativeInput.size() > positiveInput.size())
            return "negative";
        else
            return "neutral";

    }
    void buildPositiveReply() {
        positiveReply.add("I am so happy for you...Yay...");
        positiveReply.add("Great!!");
        positiveReply.add("That's awesome!");
        positiveReply.add("So happy that you say so!");
        positiveReply.add("Glad that worked out!");

        return ;
    }
    void buildNegativeReply() {
        negativeReply.add("Really! Why, tell me more!");
        negativeReply.add("Why do you feel that way!");
        negativeReply.add("Really!");
        negativeReply.add("Hmmmm....!");
        negativeReply.add("Tell me more!");

        return ;
    }
    void buildNeutralReply() {
        neutralReply.add("Meh");
        neutralReply.add("Why is that ?");
        neutralReply.add("Is that so ?");
        neutralReply.add("How can I help ?");

        return;
    }

    String getPositiveReply() {
        Collections.shuffle(positiveReply);
        return positiveReply.get(1);
    }
    String getNegativeReply() {
        Collections.shuffle(negativeReply);
        return negativeReply.get(1);
    }
    String getNeutralReply() {
        Collections.shuffle(neutralReply);
        return neutralReply.get(1);
    }


}

package com.example.a361_menu;

public class Dialog {
    String detail;
    String text;
    String option1;
    String option2;
    String option1Action;
    String option2Action;
    int imageLeft;
    int imageRight;
    int imageBackground;

    public Dialog(String text,String detail, String option1, String option2, String option1Action, String option2Action, int imageLeft, int imageRight,int imageBackground) {
        this.detail = detail;
        this.text = text;
        this.option1 = option1;
        this.option2 = option2;
        this.option1Action = option1Action;
        this.option2Action = option2Action;
        this.imageLeft = imageLeft;
        this.imageRight = imageRight;
        this.imageBackground = imageBackground;
    }

    public Dialog(String text,String detail, String option1, String option2, String option1Action, String option2Action, int imageLeft, int imageRight) {
        this.detail = detail;
        this.text = text;
        this.option1 = option1;
        this.option2 = option2;
        this.option1Action = option1Action;
        this.option2Action = option2Action;
        this.imageLeft = imageLeft;
        this.imageRight = imageRight;
        this.imageBackground = 0;
    }

    public Dialog(String text,String detail, int imageLeft, int imageRight, int imageBackground) {
        this.detail = detail;
        this.text = text;
        this.option1 = null;
        this.option2 = null;
        this.option1Action = null;
        this.option2Action = null;
        this.imageLeft = imageLeft;
        this.imageRight = imageRight;
        this.imageBackground = imageBackground;
    }

    public Dialog(String text,String detail, int imageLeft, int imageRight) {
        this.detail = detail;
        this.text = text;
        this.option1 = null;
        this.option2 = null;
        this.option1Action = null;
        this.option2Action = null;
        this.imageLeft = imageLeft;
        this.imageRight = imageRight;
        this.imageBackground = 0;
    }

    public String getDetail() {
        return detail;
    }

    public String getText() {
        return text;
    }

    public String getOption1() {
        return option1;
    }

    public String getOption2() {
        return option2;
    }

    public String getOption1Action() {
        return option1Action;
    }

    public String getOption2Action() {
        return option2Action;
    }

    public int getImageLeft() {
        return imageLeft;
    }

    public int getImageRight() {
        return imageRight;
    }

    public int getImageBackground() {
        return imageBackground;
    }
}

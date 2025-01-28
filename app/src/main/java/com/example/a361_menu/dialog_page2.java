package com.example.a361_menu;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;
import android.os.Handler;

public class dialog_page2 extends AppCompatActivity {

        private int Index = 0;
        List<Dialog> dialogues = new ArrayList<>();
        String message;

        @Override
        public void onBackPressed() {
            super.onBackPressed();
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.dialog_page1);
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR_LANDSCAPE);
            this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

            TextView detailTextView = findViewById(R.id.detail);
            TextView textView = findViewById(R.id.text);
            Button changeTextButton = findViewById(R.id.changeTextButton);
            LinearLayout optionButton = findViewById(R.id.dialogOptions);
            ImageButton opt1 =findViewById(R.id.option1);
            ImageButton opt2 =findViewById(R.id.option2);
            TextView opt1Text = findViewById(R.id.option1Text);
            TextView opt2Text = findViewById(R.id.option2Text);
            View blackScreen = findViewById(R.id.blackScreen);
            ImageView charImageView1 = findViewById(R.id.characterImage1);
            ImageView charImageView2 = findViewById(R.id.characterImage2);
            ImageView backgroundView = findViewById(R.id.background);

            textView.setVisibility(View.GONE);
            detailTextView.setText(getString(R.string.c2_mc_dialog_1));
            charImageView1.setImageResource(R.drawable.mc_scared);
            charImageView2.setImageResource(R.drawable.empty);
            backgroundView.setImageResource(R.drawable.bg_4);
            optionButton.setVisibility(View.GONE);

            dialogues.add(new Dialog(null, getString(R.string.c2_tae_dialog_1), 0, R.drawable.tae_smile));

            //scene12
            dialogues.add(new Dialog(getString(R.string.c2_scene_12_title), getString(R.string.c2_tae_dialog_2), 0, R.drawable.pued_tpose));
            dialogues.add(new Dialog(null, getString(R.string.c2_mc_dialog_2), R.drawable.mc_scared, 0));
            dialogues.add(new Dialog(null, getString(R.string.c2_pued_dialog_2), 0, R.drawable.pued_scared,R.drawable.bg_5));

            //scene13
            dialogues.add(new Dialog(getString(R.string.c2_scene_13_desc), getString(R.string.c2_scene_13_desc), 0, R.drawable.ricardo_normal));
            dialogues.add(new Dialog(null, getString(R.string.c2_ricardo_dialog_1), 0, 1));
            dialogues.add(new Dialog(null, getString(R.string.c2_tae_dialog_3), 0, R.drawable.tae_fear));

            //scene14
            dialogues.add(new Dialog(null, getString(R.string.c2_scene_14_desc), 0, R.drawable.ricardo_flex,R.drawable.bg_6));
            dialogues.add(new Dialog(null,  getString(R.string.c2_scene_14_desc1), 0, R.drawable.ricardo_flex));
            dialogues.add(new Dialog(null,  getString(R.string.c2_scene_14_desc1), getString(R.string.c2_hide_pued), getString(R.string.c2_hide_tae), "hindBehindPued", "hindBehindTae", R.drawable.pued_run, R.drawable.tae_smile));

            changeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    textView.setVisibility(View.GONE);

                    // Get the corresponding dialogue from the dialogues list
                    Dialog dialogue = dialogues.get(Index);

                    // Check if the dialogue exists, then update the UI accordingly
                    if (dialogue != null) {
                        if(dialogue.option1Action == null && dialogue.option2Action == null ){
                            Index++;
                        }
                        updateDialogue(
                                dialogue.getText(),
                                dialogue.getDetail(),
                                dialogue.getOption1(),
                                dialogue.getOption2(),
                                dialogue.getOption1Action(),
                                dialogue.getOption2Action(),
                                dialogue.getImageLeft(),
                                dialogue.getImageRight(),
                                dialogue.getImageBackground()
                        );
                    } else {
                        // Handle the case where no dialogue exists
                        updateDialogue("End of dialogue", null, null, null, null, null, 0, 0,0);
                    }
                }

            });
        }

    private void updateDialogue(String text, String details, String option1Text, String option2Text, String option1Action, String option2Action, int charImage1Path, int charImage2Path,int backgroundPath) {
        // Views
        TextView textView = findViewById(R.id.text);
        TextView detailTextView = findViewById(R.id.detail);
        Button changeTextButton = findViewById(R.id.changeTextButton);
        LinearLayout optionButton = findViewById(R.id.dialogOptions);
        ImageButton opt1 = findViewById(R.id.option1);
        ImageButton opt2 = findViewById(R.id.option2);
        TextView opt1Text = findViewById(R.id.option1Text);
        TextView opt2Text = findViewById(R.id.option2Text);
        View blackScreen = findViewById(R.id.blackScreen);
        ImageView charImageView1 = findViewById(R.id.characterImage1);
        ImageView charImageView2 = findViewById(R.id.characterImage2);
        ImageView backgroundImageView = findViewById(R.id.background);

        // Animations
        Animation moveToSide = AnimationUtils.loadAnimation(this, R.anim.move_to_left);
        Animation moveBack = AnimationUtils.loadAnimation(this, R.anim.move_back_left);
        Animation moveToRight = AnimationUtils.loadAnimation(this, R.anim.move_to_right);
        Animation moveBackRight = AnimationUtils.loadAnimation(this, R.anim.move_back_right);
        Animation optionBounce = AnimationUtils.loadAnimation(this, R.anim.bounce);

        ColorFilter filter_dark = new PorterDuffColorFilter(0x77000000, PorterDuff.Mode.SRC_ATOP);

        if(backgroundPath != 0){
            fadeToBlackBeforeBackgroundChange(backgroundImageView, backgroundPath);
        }
        // Helper method to handle image transitions and animations
        updateCharacterImage(charImage1Path, charImageView1, charImageView2, moveToSide, moveBack, filter_dark);
        updateCharacterImage(charImage2Path, charImageView2, charImageView1, moveToRight, moveBackRight, filter_dark);

        // Handle text visibility and update
        textView.setVisibility(text == null ? View.GONE : View.VISIBLE);
        if (text != null) textView.setText(text);
        //detailTextView.setText(details);
        startTypingAnimation(detailTextView, details, 1);

        handleOptions(option1Text, option2Text, optionButton, changeTextButton, opt1, opt2, opt1Text, opt2Text, optionBounce);

        opt1.setOnClickListener(v -> handleOptionClick(option1Action, optionButton, textView, detailTextView, changeTextButton, blackScreen));
        opt2.setOnClickListener(v -> handleOptionClick(option2Action, optionButton, textView, detailTextView, changeTextButton, blackScreen));

        if(backgroundPath != 0){
            fadeToBlackBeforeBackgroundChange(backgroundImageView, backgroundPath);
        }
    }

        private void updateCharacterImage(int imagePath, ImageView imageView, ImageView otherImageView, Animation moveTo, Animation moveBack, ColorFilter filter) {
            if (imagePath == 1) {
                imageView.clearColorFilter();
            } else if (imagePath == 0) {
                imageView.setColorFilter(filter);
            } else {
                imageView.startAnimation(moveTo);
                otherImageView.setColorFilter(filter);

                moveTo.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        imageView.setImageResource(imagePath);
                        imageView.clearColorFilter();
                        imageView.startAnimation(moveBack);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {
                    }
                });
            }
        }

        private void handleOptions(String option1Text, String option2Text, LinearLayout optionButton, Button changeTextButton, ImageButton opt1, ImageButton opt2, TextView opt1Text, TextView opt2Text, Animation optionBounce) {
            View blackScreen = findViewById(R.id.blackScreen);
            if (option1Text == null && option2Text == null) {
                optionButton.setVisibility(View.GONE);
                changeTextButton.setVisibility(View.VISIBLE);
            } else {
                optionButton.setVisibility(View.VISIBLE);
                changeTextButton.setVisibility(View.GONE);
                blackScreen.setVisibility(View.VISIBLE);

                if (option1Text != null) {
                    opt1Text.setText(option1Text);
                    opt1.setVisibility(View.VISIBLE);
                    opt1.startAnimation(optionBounce);
                } else {
                    opt1.setVisibility(View.GONE);
                }

                if (option2Text != null) {
                    opt2Text.setText(option2Text);
                    opt2.setVisibility(View.VISIBLE);
                    opt2.startAnimation(optionBounce);
                } else {
                    opt2.setVisibility(View.GONE);
                }
            }
        }

        private void handleOptionClick(String optionAction, LinearLayout optionButton, TextView textView, TextView detailTextView, Button changeTextButton, View blackScreen) {
            optionButton.setVisibility(View.GONE);
            changeTextButton.setVisibility(View.VISIBLE);
            blackScreen.setVisibility(View.GONE);
            handleOptionAction(optionAction);
        }


        private void handleOptionAction(String action) {
            switch (action) {
                case "gameOver":
                    Intent gameOverIntent = new Intent(this, GameOverPage.class);
                    gameOverIntent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                    startActivity(gameOverIntent);
                    break;
                case "hindBehindPued":
                    Intent dialog_page3Intent = new Intent(this, dialog_page3.class);
                    dialog_page3Intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                    startActivity(dialog_page3Intent);
                    Index++;
                    break;
                case "hindBehindTae":
                    Intent dialog_page4Intent = new Intent(this, dialog_page4.class);
                    dialog_page4Intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                    startActivity(dialog_page4Intent);
                    Index++;
                    break;
                default:
                    Index++;
                    break;
            }
        }

        private void startTypingAnimation(TextView textView, String fullText, int typingDelay) {
            Handler handler = new Handler();
            int[] index = {0};
            Runnable typingRunnable = new Runnable() {
                @Override
                public void run() {
                    if (index[0] < fullText.length()) {
                        textView.setText(fullText.substring(0, index[0] + 1));
                        index[0]++;
                        handler.postDelayed(this, typingDelay);
                    }
                }
            };
            handler.post(typingRunnable);
        }

    private void fadeToBlackBeforeBackgroundChange(ImageView backgroundImageView, int backgroundPath) {
        View blackOverlay = findViewById(R.id.black_overlay);
        blackOverlay.setVisibility(View.VISIBLE);

        ObjectAnimator fadeToBlack = ObjectAnimator.ofFloat(blackOverlay, "alpha", 0f, 1f);
        fadeToBlack.setDuration(750);

        ObjectAnimator fadeInOverlay = ObjectAnimator.ofFloat(blackOverlay, "alpha", 1f, 0f);
        fadeInOverlay.setDuration(750);

        fadeToBlack.addListener(new Animator.AnimatorListener() {
            @Override public void onAnimationEnd(Animator animation) {
                backgroundImageView.setImageResource(backgroundPath);
                fadeInOverlay.start();
            }
            @Override public void onAnimationStart(Animator animation) {}
            @Override public void onAnimationCancel(Animator animation) {}
            @Override public void onAnimationRepeat(Animator animation) {}
        });

        fadeToBlack.start();
    }
    }
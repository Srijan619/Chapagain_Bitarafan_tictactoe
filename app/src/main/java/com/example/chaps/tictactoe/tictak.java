package com.example.chaps.tictactoe;

import android.app.Activity;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;


public class tictak extends Activity implements View.OnClickListener {

    int amount = 9;
    boolean toast_win = true;
    private ImageButton imageButton_1;
    private ImageButton imageButton_2;
    private ImageButton imageButton_3;
    private ImageButton imageButton_4;
    private ImageButton imageButton_5;
    private ImageButton imageButton_6;
    private ImageButton imageButton_7;
    private ImageButton imageButton_8;
    private ImageButton imageButton_9;

    private TextView txt0;
    private TextView txtdraw;
    private TextView txtX;

    int[] buttonIDs = new int[]{R.id.imgtick1, R.id.imgtick2, R.id.imgtick3, R.id.imgtick1_1, R.id.imgtick1_2, R.id.imgtick1_3, R.id.imgtick2_1, R.id.imgtick2_2, R.id.imgtick2_3};
    private boolean player_1 = true;
    private boolean player_2 = false;


    boolean[] ticked_bool = new boolean[amount];
    int[] intArray = new int[amount];
    int[] intArray_tak = new int[amount];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tictak);
        getActionBar().setDisplayHomeAsUpEnabled(true);

        imageButton_1 = (ImageButton) findViewById(R.id.imgtick1);
        imageButton_2 = (ImageButton) findViewById(R.id.imgtick2);
        imageButton_3 = (ImageButton) findViewById(R.id.imgtick3);
        imageButton_4 = (ImageButton) findViewById(R.id.imgtick1_1);
        imageButton_5 = (ImageButton) findViewById(R.id.imgtick1_2);
        imageButton_6 = (ImageButton) findViewById(R.id.imgtick1_3);
        imageButton_7 = (ImageButton) findViewById(R.id.imgtick2_1);
        imageButton_8 = (ImageButton) findViewById(R.id.imgtick2_2);
        imageButton_9 = (ImageButton) findViewById(R.id.imgtick2_3);
        txt0=(TextView)findViewById(R.id.txt0);
        txtdraw=(TextView)findViewById(R.id.txtDraw);
        txtX=(TextView)findViewById(R.id.txtX);

        imageButton_1.setOnClickListener(this);
        imageButton_2.setOnClickListener(this);
        imageButton_3.setOnClickListener(this);
        imageButton_4.setOnClickListener(this);
        imageButton_5.setOnClickListener(this);
        imageButton_6.setOnClickListener(this);
        imageButton_7.setOnClickListener(this);
        imageButton_8.setOnClickListener(this);
        imageButton_9.setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.clear) {
            clear();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imgtick1:

                if (player_1 == true && ticked_bool[0] == false) {
                    tick(imageButton_1);
                    intArray[0]++;
                    check();
                    ticked_bool[0] = true;
                } else if (player_2 == true && ticked_bool[0] == false) {
                    intArray_tak[0]++;
                    tak(imageButton_1);
                    ticked_bool[0] = true;
                    check();
                }
                break;
            case R.id.imgtick2:
                if (player_1 == true && ticked_bool[1] == false) {
                    tick(imageButton_2);
                    intArray[1]++;
                    check();
                    ticked_bool[1] = true;
                } else if (player_2 == true && ticked_bool[1] == false) {
                    tak(imageButton_2);
                    intArray_tak[1]++;
                    check();
                    ticked_bool[1] = true;
                }
                break;
            case R.id.imgtick3:
                if (player_1 == true && ticked_bool[2] == false) {
                    tick(imageButton_3);
                    intArray[2]++;
                    check();
                    ticked_bool[2] = true;
                } else if (player_2 == true && ticked_bool[2] == false) {
                    tak(imageButton_3);
                    intArray_tak[2]++;
                    check();
                    ticked_bool[2] = true;
                }
                break;
            case R.id.imgtick1_1:
                if (player_1 == true && ticked_bool[3] == false) {
                    tick(imageButton_4);
                    intArray[3]++;
                    check();
                    ticked_bool[3] = true;
                } else if (player_2 == true && ticked_bool[3] == false) {
                    tak(imageButton_4);
                    intArray_tak[3]++;
                    check();
                    ticked_bool[3] = true;
                }
                break;
            case R.id.imgtick1_2:
                if (player_1 == true && ticked_bool[4] == false) {
                    tick(imageButton_5);
                    intArray[4]++;
                    check();
                    ticked_bool[4] = true;
                } else if (player_2 == true && ticked_bool[4] == false) {
                    tak(imageButton_5);
                    intArray_tak[4]++;
                    check();
                    ticked_bool[4] = true;
                }
                break;
            case R.id.imgtick1_3:
                if (player_1 == true && ticked_bool[5] == false) {
                    tick(imageButton_6);
                    intArray[5]++;
                    check();
                    ticked_bool[5] = true;
                } else if (player_2 == true && ticked_bool[5] == false) {
                    tak(imageButton_6);
                    intArray_tak[5]++;
                    check();
                    ticked_bool[5] = true;
                }
                break;
            case R.id.imgtick2_1:
                if (player_1 == true && ticked_bool[6] == false) {
                    tick(imageButton_7);
                    intArray[6]++;
                    check();
                    ticked_bool[6] = true;
                } else if (player_2 == true && ticked_bool[6] == false) {
                    tak(imageButton_7);
                    intArray_tak[6]++;
                    check();
                    ticked_bool[6] = true;
                }
                break;
            case R.id.imgtick2_2:
                if (player_1 == true && ticked_bool[7] == false) {
                    tick(imageButton_8);
                    intArray[7]++;
                    check();
                    ticked_bool[7] = true;
                } else if (player_2 == true && ticked_bool[7] == false) {
                    tak(imageButton_8);
                    intArray_tak[7]++;
                    check();
                    ticked_bool[7] = true;
                }
                break;
            case R.id.imgtick2_3:
                if (player_1 == true && ticked_bool[8] == false) {
                    tick(imageButton_9);
                    intArray[8]++;
                    check();
                    ticked_bool[8] = true;
                } else if (player_2 == true && ticked_bool[8] == false) {
                    tak(imageButton_9);
                    intArray_tak[8]++;
                    check();
                    ticked_bool[8] = true;
                }
                break;
            default:
                break;
        }

    }

    void tick(ImageButton img) {
        img.setImageResource(R.drawable.trans_tic_on);
        ((TransitionDrawable) img.getDrawable()).startTransition(2500);
        player_2 = true;
        player_1 = false;


    }

    void tak(ImageButton img) {
        img.setImageResource(R.drawable.trans_tak_on);
        ((TransitionDrawable) img.getDrawable()).startTransition(2500);
        player_2 = false;
        player_1 = true;

    }


    void clear() {
        for (int i = 0; i < buttonIDs.length; i++) {
            ImageButton b = (ImageButton) findViewById(buttonIDs[i]);
            b.setImageResource(R.drawable.empty);
        }
        player_1 = true;
        player_2 = false;

        for (int t = 0; t < amount; t++) {
            ticked_bool[t] = false;
        }
        for (int h = 0; h < amount; h++) {
            intArray[h] = 0;
        }
        for (int k = 0; k < amount; k++) {
            intArray_tak[k] = 0;
        }
        toast_win = true;
    }

    void check() {

        if (intArray[0] == 1 && intArray[1] == 1 && intArray[2] == 1) {
            toast_message_tik();
        } else if (intArray_tak[0] == 1 && intArray_tak[1] == 1 && intArray_tak[2] == 1) {
            toast_message_tak();
        } else if (intArray[0] == 1 && intArray[3] == 1 && intArray[6] == 1) {
            toast_message_tik();
        } else if (intArray_tak[0] == 1 && intArray_tak[3] == 1 && intArray_tak[6] == 1) {
            toast_message_tak();
        } else if (intArray[0] == 1 && intArray[4] == 1 && intArray[8] == 1) {
            toast_message_tik();
        } else if (intArray_tak[0] == 1 && intArray_tak[4] == 1 && intArray_tak[8] == 1) {
            toast_message_tak();
        } else if (intArray[3] == 1 && intArray[6] == 1 && intArray[9] == 1) {
            toast_message_tik();
        } else if (intArray_tak[3] == 1 && intArray_tak[6] == 1 && intArray_tak[9] == 1) {
            toast_message_tak();
        } else if (intArray[2] == 1 && intArray[5] == 1 && intArray[8] == 1) {
            toast_message_tik();
        } else if (intArray_tak[2] == 1 && intArray_tak[5] == 1 && intArray_tak[8] == 1) {
            toast_message_tak();
        } else if (intArray[4] == 1 && intArray[5] == 1 && intArray[6] == 1) {
            toast_message_tik();
        } else if (intArray_tak[4] == 1 && intArray_tak[5] == 1 && intArray_tak[6] == 1) {
            toast_message_tak();
        } else if (intArray[7] == 1 && intArray[8] == 1 && intArray[9] == 1) {
            toast_message_tik();
        } else if (intArray_tak[7] == 1 && intArray_tak[8] == 1 && intArray_tak[9] == 1) {
            toast_message_tak();
        } else if (intArray[7] == 1 && intArray[5] == 1 && intArray[3] == 1) {
            toast_message_tik();
        } else if (intArray_tak[7] == 1 && intArray_tak[5] == 1 && intArray_tak[3] == 1) {
            toast_message_tak();
        }
        else
        {
        }
    }

    void toast_message_tik() {

        Toast.makeText(this, "0 wins", Toast.LENGTH_SHORT).show();

    }

    void toast_message_tak() {
        Toast.makeText(this, "X wins", Toast.LENGTH_SHORT).show();
    }
    void toast_message_draw() {
        Toast.makeText(this, "Draw", Toast.LENGTH_SHORT).show();
    }
}

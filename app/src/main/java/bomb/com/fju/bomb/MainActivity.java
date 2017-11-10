package bomb.com.fju.bomb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random random = new Random();
    int ram = random.nextInt(100) + 1;
    int max = 100;
    int min = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void bomb(View view) {
        TextView r = (TextView) findViewById(R.id.t_n);
        r.setText(Integer.toString(ram));
        EditText edNumber = (EditText) findViewById(R.id.num);
        int num = Integer.parseInt(edNumber.getText().toString());
        TextView n = (TextView) findViewById(R.id.textView1);
        if (num > ram) {
            n.setText(min + "-" + num);
            max =num;
        } else if (ram > num) {
            n.setText(num + "-" + max);
            min = num;
        } else {
            n.setText(num + "答對囉~");
        }
    }
}
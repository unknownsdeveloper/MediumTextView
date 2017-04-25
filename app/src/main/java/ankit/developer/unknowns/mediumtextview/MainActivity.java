package ankit.developer.unknowns.mediumtextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import io.github.angebagui.mediumtextview.MediumTextView;

public class MainActivity extends AppCompatActivity {

    String htmlContents="<p> This is simple HTML with Image and Video</p>"

            +"<img src=\"https://c2.staticflickr.com/8/7776/29595429664_1d854547aa_o.png\" height=\"100\" width=\"100\" alt=\"Image\"/>"

            +"<iframe width=\"560\" height=\"315\" src=\"https://www.google.com\" frameborder=\"0\" allowfullscreen></iframe>";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MediumTextView mediumTextView = (MediumTextView)findViewById(R.id.mediumTextView);
        mediumTextView.setText(htmlContents);

    }
}

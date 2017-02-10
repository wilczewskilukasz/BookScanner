package com.soldiersofmobile.bookscanner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.soldiersofmobile.bookscanner.api.model.VolumeInfo;
import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

import butterknife.BindView;

import static android.R.attr.id;
import static com.soldiersofmobile.bookscanner.R.id.title_text_view;

public class BookDetailsActivity extends AppCompatActivity {

    @BindView(R.id.image_view)
    ImageView coverImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_details);

        VolumeInfo volumeInfo = (VolumeInfo) getIntent().getSerializableExtra(BookScannerActivity.VOLUME_INFO_EXTRA);

        Picasso.with(this)
                .load(volumeInfo.getImageLinks().getThumbnail())
                .into(coverImageView);

        TextView title = (TextView) findViewById(R.id.title_text_view);
        title.setText(volumeInfo.getTitle().toString());

        TextView subtitle = (TextView) findViewById(R.id.subtitle_text_view);
        subtitle.setText(volumeInfo.getSubtitle());

        TextView author = (TextView) findViewById(R.id.author_text_view);
        author.setText(volumeInfo.getAuthors().toString());

        TextView description = (TextView) findViewById(R.id.description_text_view);
        description.setText(volumeInfo.getDescription());
    }
}

import android.os.Bundle;
import android.view.ViewGroup.LayoutParams;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Create a new webview instance
        webView = new WebView(this);
        setContentView(webView, new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
        // Load a URL in the WebView
        webView.loadUrl("http://www.google.com/");
    }
    @Override
    public void onBackPressed() {
        // Check if the WebView can navigate back
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}

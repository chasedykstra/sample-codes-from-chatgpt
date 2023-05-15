import android.os.Bundle
import android.view.ViewGroup.LayoutParams.MATCH_PARENT
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var webView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Create a new webview instance
        webView = WebView(this)
        setContentView(webView, LayoutParams.MATCH_PARENT, MATCH_PARENT)

        // Load a URL in the WebView
        webView.loadUrl("http://www.google.com/")

    }

    override fun onBackPressed() {
        // Check if the WebView can navigate back
        if (webView.canGoBack()) {
            webView.goBack()
        } else {
            super.onBackPressed()
        }
    }


}
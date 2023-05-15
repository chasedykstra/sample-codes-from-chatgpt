#include <iostream>
#include <string>
#include <WebView.h>
#include <android/os/Bundle.h>
#include <android/view/ViewGroup.h>
#include <androidx/appcompat/app/AppCompatActivity.h>

using namespace std;
using namespace android;
using namespace android::os;
using namespace android::view;
using namespace androidx::appcompat::app;

class MainActivity : public AppCompatActivity {
private:
    WebView webView;
public:
    void onCreate(Bundle savedInstanceState) override {
        AppCompatActivity::onCreate(savedInstanceState);
        // Create a new webview instance
        webView = WebView(this);
        setContentView(webView, LayoutParams::MATCH_PARENT, LayoutParams::MATCH_PARENT);
        // Load a URL in the WebView
        webView.loadUrl("http://www.google.com/");
    }
    void onBackPressed() override {
        // Check if the WebView can navigate back
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            AppCompatActivity::onBackPressed();
        }
    }
};

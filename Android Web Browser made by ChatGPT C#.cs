using Android.App;
using Android.OS;
using Android.Webkit;
using Android.Views;

namespace MyAppNamespace
{
    [Activity(Label = "MainActivity")]
    public class MainActivity : Activity
    {
        private WebView webView;

        protected override void OnCreate(Bundle savedInstanceState)
        {
            base.OnCreate(savedInstanceState);

            // Create a new webview instance
            webView = new WebView(this);
            SetContentView(webView, new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MatchParent, ViewGroup.LayoutParams.MatchParent));

            // Load a URL in the WebView
            webView.LoadUrl("http://www.google.com/");
        }

        public override void OnBackPressed()
        {
            // Check if the WebView can navigate back
            if (webView.CanGoBack())
            {
                webView.GoBack();
            }
            else
            {
                base.OnBackPressed();
            }
        }
    }
}

import androidx.compose.ui.window.ComposeUIViewController
import org.company.hmshohrab.App
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController = ComposeUIViewController { App() }

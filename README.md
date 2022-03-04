
# capacitor-insets-v2
Plugin that sends the device insets, works only on android, and send only top, based on an original idea from [https://github.com/igorcd/capacitor-insets-plugin](https://github.com/igorcd/capacitor-insets-plugin/) which works only for Capacitor 2. This project have been refactored in order to be compatible with Capacitor v3.
Fell free to open a pull request

## Installation:
```sh
npm install --save https://github.com/jorisbertomeu/capacitor-insets-v2
npx cap sync
```

# Android:
```java
// Add this line
import eu.bertom.lab.capacitor.plugin.insetsv2.InsetsV2Plugin;

public class MainActivity extends BridgeActivity {
  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

   	// Add this line
	registerPlugin(InsetsV2Plugin.class);
  }
}
```


## Usage:
```typescript
const { StatusBar, InsetsV2 } = Plugins;

try {
	const insetsResp = await InsetsV2.top();
	StatusBar.setOverlaysWebView({ overlay: true });
	document.documentElement.style.setProperty('--ion-safe-area-top', `${insetsResp.value}px`);
} catch(e) {
	console.log(e);
}
   
```

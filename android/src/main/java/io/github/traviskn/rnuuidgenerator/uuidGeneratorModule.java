package io.github.letsfinin.uuidgenerator;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

import java.util.UUID;

public class uuidGeneratorModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public uuidGeneratorModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "uuidGenerator";
  }

  @ReactMethod
  public void getUUID(Callback callback) {
    String uuid = UUID.randomUUID().toString();

    callback.invoke(uuid);
  }
}

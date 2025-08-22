package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Trimble device specifications for Android Compose previews.
 *
 * This extension provides Trimble device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Trimble.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Trimble: Any
  get() = object {
      /** Trimble bcat */
      val BCAT = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Trimble E7167 */
      val E7167 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Trimble EE773X_4G */
      val EE773X_4G = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Trimble EE773X_WiFi */
      val EE773X_WIFI = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Trimble pdog */
      val PDOG = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Trimble TDC6 */
      val TDC6 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** Trimble TDC600_2 */
      val TDC600_2 = "spec:width=1080,height=1920,unit=px,dpi=480"

  }

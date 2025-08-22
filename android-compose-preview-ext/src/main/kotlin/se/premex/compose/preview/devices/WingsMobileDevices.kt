package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Wings_Mobile device specifications for Android Compose previews.
 *
 * This extension provides Wings_Mobile device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.WingsMobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.WingsMobile: Any
  get() = object {
      /** Wings_Mobile W4 */
      val W4 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Wings_Mobile W7_Q */
      val W7_Q = "spec:width=1080,height=2340,unit=px,dpi=480"

  }

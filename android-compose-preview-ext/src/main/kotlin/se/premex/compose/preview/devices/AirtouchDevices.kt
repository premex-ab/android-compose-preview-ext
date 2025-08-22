package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * AirTouch device specifications for Android Compose previews.
 *
 * This extension provides AirTouch device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Airtouch.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Airtouch: Any
  get() = object {
      /** AirTouch AirTouch5 */
      val AIRTOUCH5 = "spec:width=800,height=1280,unit=px,dpi=160"

  }

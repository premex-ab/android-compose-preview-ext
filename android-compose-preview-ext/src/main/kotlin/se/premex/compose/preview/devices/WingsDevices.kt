package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Wings device specifications for Android Compose previews.
 *
 * This extension provides Wings device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Wings.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Wings: Any
  get() = object {
      /** Wings W1 */
      val W1 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Wings W3 */
      val W3 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** Wings W6 */
      val W6 = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** Wings W7 */
      val W7 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** Wings WX */
      val WX = "spec:width=1080,height=2340,unit=px,dpi=480"

  }

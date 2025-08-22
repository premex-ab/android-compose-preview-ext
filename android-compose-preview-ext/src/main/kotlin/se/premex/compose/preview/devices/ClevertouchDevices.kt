package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Clevertouch device specifications for Android Compose previews.
 *
 * This extension provides Clevertouch device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Clevertouch.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Clevertouch: Any
  get() = object {
      /** Clevertouch MT9679 */
      val MT9679 = "spec:width=2160,height=3840,unit=px,dpi=480"

      /** Clevertouch rk3588_t */
      val RK3588_T = "spec:width=2160,height=3840,unit=px,dpi=480"

  }

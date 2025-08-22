package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * MAXHUB device specifications for Android Compose previews.
 *
 * This extension provides MAXHUB device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Maxhub.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Maxhub: Any
  get() = object {
      /** MAXHUB E3 */
      val E3 = "spec:width=2160,height=3840,unit=px,dpi=480"

      /** MAXHUB rk3588_t */
      val RK3588_T = "spec:width=2160,height=3840,unit=px,dpi=480"

  }

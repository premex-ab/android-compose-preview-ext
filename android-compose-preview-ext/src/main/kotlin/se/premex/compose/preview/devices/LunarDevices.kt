package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * LUNAR device specifications for Android Compose previews.
 *
 * This extension provides LUNAR device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Lunar.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Lunar: Any
  get() = object {
      /** LUNAR Lunar_Eclipse_L1 */
      val LUNAR_ECLIPSE_L1 = "spec:width=1080,height=2460,unit=px,dpi=480"

  }

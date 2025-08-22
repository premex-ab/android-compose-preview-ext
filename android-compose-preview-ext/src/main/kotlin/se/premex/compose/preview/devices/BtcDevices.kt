package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * BTC device specifications for Android Compose previews.
 *
 * This extension provides BTC device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Btc.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Btc: Any
  get() = object {
      /** BTC S5548 */
      val S5548 = "spec:width=480,height=960,unit=px,dpi=160"

  }

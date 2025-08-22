package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * COIN device specifications for Android Compose previews.
 *
 * This extension provides COIN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Coin.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Coin: Any
  get() = object {
      /** COIN 1100AS_plus */
      val _1100AS_PLUS = "spec:width=800,height=1280,unit=px,dpi=180"

      /** COIN 1200AS */
      val _1200AS = "spec:width=800,height=1280,unit=px,dpi=160"

      /** COIN 1200AS_plus */
      val _1200AS_PLUS = "spec:width=800,height=1280,unit=px,dpi=210"

  }

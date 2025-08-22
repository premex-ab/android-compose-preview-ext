package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Synetech device specifications for Android Compose previews.
 *
 * This extension provides Synetech device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Synetech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Synetech: Any
  get() = object {
      /** Synetech rk3588_t */
      val RK3588_T = "spec:width=2160,height=3840,unit=px,dpi=480"

  }

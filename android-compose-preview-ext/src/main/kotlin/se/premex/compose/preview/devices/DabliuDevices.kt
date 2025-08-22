package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * DABLIU device specifications for Android Compose previews.
 *
 * This extension provides DABLIU device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Dabliu.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Dabliu: Any
  get() = object {
      /** DABLIU rk3588_E13R */
      val RK3588_E13R = "spec:width=2160,height=3840,unit=px,dpi=420"

  }

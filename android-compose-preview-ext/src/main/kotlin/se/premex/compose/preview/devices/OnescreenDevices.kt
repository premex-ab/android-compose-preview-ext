package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * OneScreen device specifications for Android Compose previews.
 *
 * This extension provides OneScreen device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Onescreen.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Onescreen: Any
  get() = object {
      /** OneScreen rk3588_t */
      val RK3588_T = "spec:width=2160,height=3840,unit=px,dpi=480"

      /** OneScreen Wandr */
      val WANDR = "spec:width=2160,height=3840,unit=px,dpi=320"

  }

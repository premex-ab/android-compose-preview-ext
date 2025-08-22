package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * miracle_tap device specifications for Android Compose previews.
 *
 * This extension provides miracle_tap device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MiracleTap.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MiracleTap: Any
  get() = object {
      /** miracle_tap miracle_tap_10 */
      val MIRACLE_TAP_10 = "spec:width=1200,height=1920,unit=px,dpi=213"

  }

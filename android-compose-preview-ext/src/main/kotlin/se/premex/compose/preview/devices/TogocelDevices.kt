package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Togocel device specifications for Android Compose previews.
 *
 * This extension provides Togocel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Togocel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Togocel: Any
  get() = object {
      /** Togocel S63 */
      val S63 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Togocel Togocel_F1_Max_4G */
      val TOGOCEL_F1_MAX_4G = "spec:width=720,height=1440,unit=px,dpi=320"

  }

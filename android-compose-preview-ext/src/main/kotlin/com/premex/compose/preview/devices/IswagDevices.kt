package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ISWAG device specifications for Android Compose previews.
 *
 * This extension provides ISWAG device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Iswag.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Iswag: Any
  get() = object {
      /** ISWAG Alpha */
      val ALPHA = "spec:width=480,height=800,unit=px,dpi=240"

      /** ISWAG ISWAG_KRONOSX */
      val ISWAG_KRONOSX = "spec:width=480,height=960,unit=px,dpi=240"

      /** ISWAG ISWAG_MATRIX */
      val ISWAG_MATRIX = "spec:width=720,height=1640,unit=px,dpi=320"

      /** ISWAG ISWAG_NEO */
      val ISWAG_NEO = "spec:width=720,height=1600,unit=px,dpi=300"

      /** ISWAG ISWAG_VIPER */
      val ISWAG_VIPER = "spec:width=720,height=1440,unit=px,dpi=320"

      /** ISWAG STREAM7 */
      val STREAM7 = "spec:width=600,height=1024,unit=px,dpi=213"

  }

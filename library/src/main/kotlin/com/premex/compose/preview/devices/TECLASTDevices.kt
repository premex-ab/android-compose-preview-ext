package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TECLAST device specifications for Android Compose previews.
 *
 * This extension provides TECLAST device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TECLAST.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TECLAST: Any
  get() = object {
      /** TECLAST M40_EEA */
      val M40_EEA = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** TECLAST M40_ROW */
      val M40_ROW = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** TECLAST P30_ROW */
      val P30_ROW = "spec:width=800,height=1280,unit=px,dpi=180"

  }

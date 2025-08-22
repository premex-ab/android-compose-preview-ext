package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Epson device specifications for Android Compose previews.
 *
 * This extension provides Epson device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Epson.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Epson: Any
  get() = object {
      /** Epson Bushi */
      val BUSHI = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Epson embt4 */
      val EMBT4 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Epson sti6200d101 */
      val STI6200D101 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Epson sti6202d101 */
      val STI6202D101 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }

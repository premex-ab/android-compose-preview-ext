package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Smartab device specifications for Android Compose previews.
 *
 * This extension provides Smartab device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Smartab.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Smartab: Any
  get() = object {
      /** Smartab ST1009 */
      val ST1009 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Smartab ST1009X */
      val ST1009X = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Smartab ST7150 */
      val ST7150 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Smartab ST7160 */
      val ST7160 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Smartab ST7650 */
      val ST7650 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Smartab ST7680 */
      val ST7680 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Smartab ST8888 */
      val ST8888 = "spec:width=800,height=1280,unit=px,dpi=160"

  }

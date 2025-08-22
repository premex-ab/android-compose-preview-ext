package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Ascom device specifications for Android Compose previews.
 *
 * This extension provides Ascom device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ascom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ascom: Any
  get() = object {
      /** Ascom ABAA */
      val ABAA = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Ascom ABBA */
      val ABBA = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Ascom ACBA */
      val ACBA = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Ascom ADAA */
      val ADAA = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Ascom SH4-1 */
      val SH4_1 = "spec:width=1080,height=2160,unit=px,dpi=440"

      /** Ascom SH4-2 */
      val SH4_2 = "spec:width=1080,height=2160,unit=px,dpi=440"

  }

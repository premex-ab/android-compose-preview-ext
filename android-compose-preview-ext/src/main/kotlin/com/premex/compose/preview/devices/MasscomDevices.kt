package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Masscom device specifications for Android Compose previews.
 *
 * This extension provides Masscom device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Masscom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Masscom: Any
  get() = object {
      /** Masscom Masstel_X1 */
      val MASSTEL_X1 = "spec:width=480,height=960,unit=px,dpi=240"

      /** Masscom Masstel_X3 */
      val MASSTEL_X3 = "spec:width=480,height=960,unit=px,dpi=240"

      /** Masscom Masstel_X5 */
      val MASSTEL_X5 = "spec:width=720,height=1440,unit=px,dpi=320"

  }

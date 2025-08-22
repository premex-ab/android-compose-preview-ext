package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Selecline device specifications for Android Compose previews.
 *
 * This extension provides Selecline device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Selecline.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Selecline: Any
  get() = object {
      /** Selecline SP19403 */
      val SP19403 = "spec:width=480,height=800,unit=px,dpi=240"

      /** Selecline SP19504 */
      val SP19504 = "spec:width=480,height=960,unit=px,dpi=240"

  }

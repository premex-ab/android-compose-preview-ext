package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Westgate device specifications for Android Compose previews.
 *
 * This extension provides Westgate device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Westgate.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Westgate: Any
  get() = object {
      /** Westgate Westgate-T801 */
      val WESTGATE_T801 = "spec:width=800,height=1280,unit=px,dpi=213"

  }

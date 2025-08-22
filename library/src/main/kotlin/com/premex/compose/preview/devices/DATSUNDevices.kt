package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DATSUN device specifications for Android Compose previews.
 *
 * This extension provides DATSUN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DATSUN.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DATSUN: Any
  get() = object {
      /** DATSUN Datsun_D5001 */
      val DATSUN_D5001 = "spec:width=480,height=960,unit=px,dpi=240"

  }

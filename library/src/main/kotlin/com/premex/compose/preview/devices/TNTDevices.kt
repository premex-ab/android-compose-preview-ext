package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TNT device specifications for Android Compose previews.
 *
 * This extension provides TNT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TNT.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TNT: Any
  get() = object {
      /** TNT TNT_PANALO_PHONE_5G */
      val TNT_PANALO_PHONE_5G = "spec:width=720,height=1600,unit=px,dpi=320"

  }

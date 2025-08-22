package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * VOD_Horizon device specifications for Android Compose previews.
 *
 * This extension provides VOD_Horizon device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.VodHorizon.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.VodHorizon: Any
  get() = object {
      /** VOD_Horizon 5G_Smart_Phone */
      val _5G_SMART_PHONE = "spec:width=1080,height=2400,unit=px,dpi=400"

  }

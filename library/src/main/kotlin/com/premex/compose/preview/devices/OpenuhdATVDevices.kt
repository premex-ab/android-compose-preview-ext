package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * open_uhd_ATV device specifications for Android Compose previews.
 *
 * This extension provides open_uhd_ATV device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.OpenuhdATV.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.OpenuhdATV: Any
  get() = object {
      /** open_uhd_ATV open_uhd_ap */
      val OPEN_UHD_AP = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** open_uhd_ATV open_uhd_hk */
      val OPEN_UHD_HK = "spec:width=1080,height=1920,unit=px,dpi=320"

  }

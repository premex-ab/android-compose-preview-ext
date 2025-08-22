package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Letv device specifications for Android Compose previews.
 *
 * This extension provides Letv device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Letv.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Letv: Any
  get() = object {
      /** Letv DemeterDV */
      val DEMETERDV = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Letv DemeterUHD */
      val DEMETERUHD = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Letv le_s2_ww */
      val LE_S2_WW = "spec:width=1080,height=1920,unit=px,dpi=420"

      /** Letv le_x2 */
      val LE_X2 = "spec:width=1440,height=2560,unit=px,dpi=560"

      /** Letv X3_HK */
      val X3_HK = "spec:width=1080,height=1920,unit=px,dpi=420"

      /** Letv x600 */
      val X600 = "spec:width=1080,height=1920,unit=px,dpi=480"

  }

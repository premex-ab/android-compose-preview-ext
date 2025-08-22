package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * KODAK device specifications for Android Compose previews.
 *
 * This extension provides KODAK device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.KODAK.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.KODAK: Any
  get() = object {
      /** KODAK KODAK_SMARTWAY_L1 */
      val KODAK_SMARTWAY_L1 = "spec:width=480,height=960,unit=px,dpi=240"

      /** KODAK KODAK_SMARTWAY_T2 */
      val KODAK_SMARTWAY_T2 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** KODAK L1_PRO */
      val L1_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** KODAK marina */
      val MARINA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** KODAK nagata */
      val NAGATA = "spec:width=720,height=1280,unit=px,dpi=213"

      /** KODAK SMARTWAY_F1 */
      val SMARTWAY_F1 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** KODAK SMARTWAY_L2 */
      val SMARTWAY_L2 = "spec:width=444,height=960,unit=px,dpi=200"

      /** KODAK SMARTWAY_M2 */
      val SMARTWAY_M2 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** KODAK Smartway_T1 */
      val SMARTWAY_T1 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** KODAK SMARTWAY_T3 */
      val SMARTWAY_T3 = "spec:width=600,height=1280,unit=px,dpi=280"

      /** KODAK SMARTWAY_X2 */
      val SMARTWAY_X2 = "spec:width=720,height=1560,unit=px,dpi=320"

  }

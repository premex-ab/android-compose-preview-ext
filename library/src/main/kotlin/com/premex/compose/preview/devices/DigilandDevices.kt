package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Digiland device specifications for Android Compose previews.
 *
 * This extension provides Digiland device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Digiland.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Digiland: Any
  get() = object {
      /** Digiland DL1001 */
      val DL1001 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Digiland DL1050 */
      val DL1050 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Digiland mid1008 */
      val MID1008 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Digiland mid1016 */
      val MID1016 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Digiland mid1016_ma */
      val MID1016_MA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Digiland mid1032_mr_32 */
      val MID1032_MR_32 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Digiland mid1109_mx */
      val MID1109_MX = "spec:width=800,height=1280,unit=px,dpi=160"

  }

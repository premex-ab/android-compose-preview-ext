package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * GOODTEL device specifications for Android Compose previews.
 *
 * This extension provides GOODTEL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.GOODTEL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.GOODTEL: Any
  get() = object {
      /** GOODTEL G10_EEA */
      val G10_EEA = "spec:width=800,height=1280,unit=px,dpi=180"

      /** GOODTEL G10_T_EEA */
      val G10_T_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** GOODTEL G10_T_US */
      val G10_T_US = "spec:width=800,height=1280,unit=px,dpi=160"

      /** GOODTEL G10_US */
      val G10_US = "spec:width=800,height=1280,unit=px,dpi=160"

      /** GOODTEL G2_A_EEA */
      val G2_A_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** GOODTEL G2_T_EEA */
      val G2_T_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** GOODTEL G2_T_US */
      val G2_T_US = "spec:width=800,height=1280,unit=px,dpi=213"

      /** GOODTEL G3 */
      val G3 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** GOODTEL G3_US */
      val G3_US = "spec:width=800,height=1280,unit=px,dpi=160"

      /** GOODTEL G7 */
      val G7 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** GOODTEL G7_EEA */
      val G7_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** GOODTEL G7_EEA_T */
      val G7_EEA_T = "spec:width=600,height=1024,unit=px,dpi=160"

      /** GOODTEL G7_T */
      val G7_T = "spec:width=600,height=1024,unit=px,dpi=160"

      /** GOODTEL G9_EEA */
      val G9_EEA = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** GOODTEL G9_US */
      val G9_US = "spec:width=1200,height=2000,unit=px,dpi=240"

  }

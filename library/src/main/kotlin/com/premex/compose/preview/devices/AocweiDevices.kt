package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Aocwei device specifications for Android Compose previews.
 *
 * This extension provides Aocwei device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Aocwei.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Aocwei: Any
  get() = object {
      /** Aocwei X300 */
      val X300 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Aocwei X300_EEA */
      val X300_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Aocwei X300_EEA_T */
      val X300_EEA_T = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Aocwei X500_EEA */
      val X500_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Aocwei X500_T_EEA */
      val X500_T_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Aocwei X500_US */
      val X500_US = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Aocwei X700_EEA */
      val X700_EEA = "spec:width=800,height=1280,unit=px,dpi=180"

      /** Aocwei X900_EEA */
      val X900_EEA = "spec:width=800,height=1280,unit=px,dpi=210"

      /** Aocwei X900-US */
      val X900_US = "spec:width=1200,height=2000,unit=px,dpi=240"

  }

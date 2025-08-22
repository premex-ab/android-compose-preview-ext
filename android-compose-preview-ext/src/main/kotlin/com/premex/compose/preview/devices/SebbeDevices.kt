package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SEBBE device specifications for Android Compose previews.
 *
 * This extension provides SEBBE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Sebbe.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Sebbe: Any
  get() = object {
      /** SEBBE S21_EEA */
      val S21_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** SEBBE S22_EEA */
      val S22_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** SEBBE S23_EEA */
      val S23_EEA = "spec:width=800,height=1332,unit=px,dpi=160"

      /** SEBBE S23_EEA_A */
      val S23_EEA_A = "spec:width=800,height=1280,unit=px,dpi=160"

      /** SEBBE S23_T_EEA */
      val S23_T_EEA = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** SEBBE S23_T_US */
      val S23_T_US = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** SEBBE S23_US */
      val S23_US = "spec:width=800,height=1332,unit=px,dpi=160"

      /** SEBBE S23_US_B */
      val S23_US_B = "spec:width=800,height=1280,unit=px,dpi=160"

  }

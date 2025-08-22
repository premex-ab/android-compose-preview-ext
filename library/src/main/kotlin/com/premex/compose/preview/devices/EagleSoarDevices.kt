package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * EagleSoar device specifications for Android Compose previews.
 *
 * This extension provides EagleSoar device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.EagleSoar.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.EagleSoar: Any
  get() = object {
      /** EagleSoar E10A_EEA */
      val E10A_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** EagleSoar EE10A */
      val EE10A = "spec:width=800,height=1280,unit=px,dpi=213"

      /** EagleSoar EE-35_EEA */
      val EE_35_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** EagleSoar EE-P30_EEA */
      val EE_P30_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** EagleSoar E-764-EEA */
      val E_764_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

  }

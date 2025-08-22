package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * JUSYEA device specifications for Android Compose previews.
 *
 * This extension provides JUSYEA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.JUSYEA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.JUSYEA: Any
  get() = object {
      /** JUSYEA J10_EEA */
      val J10_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** JUSYEA J10_US */
      val J10_US = "spec:width=800,height=1280,unit=px,dpi=160"

      /** JUSYEA J5_EEA */
      val J5_EEA = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** JUSYEA J6_EEA */
      val J6_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** JUSYEA J8 */
      val J8 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** JUSYEA J8_EEA */
      val J8_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** JUSYEA J8_EEA_T */
      val J8_EEA_T = "spec:width=600,height=1024,unit=px,dpi=160"

      /** JUSYEA J8_T */
      val J8_T = "spec:width=600,height=1024,unit=px,dpi=160"

      /** JUSYEA J9_EEA */
      val J9_EEA = "spec:width=1200,height=2000,unit=px,dpi=240"

  }

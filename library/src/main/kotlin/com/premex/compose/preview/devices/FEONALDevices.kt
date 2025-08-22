package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * FEONAL device specifications for Android Compose previews.
 *
 * This extension provides FEONAL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.FEONAL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.FEONAL: Any
  get() = object {
      /** FEONAL D105_EEA */
      val D105_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** FEONAL D106_EEA */
      val D106_EEA = "spec:width=800,height=1280,unit=px,dpi=200"

      /** FEONAL D115_EEA */
      val D115_EEA = "spec:width=800,height=1280,unit=px,dpi=240"

      /** FEONAL D118_EEA */
      val D118_EEA = "spec:width=800,height=1280,unit=px,dpi=200"

      /** FEONAL K118_EEA */
      val K118_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** FEONAL K711_EEA */
      val K711_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

  }

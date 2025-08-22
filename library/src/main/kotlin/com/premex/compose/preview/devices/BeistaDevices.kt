package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BEISTA device specifications for Android Compose previews.
 *
 * This extension provides BEISTA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Beista.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Beista: Any
  get() = object {
      /** BEISTA K105 */
      val K105 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** BEISTA T30-EEA */
      val T30_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** BEISTA X101 */
      val X101 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** BEISTA X104 */
      val X104 = "spec:width=1200,height=1920,unit=px,dpi=260"

      /** BEISTA X104-EEA */
      val X104_EEA = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** BEISTA X80-EEA */
      val X80_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

  }

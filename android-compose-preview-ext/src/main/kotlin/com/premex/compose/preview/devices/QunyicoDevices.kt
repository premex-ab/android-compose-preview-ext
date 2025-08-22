package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * qunyiCO device specifications for Android Compose previews.
 *
 * This extension provides qunyiCO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Qunyico.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Qunyico: Any
  get() = object {
      /** qunyiCO Y10 */
      val Y10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** qunyiCO Y10_1 */
      val Y10_1 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** qunyiCO Y10_EEA */
      val Y10_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** qunyiCO Y7 */
      val Y7 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** qunyiCO Y7_0 */
      val Y7_0 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** qunyiCO Y7_0_EEA */
      val Y7_0_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** qunyiCO Y7_EEA */
      val Y7_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

  }

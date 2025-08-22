package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * neocore device specifications for Android Compose previews.
 *
 * This extension provides neocore device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Neocore.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Neocore: Any
  get() = object {
      /** neocore neocore_E1_2_eea */
      val NEOCORE_E1_2_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** neocore NEOCORE_E2 */
      val NEOCORE_E2 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** neocore neocore_N1G1 */
      val NEOCORE_N1G1 = "spec:width=800,height=1280,unit=px,dpi=160"

  }

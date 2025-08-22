package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * VESTEL device specifications for Android Compose previews.
 *
 * This extension provides VESTEL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Vestel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Vestel: Any
  get() = object {
      /** VESTEL VTABZ1A */
      val VTABZ1A = "spec:width=800,height=1280,unit=px,dpi=213"

      /** VESTEL V_TAB_1050 */
      val V_TAB_1050 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** VESTEL V_TAB_7020A */
      val V_TAB_7020A = "spec:width=720,height=1280,unit=px,dpi=240"

      /** VESTEL V_TAB_7810 */
      val V_TAB_7810 = "spec:width=768,height=1024,unit=px,dpi=160"

  }

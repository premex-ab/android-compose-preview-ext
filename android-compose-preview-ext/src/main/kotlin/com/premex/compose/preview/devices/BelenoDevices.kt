package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BeLeno device specifications for Android Compose previews.
 *
 * This extension provides BeLeno device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Beleno.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Beleno: Any
  get() = object {
      /** BeLeno BeLeno_Neod_8 */
      val BELENO_NEOD_8 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** BeLeno BeLeno_Turbo_101 */
      val BELENO_TURBO_101 = "spec:width=800,height=1280,unit=px,dpi=160"

  }

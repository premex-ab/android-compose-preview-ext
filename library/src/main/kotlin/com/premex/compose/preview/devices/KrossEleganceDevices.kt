package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Kross_Elegance device specifications for Android Compose previews.
 *
 * This extension provides Kross_Elegance device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.KrossElegance.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.KrossElegance: Any
  get() = object {
      /** Kross_Elegance KE-TB815 */
      val KE_TB815 = "spec:width=800,height=1280,unit=px,dpi=213"

  }

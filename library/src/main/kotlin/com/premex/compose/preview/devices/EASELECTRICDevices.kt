package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * EAS-ELECTRIC device specifications for Android Compose previews.
 *
 * This extension provides EAS-ELECTRIC device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.EASELECTRIC.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.EASELECTRIC: Any
  get() = object {
      /** EAS-ELECTRIC R1 */
      val R1 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** EAS-ELECTRIC R2 */
      val R2 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }

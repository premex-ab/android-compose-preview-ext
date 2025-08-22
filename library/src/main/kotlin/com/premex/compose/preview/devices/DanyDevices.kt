package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Dany device specifications for Android Compose previews.
 *
 * This extension provides Dany device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Dany.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Dany: Any
  get() = object {
      /** Dany MAXX_05 */
      val MAXX_05 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** Dany Signature-S8 */
      val SIGNATURE_S8 = "spec:width=800,height=1280,unit=px,dpi=213"

  }

package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * EKINOX device specifications for Android Compose previews.
 *
 * This extension provides EKINOX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ekinox.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ekinox: Any
  get() = object {
      /** EKINOX E6 */
      val E6 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** EKINOX E8_Ultra */
      val E8_ULTRA = "spec:width=720,height=1520,unit=px,dpi=320"

      /** EKINOX K5 */
      val K5 = "spec:width=540,height=1132,unit=px,dpi=240"

  }

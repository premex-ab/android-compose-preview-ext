package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Okin device specifications for Android Compose previews.
 *
 * This extension provides Okin device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Okin.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Okin: Any
  get() = object {
      /** Okin FP2901 */
      val FP2901 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Okin FP290101 */
      val FP290101 = "spec:width=600,height=1024,unit=px,dpi=160"

  }

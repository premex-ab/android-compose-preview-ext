package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * meanit device specifications for Android Compose previews.
 *
 * This extension provides meanit device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Meanit.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Meanit: Any
  get() = object {
      /** meanit meanit_K28_EEA */
      val MEANIT_K28_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** meanit meanit_X50_EEA */
      val MEANIT_X50_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

  }

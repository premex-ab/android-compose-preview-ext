package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MeanIT device specifications for Android Compose previews.
 *
 * This extension provides MeanIT device specifications that can be used with @Preview annotations
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
      /** MeanIT meanIT_X4 */
      val MEANIT_X4 = "spec:width=480,height=1014,unit=px,dpi=240"

  }

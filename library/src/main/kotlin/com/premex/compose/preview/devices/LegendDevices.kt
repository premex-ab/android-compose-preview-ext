package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Legend device specifications for Android Compose previews.
 *
 * This extension provides Legend device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Legend.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Legend: Any
  get() = object {
      /** Legend IPF10 */
      val IPF10 = "spec:width=1200,height=1920,unit=px,dpi=240"

  }

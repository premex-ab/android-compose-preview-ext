package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LegendComfortable device specifications for Android Compose previews.
 *
 * This extension provides LegendComfortable device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Legendcomfortable.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Legendcomfortable: Any
  get() = object {
      /** LegendComfortable SEP011037 */
      val SEP011037 = "spec:width=800,height=1280,unit=px,dpi=160"

  }

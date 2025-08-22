package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BQ device specifications for Android Compose previews.
 *
 * This extension provides BQ device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Bq.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Bq: Any
  get() = object {
      /** BQ BQ-6051G */
      val BQ_6051G = "spec:width=720,height=1560,unit=px,dpi=320"

  }

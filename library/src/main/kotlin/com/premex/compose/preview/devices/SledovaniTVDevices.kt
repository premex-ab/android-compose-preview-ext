package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SledovaniTV device specifications for Android Compose previews.
 *
 * This extension provides SledovaniTV device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SledovaniTV.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SledovaniTV: Any
  get() = object {
      /** SledovaniTV DV8220 */
      val DV8220 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }

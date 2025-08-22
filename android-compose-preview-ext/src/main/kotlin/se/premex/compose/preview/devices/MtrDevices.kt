package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * MTR device specifications for Android Compose previews.
 *
 * This extension provides MTR device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mtr.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mtr: Any
  get() = object {
      /** MTR MT9 */
      val MT9 = "spec:width=1080,height=2160,unit=px,dpi=480"

  }

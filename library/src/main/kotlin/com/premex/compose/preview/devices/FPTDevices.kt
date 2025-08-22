package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * FPT device specifications for Android Compose previews.
 *
 * This extension provides FPT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.FPT.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.FPT: Any
  get() = object {
      /** FPT DV8236 */
      val DV8236 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }

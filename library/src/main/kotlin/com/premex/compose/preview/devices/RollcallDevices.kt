package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ROLLCALL device specifications for Android Compose previews.
 *
 * This extension provides ROLLCALL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Rollcall.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Rollcall: Any
  get() = object {
      /** ROLLCALL DT */
      val DT = "spec:width=1080,height=2340,unit=px,dpi=480"

  }

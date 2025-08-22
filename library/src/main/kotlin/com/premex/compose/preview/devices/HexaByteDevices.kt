package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HexaByte device specifications for Android Compose previews.
 *
 * This extension provides HexaByte device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HexaByte.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HexaByte: Any
  get() = object {
      /** HexaByte HB_X7 */
      val HB_X7 = "spec:width=600,height=1024,unit=px,dpi=160"

  }

package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ACEPAD device specifications for Android Compose previews.
 *
 * This extension provides ACEPAD device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ACEPAD.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ACEPAD: Any
  get() = object {
      /** ACEPAD A121 */
      val A121 = "spec:width=800,height=1280,unit=px,dpi=160"

  }

package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * GEAR device specifications for Android Compose previews.
 *
 * This extension provides GEAR device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.GEAR.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.GEAR: Any
  get() = object {
      /** GEAR Space_Pro */
      val SPACE_PRO = "spec:width=1200,height=1920,unit=px,dpi=240"

  }

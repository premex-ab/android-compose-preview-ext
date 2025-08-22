package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * WIZ device specifications for Android Compose previews.
 *
 * This extension provides WIZ device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.WIZ.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.WIZ: Any
  get() = object {
      /** WIZ Arc8 */
      val ARC8 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** WIZ Slate10 */
      val SLATE10 = "spec:width=1200,height=1920,unit=px,dpi=240"

  }

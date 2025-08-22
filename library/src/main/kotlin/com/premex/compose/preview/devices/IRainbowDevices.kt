package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * iRainbow device specifications for Android Compose previews.
 *
 * This extension provides iRainbow device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.IRainbow.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.IRainbow: Any
  get() = object {
      /** iRainbow B12017 */
      val B12017 = "spec:width=800,height=1280,unit=px,dpi=160"

  }

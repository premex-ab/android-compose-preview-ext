package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * WinRo device specifications for Android Compose previews.
 *
 * This extension provides WinRo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.WinRo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.WinRo: Any
  get() = object {
      /** WinRo Voni10 */
      val VONI10 = "spec:width=800,height=1280,unit=px,dpi=160"

  }

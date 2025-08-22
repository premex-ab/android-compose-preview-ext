package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * FUNKER device specifications for Android Compose previews.
 *
 * This extension provides FUNKER device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Funker.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Funker: Any
  get() = object {
      /** FUNKER E500i */
      val E500I = "spec:width=480,height=960,unit=px,dpi=240"

  }

package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BH device specifications for Android Compose previews.
 *
 * This extension provides BH device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.BH.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.BH: Any
  get() = object {
      /** BH STB_B866V2H */
      val STB_B866V2H = "spec:width=720,height=1280,unit=px,dpi=213"

  }

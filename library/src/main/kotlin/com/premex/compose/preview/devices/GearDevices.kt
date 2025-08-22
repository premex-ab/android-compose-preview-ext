package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * gear device specifications for Android Compose previews.
 *
 * This extension provides gear device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Gear.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Gear: Any
  get() = object {
      /** gear Feel_1008S */
      val FEEL_1008S = "spec:width=800,height=1280,unit=px,dpi=160"

  }

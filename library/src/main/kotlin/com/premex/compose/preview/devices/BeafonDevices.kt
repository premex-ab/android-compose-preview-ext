package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * beafon device specifications for Android Compose previews.
 *
 * This extension provides beafon device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Beafon.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Beafon: Any
  get() = object {
      /** beafon TW20_EEA */
      val TW20_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

  }

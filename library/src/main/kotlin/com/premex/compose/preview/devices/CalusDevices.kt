package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CALUS device specifications for Android Compose previews.
 *
 * This extension provides CALUS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Calus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Calus: Any
  get() = object {
      /** CALUS Note_16_Pro */
      val NOTE_16_PRO = "spec:width=720,height=1640,unit=px,dpi=320"

  }

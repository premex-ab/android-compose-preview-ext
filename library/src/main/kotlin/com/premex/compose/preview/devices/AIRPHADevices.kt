package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * AIRPHA device specifications for Android Compose previews.
 *
 * This extension provides AIRPHA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.AIRPHA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.AIRPHA: Any
  get() = object {
      /** AIRPHA Halo4_Pro */
      val HALO4_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

  }

package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * AIS device specifications for Android Compose previews.
 *
 * This extension provides AIS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ais.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ais: Any
  get() = object {
      /** AIS AISPLAYBOX */
      val AISPLAYBOX = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** AIS B866V2-HA */
      val B866V2_HA = "spec:width=1080,height=1920,unit=px,dpi=320"

  }

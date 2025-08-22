package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Beghelli device specifications for Android Compose previews.
 *
 * This extension provides Beghelli device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Beghelli.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Beghelli: Any
  get() = object {
      /** Beghelli SLV_SMARTPHONE_55 */
      val SLV_SMARTPHONE_55 = "spec:width=720,height=1440,unit=px,dpi=360"

  }

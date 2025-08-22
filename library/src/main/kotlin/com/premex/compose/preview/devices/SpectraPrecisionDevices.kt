package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SpectraPrecision device specifications for Android Compose previews.
 *
 * This extension provides SpectraPrecision device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SpectraPrecision.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SpectraPrecision: Any
  get() = object {
      /** SpectraPrecision EE773X_4G */
      val EE773X_4G = "spec:width=720,height=1280,unit=px,dpi=320"

      /** SpectraPrecision EE773X_WiFi */
      val EE773X_WIFI = "spec:width=720,height=1280,unit=px,dpi=320"

  }

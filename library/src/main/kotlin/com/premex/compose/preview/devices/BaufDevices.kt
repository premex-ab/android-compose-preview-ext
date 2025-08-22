package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BAUF device specifications for Android Compose previews.
 *
 * This extension provides BAUF device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Bauf.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Bauf: Any
  get() = object {
      /** BAUF stanford */
      val STANFORD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** BAUF zhongshan */
      val ZHONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }

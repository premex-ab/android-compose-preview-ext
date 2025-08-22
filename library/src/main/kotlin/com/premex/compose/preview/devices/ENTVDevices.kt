package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ENTV device specifications for Android Compose previews.
 *
 * This extension provides ENTV device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ENTV.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ENTV: Any
  get() = object {
      /** ENTV seocho */
      val SEOCHO = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** ENTV shilin */
      val SHILIN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }

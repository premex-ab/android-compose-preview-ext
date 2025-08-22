package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TELSTAR device specifications for Android Compose previews.
 *
 * This extension provides TELSTAR device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Telstar.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Telstar: Any
  get() = object {
      /** TELSTAR capitolhill */
      val CAPITOLHILL = "spec:width=720,height=1280,unit=px,dpi=213"

      /** TELSTAR keoneae */
      val KEONEAE = "spec:width=1080,height=1920,unit=px,dpi=320"

  }

package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ZULEISY device specifications for Android Compose previews.
 *
 * This extension provides ZULEISY device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Zuleisy.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Zuleisy: Any
  get() = object {
      /** ZULEISY E8A */
      val E8A = "spec:width=800,height=1340,unit=px,dpi=213"

  }

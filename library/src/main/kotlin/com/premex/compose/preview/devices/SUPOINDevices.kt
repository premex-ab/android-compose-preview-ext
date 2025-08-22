package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SUPOIN device specifications for Android Compose previews.
 *
 * This extension provides SUPOIN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SUPOIN.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SUPOIN: Any
  get() = object {
      /** SUPOIN S66 */
      val S66 = "spec:width=720,height=1440,unit=px,dpi=320"

  }

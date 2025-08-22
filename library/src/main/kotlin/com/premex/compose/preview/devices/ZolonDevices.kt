package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ZOLON device specifications for Android Compose previews.
 *
 * This extension provides ZOLON device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Zolon.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Zolon: Any
  get() = object {
      /** ZOLON L16XX */
      val L16XX = "spec:width=1080,height=1920,unit=px,dpi=240"

  }

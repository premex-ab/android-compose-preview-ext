package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SCEPTRE device specifications for Android Compose previews.
 *
 * This extension provides SCEPTRE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SCEPTRE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SCEPTRE: Any
  get() = object {
      /** SCEPTRE barking */
      val BARKING = "spec:width=1080,height=1920,unit=px,dpi=320"

  }

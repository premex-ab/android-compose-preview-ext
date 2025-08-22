package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ALPHA device specifications for Android Compose previews.
 *
 * This extension provides ALPHA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ALPHA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ALPHA: Any
  get() = object {
      /** ALPHA hayward */
      val HAYWARD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** ALPHA lushan */
      val LUSHAN = "spec:width=2160,height=3840,unit=px,dpi=320"

  }

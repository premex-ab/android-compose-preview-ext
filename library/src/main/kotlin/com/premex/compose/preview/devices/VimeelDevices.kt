package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * VIMEEL device specifications for Android Compose previews.
 *
 * This extension provides VIMEEL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Vimeel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Vimeel: Any
  get() = object {
      /** VIMEEL lavender */
      val LAVENDER = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** VIMEEL mountbaker */
      val MOUNTBAKER = "spec:width=720,height=1280,unit=px,dpi=213"

  }

package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * JAM device specifications for Android Compose previews.
 *
 * This extension provides JAM device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Jam.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Jam: Any
  get() = object {
      /** JAM hongkong */
      val HONGKONG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** JAM mountbaker */
      val MOUNTBAKER = "spec:width=720,height=1280,unit=px,dpi=213"

  }

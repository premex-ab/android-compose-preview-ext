package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ZIFFLER device specifications for Android Compose previews.
 *
 * This extension provides ZIFFLER device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ziffler.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ziffler: Any
  get() = object {
      /** ZIFFLER shinagawa */
      val SHINAGAWA = "spec:width=720,height=1280,unit=px,dpi=213"

  }

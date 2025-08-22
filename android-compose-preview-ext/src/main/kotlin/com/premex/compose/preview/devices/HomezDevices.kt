package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HOMEZ device specifications for Android Compose previews.
 *
 * This extension provides HOMEZ device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Homez.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Homez: Any
  get() = object {
      /** HOMEZ redwood */
      val REDWOOD = "spec:width=720,height=1280,unit=px,dpi=213"

  }

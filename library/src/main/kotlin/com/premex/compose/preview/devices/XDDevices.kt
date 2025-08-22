package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * XD device specifications for Android Compose previews.
 *
 * This extension provides XD device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.XD.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.XD: Any
  get() = object {
      /** XD martin */
      val MARTIN = "spec:width=720,height=1280,unit=px,dpi=213"

  }

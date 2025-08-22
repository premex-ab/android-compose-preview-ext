package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * handheld device specifications for Android Compose previews.
 *
 * This extension provides handheld device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Handheld.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Handheld: Any
  get() = object {
      /** handheld Nautiz_X9P */
      val NAUTIZ_X9P = "spec:width=720,height=1280,unit=px,dpi=320"

  }

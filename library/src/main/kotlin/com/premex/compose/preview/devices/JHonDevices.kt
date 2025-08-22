package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * jHon device specifications for Android Compose previews.
 *
 * This extension provides jHon device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.JHon.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.JHon: Any
  get() = object {
      /** jHon H800 */
      val H800 = "spec:width=1080,height=1920,unit=px,dpi=240"

  }

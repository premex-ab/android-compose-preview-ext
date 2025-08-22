package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * FourMobile device specifications for Android Compose previews.
 *
 * This extension provides FourMobile device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.FourMobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.FourMobile: Any
  get() = object {
      /** FourMobile S710_Ruby */
      val S710_RUBY = "spec:width=720,height=1280,unit=px,dpi=320"

  }

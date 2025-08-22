package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SunPhone device specifications for Android Compose previews.
 *
 * This extension provides SunPhone device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SunPhone.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SunPhone: Any
  get() = object {
      /** SunPhone L4 */
      val L4 = "spec:width=720,height=1600,unit=px,dpi=320"

  }

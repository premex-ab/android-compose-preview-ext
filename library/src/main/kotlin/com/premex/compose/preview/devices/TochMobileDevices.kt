package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TOCH_MOBILE device specifications for Android Compose previews.
 *
 * This extension provides TOCH_MOBILE device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TochMobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TochMobile: Any
  get() = object {
      /** TOCH_MOBILE ANGEL_SMART */
      val ANGEL_SMART = "spec:width=720,height=1520,unit=px,dpi=320"

  }

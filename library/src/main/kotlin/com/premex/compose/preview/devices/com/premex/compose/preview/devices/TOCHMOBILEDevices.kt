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
 * @Preview(device = Devices.TOCHMOBILE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TOCHMOBILE: Any
  get() = object {
      /** DeviceSpec(manufacturer=TOCH_MOBILE, code=ANGEL_SMART, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TOCH_MOBILE, code=ANGEL_SMART,
      width=720, height=1520, dpi=320, isGoogleDevice=false).code */
      val ANGEL_SMART = "spec:width=720,height=1520,unit=px,dpi=320"

  }

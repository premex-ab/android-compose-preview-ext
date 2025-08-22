package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ModeEarnPhone device specifications for Android Compose previews.
 *
 * This extension provides ModeEarnPhone device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ModeEarnPhone.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ModeEarnPhone: Any
  get() = object {
      /** DeviceSpec(manufacturer=ModeEarnPhone, code=MEP2, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ModeEarnPhone, code=MEP2,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val MEP2 = "spec:width=720,height=1600,unit=px,dpi=320"

  }

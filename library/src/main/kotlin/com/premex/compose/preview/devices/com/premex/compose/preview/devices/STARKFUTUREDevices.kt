package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * STARK_FUTURE device specifications for Android Compose previews.
 *
 * This extension provides STARK_FUTURE device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.STARKFUTURE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.STARKFUTURE: Any
  get() = object {
      /** DeviceSpec(manufacturer=STARK_FUTURE, code=VARG, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STARK_FUTURE, code=VARG, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val VARG = "spec:width=720,height=1440,unit=px,dpi=320"

  }

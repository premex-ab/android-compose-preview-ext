package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Terra device specifications for Android Compose previews.
 *
 * This extension provides Terra device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Terra.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Terra: Any
  get() = object {
      /** DeviceSpec(manufacturer=Terra, code=TERRA_MOBILE_PAD_1200, width=1280, height=1920,
      dpi=240, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Terra,
      code=TERRA_MOBILE_PAD_1200, width=1280, height=1920, dpi=240, isGoogleDevice=false).code */
      val TERRA_MOBILE_PAD_1200 = "spec:width=1280,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Terra, code=TERRA_PAD_1200_V2, width=1280, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Terra, code=TERRA_PAD_1200_V2,
      width=1280, height=1920, dpi=240, isGoogleDevice=false).code */
      val TERRA_PAD_1200_V2 = "spec:width=1280,height=1920,unit=px,dpi=240"

  }

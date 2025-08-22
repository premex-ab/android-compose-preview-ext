package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ITOS device specifications for Android Compose previews.
 *
 * This extension provides ITOS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ITOS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ITOS: Any
  get() = object {
      /** DeviceSpec(manufacturer=ITOS, code=IC_51, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ITOS, code=IC_51, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val IC_51 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ITOS, code=IC_51R, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ITOS, code=IC_51R, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val IC_51R = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ITOS, code=IC_58, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ITOS, code=IC_58, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val IC_58 = "spec:width=720,height=1440,unit=px,dpi=320"

  }

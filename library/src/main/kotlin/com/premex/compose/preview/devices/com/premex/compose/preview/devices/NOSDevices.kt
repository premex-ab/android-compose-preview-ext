package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * NOS device specifications for Android Compose previews.
 *
 * This extension provides NOS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.NOS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.NOS: Any
  get() = object {
      /** DeviceSpec(manufacturer=NOS, code=DV9161-KPN, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NOS, code=DV9161-KPN, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val DV9161_KPN = "spec:width=720,height=1280,unit=px,dpi=320"

  }

package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * mobell device specifications for Android Compose previews.
 *
 * This extension provides mobell device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mobell.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mobell: Any
  get() = object {
      /** DeviceSpec(manufacturer=mobell, code=MBLTab81, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=mobell, code=MBLTab81, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val MBLTAB81 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=mobell, code=NOVA_P3, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=mobell, code=NOVA_P3, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val NOVA_P3 = "spec:width=720,height=1280,unit=px,dpi=320"

  }

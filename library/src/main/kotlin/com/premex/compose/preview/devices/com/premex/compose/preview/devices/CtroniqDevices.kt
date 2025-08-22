package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Ctroniq device specifications for Android Compose previews.
 *
 * This extension provides Ctroniq device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ctroniq.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ctroniq: Any
  get() = object {
      /** DeviceSpec(manufacturer=Ctroniq, code=SNOOK-X10, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Ctroniq, code=SNOOK-X10, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val SNOOK_X10 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Ctroniq, code=SNOOK-X75, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Ctroniq, code=SNOOK-X75, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val SNOOK_X75 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Ctroniq, code=SNOOK-X80, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Ctroniq, code=SNOOK-X80, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val SNOOK_X80 = "spec:width=800,height=1280,unit=px,dpi=213"

  }

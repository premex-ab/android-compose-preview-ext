package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Qlink device specifications for Android Compose previews.
 *
 * This extension provides Qlink device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Qlink.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Qlink: Any
  get() = object {
      /** DeviceSpec(manufacturer=Qlink, code=Scepter8, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Qlink, code=Scepter8, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val SCEPTER8 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Qlink, code=Scepter8_tablet, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Qlink, code=Scepter8_tablet,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val SCEPTER8_TABLET = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Qlink, code=Scepter_8, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Qlink, code=Scepter_8, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val SCEPTER_8 = "spec:width=800,height=1280,unit=px,dpi=213"

  }

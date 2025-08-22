package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * NOGA device specifications for Android Compose previews.
 *
 * This extension provides NOGA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.NOGA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.NOGA: Any
  get() = object {
      /** DeviceSpec(manufacturer=NOGA, code=NOGA101GHD, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NOGA, code=NOGA101GHD, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val NOGA101GHD = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=NOGA, code=NOGA7G, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NOGA, code=NOGA7G, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val NOGA7G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=NOGA, code=NOGAPAD101GHD, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NOGA, code=NOGAPAD101GHD,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val NOGAPAD101GHD = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=NOGA, code=NOGAPAD101XTREME, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NOGA, code=NOGAPAD101XTREME,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val NOGAPAD101XTREME = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=NOGA, code=NOGAPAD7G, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NOGA, code=NOGAPAD7G, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val NOGAPAD7G = "spec:width=600,height=1024,unit=px,dpi=160"

  }

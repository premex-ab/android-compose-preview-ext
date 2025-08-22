package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Wishtel device specifications for Android Compose previews.
 *
 * This extension provides Wishtel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Wishtel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Wishtel: Any
  get() = object {
      /** DeviceSpec(manufacturer=Wishtel, code=IRA, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Wishtel, code=IRA, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val IRA = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Wishtel, code=IRA07, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Wishtel, code=IRA07, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val IRA07 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Wishtel, code=IRA102017I, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Wishtel, code=IRA102017I,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val IRA102017I = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Wishtel, code=IRAJ2, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Wishtel, code=IRAJ2, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val IRAJ2 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Wishtel, code=IRAW7258, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Wishtel, code=IRAW7258, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val IRAW7258 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Wishtel, code=IRAW801, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Wishtel, code=IRAW801, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val IRAW801 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Wishtel, code=IRAW801I, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Wishtel, code=IRAW801I, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val IRAW801I = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Wishtel, code=IRA_DUO, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Wishtel, code=IRA_DUO, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val IRA_DUO = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Wishtel, code=T811, width=1200, height=1920, dpi=360,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Wishtel, code=T811, width=1200,
      height=1920, dpi=360, isGoogleDevice=false).code */
      val T811 = "spec:width=1200,height=1920,unit=px,dpi=360"

  }

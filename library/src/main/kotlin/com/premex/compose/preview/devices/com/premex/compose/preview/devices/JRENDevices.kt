package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * JREN device specifications for Android Compose previews.
 *
 * This extension provides JREN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.JREN.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.JREN: Any
  get() = object {
      /** DeviceSpec(manufacturer=JREN, code=J10, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JREN, code=J10, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val J10 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=JREN, code=J10PLUS, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JREN, code=J10PLUS, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val J10PLUS = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=JREN, code=J10PRO, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JREN, code=J10PRO, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val J10PRO = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=JREN, code=J11, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JREN, code=J11, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val J11 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=JREN, code=J11PLUS, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JREN, code=J11PLUS, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val J11PLUS = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=JREN, code=JR-802, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JREN, code=JR-802, width=800,
      height=1280, dpi=200, isGoogleDevice=false).code */
      val JR_802 = "spec:width=800,height=1280,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=JREN, code=JR_J1063, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JREN, code=JR_J1063, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val JR_J1063 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=JREN, code=JR-J10A, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JREN, code=JR-J10A, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val JR_J10A = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=JREN, code=JR_J7, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JREN, code=JR_J7, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val JR_J7 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=JREN, code=JR-J71, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JREN, code=JR-J71, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val JR_J71 = "spec:width=800,height=1280,unit=px,dpi=160"

  }

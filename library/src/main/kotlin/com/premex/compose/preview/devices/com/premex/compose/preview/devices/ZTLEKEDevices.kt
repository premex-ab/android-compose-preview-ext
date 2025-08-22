package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ZTLEKE device specifications for Android Compose previews.
 *
 * This extension provides ZTLEKE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ZTLEKE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ZTLEKE: Any
  get() = object {
      /** DeviceSpec(manufacturer=ZTLEKE, code=P10, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTLEKE, code=P10, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val P10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ZTLEKE, code=P10MAX, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTLEKE, code=P10MAX, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val P10MAX = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ZTLEKE, code=P10PRO, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTLEKE, code=P10PRO, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val P10PRO = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ZTLEKE, code=S8Plus, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTLEKE, code=S8Plus, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val S8PLUS = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ZTLEKE, code=S8Plus2, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTLEKE, code=S8Plus2, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val S8PLUS2 = "spec:width=800,height=1280,unit=px,dpi=160"

  }

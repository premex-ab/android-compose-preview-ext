package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Hamlet device specifications for Android Compose previews.
 *
 * This extension provides Hamlet device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Hamlet.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Hamlet: Any
  get() = object {
      /** DeviceSpec(manufacturer=Hamlet, code=XZPAD412LTE, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hamlet, code=XZPAD412LTE,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val XZPAD412LTE = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Hamlet, code=XZPAD412W, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hamlet, code=XZPAD412W, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val XZPAD412W = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Hamlet, code=XZPAD414W, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hamlet, code=XZPAD414W, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val XZPAD414W = "spec:width=800,height=1280,unit=px,dpi=160"

  }

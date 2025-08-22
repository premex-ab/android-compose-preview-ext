package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Moolah_Mobile device specifications for Android Compose previews.
 *
 * This extension provides Moolah_Mobile device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MoolahMobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MoolahMobile: Any
  get() = object {
      /** DeviceSpec(manufacturer=Moolah_Mobile, code=T10, width=800, height=1280, dpi=186,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Moolah_Mobile, code=T10, width=800,
      height=1280, dpi=186, isGoogleDevice=false).code */
      val T10 = "spec:width=800,height=1280,unit=px,dpi=186"

      /** DeviceSpec(manufacturer=Moolah_Mobile, code=T100, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Moolah_Mobile, code=T100,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val T100 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Moolah_Mobile, code=T10_Pro, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Moolah_Mobile, code=T10_Pro,
      width=800, height=1280, dpi=200, isGoogleDevice=false).code */
      val T10_PRO = "spec:width=800,height=1280,unit=px,dpi=200"

  }

package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * UAUU device specifications for Android Compose previews.
 *
 * This extension provides UAUU device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.UAUU.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.UAUU: Any
  get() = object {
      /** DeviceSpec(manufacturer=UAUU, code=M10, width=1536, height=2048, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UAUU, code=M10, width=1536,
      height=2048, dpi=240, isGoogleDevice=false).code */
      val M10 = "spec:width=1536,height=2048,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=UAUU, code=T30, width=1200, height=1920, dpi=304,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UAUU, code=T30, width=1200,
      height=1920, dpi=304, isGoogleDevice=false).code */
      val T30 = "spec:width=1200,height=1920,unit=px,dpi=304"

      /** DeviceSpec(manufacturer=UAUU, code=T30Pro, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UAUU, code=T30Pro, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val T30PRO = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=UAUU, code=T60, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UAUU, code=T60, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val T60 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=UAUU, code=T90_NEW, width=1200, height=1920, dpi=272,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UAUU, code=T90_NEW, width=1200,
      height=1920, dpi=272, isGoogleDevice=false).code */
      val T90_NEW = "spec:width=1200,height=1920,unit=px,dpi=272"

      /** DeviceSpec(manufacturer=UAUU, code=U10, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UAUU, code=U10, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val U10 = "spec:width=800,height=1280,unit=px,dpi=160"

  }

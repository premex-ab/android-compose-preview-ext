package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ZOOMSMART device specifications for Android Compose previews.
 *
 * This extension provides ZOOMSMART device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ZOOMSMART.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ZOOMSMART: Any
  get() = object {
      /** DeviceSpec(manufacturer=ZOOMSMART, code=LT600T, width=1200, height=1920, dpi=360,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZOOMSMART, code=LT600T, width=1200,
      height=1920, dpi=360, isGoogleDevice=false).code */
      val LT600T = "spec:width=1200,height=1920,unit=px,dpi=360"

      /** DeviceSpec(manufacturer=ZOOMSMART, code=LT800, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZOOMSMART, code=LT800, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val LT800 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZOOMSMART, code=ZM800, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZOOMSMART, code=ZM800, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val ZM800 = "spec:width=800,height=1280,unit=px,dpi=240"

  }

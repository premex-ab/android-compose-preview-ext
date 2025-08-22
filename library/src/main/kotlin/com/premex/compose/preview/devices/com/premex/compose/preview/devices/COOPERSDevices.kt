package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * COOPERS device specifications for Android Compose previews.
 *
 * This extension provides COOPERS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.COOPERS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.COOPERS: Any
  get() = object {
      /** DeviceSpec(manufacturer=COOPERS, code=CP10, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=COOPERS, code=CP10, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val CP10 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=COOPERS, code=CP20, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=COOPERS, code=CP20, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val CP20 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=COOPERS, code=CP70K, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=COOPERS, code=CP70K, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val CP70K = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=COOPERS, code=CP80, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=COOPERS, code=CP80, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val CP80 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=COOPERS, code=CP81, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=COOPERS, code=CP81, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val CP81 = "spec:width=800,height=1280,unit=px,dpi=180"

  }

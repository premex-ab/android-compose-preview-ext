package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ERGO device specifications for Android Compose previews.
 *
 * This extension provides ERGO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ERGO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ERGO: Any
  get() = object {
      /** DeviceSpec(manufacturer=ERGO, code=B502_Basic, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ERGO, code=B502_Basic, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val B502_BASIC = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ERGO, code=byculla, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ERGO, code=byculla, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val BYCULLA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ERGO, code=longshan, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ERGO, code=longshan, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val LONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ERGO, code=redwood, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ERGO, code=redwood, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val REDWOOD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ERGO, code=SW6H, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ERGO, code=SW6H, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SW6H = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ERGO, code=V540_Level, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ERGO, code=V540_Level, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val V540_LEVEL = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ERGO, code=V550_Vision, width=640, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ERGO, code=V550_Vision, width=640,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val V550_VISION = "spec:width=640,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ERGO, code=V551_Aura, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ERGO, code=V551_Aura, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val V551_AURA = "spec:width=480,height=960,unit=px,dpi=240"

  }

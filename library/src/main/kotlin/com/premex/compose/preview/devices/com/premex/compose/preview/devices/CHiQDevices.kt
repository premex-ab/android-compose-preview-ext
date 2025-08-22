package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CHiQ device specifications for Android Compose previews.
 *
 * This extension provides CHiQ device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.CHiQ.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.CHiQ: Any
  get() = object {
      /** DeviceSpec(manufacturer=CHiQ, code=dundas, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CHiQ, code=dundas, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val DUNDAS = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CHiQ, code=longshan, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CHiQ, code=longshan, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val LONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CHiQ, code=redwood, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CHiQ, code=redwood, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val REDWOOD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=CHiQ, code=samseong, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CHiQ, code=samseong, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SAMSEONG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CHiQ, code=sindorim, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CHiQ, code=sindorim, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SINDORIM = "spec:width=1080,height=1920,unit=px,dpi=320"

  }

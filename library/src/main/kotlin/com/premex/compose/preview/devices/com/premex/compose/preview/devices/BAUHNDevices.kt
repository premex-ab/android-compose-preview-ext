package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BAUHN device specifications for Android Compose previews.
 *
 * This extension provides BAUHN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.BAUHN.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.BAUHN: Any
  get() = object {
      /** DeviceSpec(manufacturer=BAUHN, code=ATAB10-1224, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BAUHN, code=ATAB10-1224, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val ATAB10_1224 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=BAUHN, code=ATAB7-0125, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BAUHN, code=ATAB7-0125, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val ATAB7_0125 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=BAUHN, code=bangbae, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BAUHN, code=bangbae, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val BANGBAE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BAUHN, code=gangbyeon, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BAUHN, code=gangbyeon, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val GANGBYEON = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BAUHN, code=komagome, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BAUHN, code=komagome, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val KOMAGOME = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=BAUHN, code=longshan, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BAUHN, code=longshan, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val LONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BAUHN, code=redwood, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BAUHN, code=redwood, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val REDWOOD = "spec:width=720,height=1280,unit=px,dpi=213"

  }

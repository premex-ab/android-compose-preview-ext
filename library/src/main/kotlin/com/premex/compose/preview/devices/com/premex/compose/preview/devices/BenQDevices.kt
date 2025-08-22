package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BenQ device specifications for Android Compose previews.
 *
 * This extension provides BenQ device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.BenQ.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.BenQ: Any
  get() = object {
      /** DeviceSpec(manufacturer=BenQ, code=himalaya, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BenQ, code=himalaya, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val HIMALAYA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BenQ, code=ikebukuro, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BenQ, code=ikebukuro, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val IKEBUKURO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=BenQ, code=longshan, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BenQ, code=longshan, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val LONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BenQ, code=RE04N_series, width=2160, height=3840, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BenQ, code=RE04N_series,
      width=2160, height=3840, dpi=480, isGoogleDevice=false).code */
      val RE04N_SERIES = "spec:width=2160,height=3840,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=BenQ, code=RE04_series, width=2160, height=3840, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BenQ, code=RE04_series, width=2160,
      height=3840, dpi=480, isGoogleDevice=false).code */
      val RE04_SERIES = "spec:width=2160,height=3840,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=BenQ, code=redwood, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BenQ, code=redwood, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val REDWOOD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=BenQ, code=RM6504, width=2160, height=3840, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BenQ, code=RM6504, width=2160,
      height=3840, dpi=480, isGoogleDevice=false).code */
      val RM6504 = "spec:width=2160,height=3840,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=BenQ, code=RM7504, width=2160, height=3840, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BenQ, code=RM7504, width=2160,
      height=3840, dpi=480, isGoogleDevice=false).code */
      val RM7504 = "spec:width=2160,height=3840,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=BenQ, code=RM8604, width=2160, height=3840, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BenQ, code=RM8604, width=2160,
      height=3840, dpi=480, isGoogleDevice=false).code */
      val RM8604 = "spec:width=2160,height=3840,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=BenQ, code=RP6504, width=2160, height=3840, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BenQ, code=RP6504, width=2160,
      height=3840, dpi=480, isGoogleDevice=false).code */
      val RP6504 = "spec:width=2160,height=3840,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=BenQ, code=RP7504, width=2160, height=3840, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BenQ, code=RP7504, width=2160,
      height=3840, dpi=480, isGoogleDevice=false).code */
      val RP7504 = "spec:width=2160,height=3840,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=BenQ, code=RP8604, width=2160, height=3840, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BenQ, code=RP8604, width=2160,
      height=3840, dpi=480, isGoogleDevice=false).code */
      val RP8604 = "spec:width=2160,height=3840,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=BenQ, code=S905Y2, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BenQ, code=S905Y2, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val S905Y2 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BenQ, code=samseong, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BenQ, code=samseong, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SAMSEONG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BenQ, code=YUL, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BenQ, code=YUL, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val YUL = "spec:width=1080,height=1920,unit=px,dpi=320"

  }

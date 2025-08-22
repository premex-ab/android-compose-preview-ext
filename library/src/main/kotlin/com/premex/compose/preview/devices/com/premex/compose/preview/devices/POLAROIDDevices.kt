package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * POLAROID device specifications for Android Compose previews.
 *
 * This extension provides POLAROID device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.POLAROID.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.POLAROID: Any
  get() = object {
      /** DeviceSpec(manufacturer=POLAROID, code=BDL424, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POLAROID, code=BDL424, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val BDL424 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=POLAROID, code=GMP, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POLAROID, code=GMP, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val GMP = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=POLAROID, code=MID4G64PR002, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POLAROID, code=MID4G64PR002,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val MID4G64PR002 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=POLAROID, code=MIDS2410PR001, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POLAROID, code=MIDS2410PR001,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val MIDS2410PR001 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=POLAROID, code=R1, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POLAROID, code=R1, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val R1 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=POLAROID, code=R2, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POLAROID, code=R2, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val R2 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=POLAROID, code=redwood, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POLAROID, code=redwood, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val REDWOOD = "spec:width=720,height=1280,unit=px,dpi=213"

  }
